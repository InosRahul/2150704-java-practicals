import java.util.*;

abstract class Figure{
	double dim1,dim2;
	
	Figure(double x, double y){
		dim1 = x;
		dim2 = y;
	}
	abstract double area();
}

class Rectangle extends Figure{
	Rectangle(double x, double y){
		super(x,y);
	}
	double area(){
		System.out.println("Rectangle area:");
		return dim1*dim2;
	}
}

class Triangle extends Figure{
	Triangle(double x, double y){
		super(x,y);
	}
	double area(){
		System.out.println("Triangle area:");
		return (dim1*dim2)/2;
	}
}

class abs{
	public static void main(String args[]){
		Rectangle r1 = new Rectangle(10,12);
		Triangle t1 = new Triangle(10,12);
		
		Figure f1;
		f1 = r1;
		System.out.println(+f1.area());
		
		f1 = t1;
		System.out.println(+f1.area());
	}
}