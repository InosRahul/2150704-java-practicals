import java.io.FileInputStream;
import java.io.FileOutputStream;
class Studentinfo {
public static void main(String[] args) {
System.out.println("	");
System.out.println("-------Writing Data in File-------");
System.out.println("	");
try {
FileOutputStream fout = new FileOutputStream("studentinfo.txt");
String str = "Name : Rahul Soni, Branch :IT, Sem :5th Sem";
byte b[] = str.getBytes();
fout.write(b);
fout.close();
  System.out.println("	");
  System.out.println("successful write.");
} 
catch (Exception e) 
{
	System.out.println();
}
System.out.println("	");
System.out.println("-------Retrive Data From File-------");
try {
FileInputStream fin = new FileInputStream("studentinfo.txt"); int i = 0;
System.out.println("	");
while ((i = fin.read()) != -1)
 {
System.out.print((char) i);
 }
fin.close();
}
 catch (Exception e)
 {
		System.out.println();
}	
}
}
 














