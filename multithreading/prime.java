class newthread implements Runnable{
	String n1;
	Thread t;
	int num = 0, i=0;
	int count, count1;
	
	
	newthread(String name){
		n1 = name;
		//t = new Thread(this, n1);
		System.out.println("Creating " +n1);
		//System.out.println("New thread:" +t);
		//t.start();
	}
	public void run(){
		System.out.println("Running " +n1);
		try{
		for(int i = 1; i <=100 ; i++ ){
			int count = 0;
			for (int j = i; j>= 1; j--){
			if (i % j == 0) 
				 count++;
			 }
			  if (count == 2)
			System.out.println("Prime numbers are " +i);
		}
			
	}
		catch (Exception e){
			System.out.println("Thread " + n1 + " interrupted");
		}
		t.interrupt();
		 
		
			//System.out.println("Non Prime" +count);
		
	}
	
	public void start(){
		System.out.println("Starting " +n1);
		if(t==null){
			t = new Thread(this,n1);
			t.start();
		}
	}
}
class prime {
	public static void main(String args[]){
		newthread r1 = new newthread("one");
		r1.start();
		//r1.sleep(100);
		newthread r2 = new newthread("two");
		r2.start();
	}
}