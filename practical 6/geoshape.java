import java.util.*;
abstract class shape {
	int d1,d2;
	abstract void area(int d1 , int d2);
}
class triangle extends shape{
	int base,height,area;
	triangle(){
		base = 0;
		height = 0;
		area = 0;
}
	void set(int b, int h){
		base = b;
		height = h;
}
	void area(int base,int height){
		area = (base*height)/2;
		System.out.println("Triangle Area = " +area);
}
}
class rectangle extends shape{
	int length,breadth,area;
	rectangle(){
		length = 0;
		breadth = 0;
		area = 0;
}
	void set(int l, int b){
		length = l;
		breadth = b;
}
	void area(int length, int breadth){
		area = (length*breadth);
		System.out.println("Rectangle area = " +area);
}
}
public class geoshape{
	public static void main(String args[]){
		int a,b,c,d;
		Scanner AB = new Scanner(System.in);
		System.out.println("Enter values for triangle");
		a = AB.nextInt();
		b = AB.nextInt();
		System.out.println("Enter values for rectangle");
		c = AB.nextInt();
		d = AB.nextInt();
		triangle t1 = new triangle();
		rectangle r1 = new rectangle();
		t1.set(a,b);
		t1.area(a,b);
		r1.set(c,d);
		r1.area(c,d);
}
}