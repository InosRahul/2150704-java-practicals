
interface Transport
{
	void Deliever();
}
abstract class Animal
{
	abstract void Aname();
}
class Tiger extends Animal
{
	void Aname()
	{
		System.out.println("2nd Animal name:Tiger");
	}
}
class Camel extends Animal implements Transport
{
	public void Aname()
	{
		System.out.println("1st Animal name:Camel");
	}
	public void Deliever()
	{
		System.out.println("Camel is delivered");
	}
}
class Donkey extends Animal implements Transport
{
	public void Aname()
	{
		System.out.println("3rd Animal name:Donkey");
	}
	public void Deliever()
	{
		System.out.println("Donkey is delivered");
	}
}
class Deer extends Animal
{
	void Aname()
	{
		System.out.println("4th Animal name:Deer");
	}
}
class Inter
{
	public static void main(String args[])
	{
		Transport Trans;
		Tiger T=new Tiger();
		Camel C=new Camel();
		Donkey D=new Donkey();
		Deer D1=new Deer();
		Trans=D;
		D.Aname();
		Trans.Deliever();
		Trans=C;
		C.Aname();
		Trans.Deliever();
		T.Aname();
		D1.Aname();
	}
}













