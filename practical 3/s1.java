import java.util.*;
class s1{
	public static void main(String args[]){
		int i;
		String a;
		Scanner AB = new Scanner(System.in);
		a = AB.nextLine();
		System.out.println(" " +a);
		for(i=0;i<a.length();i++){
		if(a.charAt(i)=='a' || a.charAt(i) == 'e'|| a.charAt(i) == 'i'|| a.charAt(i) == 'o'|| a.charAt(i) == 'u'|| a.charAt(i) == 'A'|| a.charAt(i) == 'E'|| a.charAt(i) == 'I'|| a.charAt(i) == 'O'|| a.charAt(i) == 'U'){
			System.out.println("Vowels are " +a.charAt(i));

}
		else{
			System.out.println("Consonants are " +a.charAt(i));
}
}
}
	
}