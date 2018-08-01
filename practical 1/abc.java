import java.util.*;
class inpt
{
	float s1[]= new float [6];
	float n,sum=0;
	void inp()
{
	Scanner value= new Scanner(System.in);
	System.out.println("No of Subjects you want to enter marks for:");
	n=value.nextFloat();
	if(n!=6)
	{
	System.out.println("ERROR");
	}
	else
	{
	System.out.println("Enter Marks of Subjects:");
	for(int i=0;i<n;i++)
	{
	s1[i]=value.nextFloat();
	}	
	}
}


	void marks()
	{
	float sum=0,per;
	for(int i=0;i<6;i++)
	{
	sum=sum+s1[i];
	}
	per=sum/6;
	System.out.println("Percent=" +per);
	}

}

class abc
{
	public static void main(String args[])
	{
	float a;
	inpt ABC= new inpt();
	ABC.inp();
	ABC.marks();
	
	}
}