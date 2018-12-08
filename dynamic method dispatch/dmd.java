class A{
	void callme(){
		System.out.println("Inside A method.");
	}
}
class B extends A{
	void callme(){
		System.out.println("Inside B method.");
	}
}
class C extends A{
	void callme(){
		System.out.println("Inside C method.");
	}
}

class dmd{
	public static void main(String args[]){
		A a = new A();
		B b = new B();
		C c = new C();
		A ref; // reference variable of class A
		
		ref = a; // ref referes to an A object
		ref.callme(); //calls A's version of callme
		
		ref = b;
		ref.callme();
		
		ref = c;
		ref.callme();
	}
}