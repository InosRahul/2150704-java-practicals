import java.util.*;
class handleerror{
	public static void main(String args[]){
	int	a = 0, b = 0, c = 0;
	Random r = new Random();
	
		for (int i=0; i<100; i++){
			try{
				b = r.nextInt();
				c = r.nextInt();
				a = 100 / (b/c);
			}
			catch (Exception e){
				System.out.println("Div by zero." +e);
				a = 0;
			}
			System.out.println("a:" +a);
		}
	}
}