import java.util.*;


class input{
	String abc = "";
	void set(String a){
		abc = a;
		}
	void get(){
		System.out.println(" " +abc);
}
}


class pattern2{
	public static void main(String args[]){
		String s1,s2="";
		int i,j,k=50;
		input a1 = new input();
		Scanner AB = new Scanner(System.in);
		s1 = AB.nextLine();
		a1.set(s1);
		
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