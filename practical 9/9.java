class CustomException extends Exception
{
	String name;
	CustomException(String S)
	{
		name=S;
	}
	public String toString()
	{
		return "Negative number";
	}
}
class exceptionpractical
{
	static void check(int n) throws CustomException
	{
		if(n<0)
		throw new CustomException("Exception");
		else
		System.out.println("Done");
	}
	public static void main(String args[])
	{
		int i=Integer.parseInt(args[0]);
		try
		{
			check(i);
		}
		catch(CustomException e)
		{
			System.out.println(e);
		}
	}
}














