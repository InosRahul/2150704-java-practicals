import java.util.*;

class input{
	String name = "";
	void set(String a){
		name = a;
}
	void get(){
		System.out.println(" " +name);
}			
}
class palindrome {
		public static void main(String args[]){
		String s1,s2;
		int i;
		input a1 = new input();
		Scanner AB = new Scanner(System.in);
		s1 = AB.nextLine();
		a1.set(s1);
		a1.get();
		s2 = "";
		for(i=s1.length()-1;i>=0;i--){
			s2 = s2+s1.charAt(i);
}
		if(s2.equalsIgnoreCase(s1)){
			System.out.println("Palindrome");
}
		else{
			System.out.println("Not Palindrome");
}	
}
}