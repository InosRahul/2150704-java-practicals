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

class quit{
	public static void main(String args[]){
		String s1,s2;
		int i,count=0,count1=0;
		input a1 = new input();
		Scanner AB = new Scanner(System.in);
		s1 = AB.nextLine();
		a1.set(s1);
	
		while(AB.hasNext()){
			s2 = AB.nextLine();
		if(s2.equalsIgnoreCase("quit"))
		break;
		s1 = s1+s2;
}
		System.out.println("Ans: " +s1);
		for(i=0;i<s1.length();i++){
		if(s1.charAt(i)=='a' || s1.charAt(i) == 'e'|| s1.charAt(i) == 'i'|| s1.charAt(i) == 'o'|| s1.charAt(i) == 'u'|| s1.charAt(i) == 'A'|| s1.charAt(i) == 'E'|| s1.charAt(i) == 'I'|| s1.charAt(i) == 'O'|| s1.charAt(i) == 'U'){
			count++;
			System.out.println("Vowels are " +s1.charAt(i));
			System.out.println("Number of vowels " +count);

}
		else{
			count1++;
			System.out.println("Consonants are " +s1.charAt(i));
			System.out.println("Number of consonants are " +count1);
}
}
}
}