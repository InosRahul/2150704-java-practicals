import java.util.*;

public class javaprogram{
	public static void main(String args[]){
		
		int a,b,res;
		char ch;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first number" );
		a = scan.nextInt();
		System.out.println("Enter second number");
		b = scan.nextInt();
		System.out.println("Enter operator (+,-,*,/)");
		ch = scan.next().charAt(0);
		
		if(ch == '+'){
			
			res = a+b;
			System.out.println("Addition = " +res);
		}
		else if(ch == '-'){
			
			res = a-b;
			System.out.println("Subtraction =" +res);
		}
		else if(ch == '*'){
			
			res = a*b;
			System.out.println("Multiplication =" +res);
		}
		else if(ch == '/'){
			res = a/b;
			System.out.println("Division = " +res);
			
		}
		else{
			
			System.out.println("Wrong operator");
		}
			
			
		
	}
		
	
}