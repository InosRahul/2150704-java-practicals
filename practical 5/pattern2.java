import java.util.*;
class pattern2{
	public static void main(String args[]){
		int a1;
		String s1="",s2="";
		int i,j,k=50;
	
		Scanner AB = new Scanner(System.in);
		System.out.println("Enter number:");
		a1 = AB.nextInt();
		for(i=0;i<a1;i++){
			s1 = s1 + "*";
		}
		for(i=0;i<s1.length();i++){
			for(j=0;j<k;j++){
				System.out.print(" ");
}
			k=k-1;

			for(j=0;j!=i+1;j++){
				System.out.print(" "+s1.charAt(j));
}
			System.out.println();

}

k=52-s1.length();
		for(i=s1.length();i!=0;i--){
			for(j=0;j!=k;j++){
				System.out.print(" ");
}
			k=k+1;

			for(j=i-1;j!=0;j--){
				System.out.print(" "+s1.charAt(j));
}
			System.out.println();

}
}
}