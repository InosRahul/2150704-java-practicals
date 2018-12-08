import java.util.*;
class Figure{
	double dim1,dim2;

Figure(double x, double y){
	dim1 = x;
	dim2 = y;
	}
double area(){
	System.out.println("Area for figure not defined.");
	return 0;
	}
}

class Triangle extends Figure{
	Triangle(double a, double b){
	super(a,b);
	}
	
	double area(){
		System.out.println("Area of Triangle is:");
		return (dim1*dim2)/2;
	}
}

class Rectangle extends Figure{
	Rectangle(double a , double b){
		super(a,b);
	}
	double area(){
		System.out.println("Area of Rectangle is:");
		return dim1*dim2;
	}
}

class figureareas{
	public static void main(String args[]){
		Figure f = new Figure(10,10);
		Triangle t1 = new Triangle(5,6);
		Rectangle r1 = new Rectangle(7,8);
		
		Figure f1;
		
		f1 = t1;
		System.out.println(+f1.area());
		
		f1 = r1;
		System.out.println(+f1.area());
	}
}
