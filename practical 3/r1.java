import java.util.*;
class r1{
	public static void main(String args[]){
		int i,word=0,space=0;
		String a;
		Scanner AB = new Scanner(System.in);
		a = AB.nextLine();
		System.out.println(" " +a);
		for(i=0;i<a.length();i++){
			char ch = a.charAt(i);
				if(ch == 32){
					space++;
}
				if (Character.isUpperCase(ch)
                    && (i == 0 || Character.isWhitespace(a.charAt(i - 1)))) {
                word++;
}
			}
		System.out.println("Total capital words" +word);
		System.out.println("Total spaces" +space);	
}
}