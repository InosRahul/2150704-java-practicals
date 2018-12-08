import java.util.*;
class bubble{
	public static void main(String args[]){
		int i,j,temp = 0,a[];
		a = new int[5];
		System.out.println("Enter 5 numbers:");
		Scanner AB = new Scanner(System.in);
		for(i=0;i<5;i++){
			a[i] = AB.nextInt();
		}
		for(i=0;i<5;i++){
		for(j=0;j<5-i-1;j++){
			if(a[j]>a[j+1]){
				temp = a[j];
				a[j] = a[j+1];
				a[j+1] = temp;
			}
			
		}
	}
		for(j=0;j<5;j++){
			System.out.println(" " +a[j]);
		}
	}
}