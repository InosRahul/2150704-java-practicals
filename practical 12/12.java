import java.io.*;
class Studentinfo
{
	public static void main(String args[]) throws IOException
{ DataInputStream dataIS = new DataInputStream(new FileInputStream("studentinfo.txt"));	
DataOutputStream dataOS = new DataOutputStream(new FileOutputStream("newstudentinfo.txt"));
String str;
while ((str = dataIS.readLine()) != null) 
{
	 String upper = str.toUpperCase();
 	System.out.println(upper); 
	dataOS.writeBytes(upper + " ,");
}
dataIS.close();
dataOS.close();
}
}















