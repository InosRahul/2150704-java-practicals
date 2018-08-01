import java.util.*;
public class Cla
{
public static void main(String[] args)
{
int a,b;
float res;
Scanner scan=new Scanner(System.in);
System.out.print("enter the value of a");
a=scan.nextInt();
System.out.println("enter the value of b");
b=scan.nextInt();
res=a+b;
System.out.println("addition=="+res);
res=a-b;
System.out.println("subtraction=="+res);
res=a*b;
System.out.println("multiplication=="+res);
res=(float)a/(float)b;
System.out.println("division=="+res);
}
}