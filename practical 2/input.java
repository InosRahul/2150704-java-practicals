import java.util.*;

class s1{
	String abc;
	
void set(String a){
	abc = a;
}
void get(){
	System.out.println(" " +abc);
}
void display(){
	System.out.println(" " +abc);
}
}

class input{
	public static void main(String args[]){
		int i;
		String a;
		
		s1 X1 = new s1();
		Scanner AB = new Scanner(System.in);
		a = AB.nextLine();
		X1.set(a);
		X1.get();
		X1.display();
		int l = a.length();
		char def[] = new char[a.length()];
		System.out.println("Length is = " +l);
		System.out.println("Half of string is :" +a.substring(l/2));
		a.getChars(0, a.length(),def,0);
		for(i=a.length()/2;i<a.length();i++){
		System.out.print(" "+def[i]);
}
char x[] = a.toCharArray();
for(i=x.length/2;i<x.length;i++){
		System.out.println(" "+x[i]);
}
}
}