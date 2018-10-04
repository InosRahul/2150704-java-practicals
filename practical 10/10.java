class MultiThread implements Runnable
{
	Thread t;
	String s;
	MultiThread(String s){
		this.s=s;
		t=new Thread(this,s);
		System.out.println(t);
		t.start();
	}
	public void run(){	for(int i=1;i<20;i++){
			if(s.equalsIgnoreCase("odd") && i%2!=0){
				System.out.println(i);
			}
			else if(s.equalsIgnoreCase("even") && i%2==0){
				System.out.println(i);
			}
		}
	}
}
class Threadpractical
{
	public static void main(String args[]){
		new MultiThread("odd");
		new MultiThread("even");
	}
}













