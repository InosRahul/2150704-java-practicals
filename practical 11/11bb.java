import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
class Studentinfo {
public static void main(String[] argv) throws Exception {
System.out.println("	");
BufferedReader bufRead = new BufferedReader(new FileReader("studentinfo.txt"));
BufferedWriter bufWrite = new BufferedWriter(new FileWriter("newstudentinfo.txt"));
int i;
do {
i = bufRead.read();
if (i != -1) {
if (Character.isUpperCase((char) i)) { bufWrite.write(Character.toLowerCase((char) i));
} else { bufWrite.write((char) i);
}
}
} while (i != -1); bufRead.close(); bufWrite.close();
}
}



















