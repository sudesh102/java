//Q) write a program to create interface shape with the get area method create 3 classes rectangle , circle and triangle that implement the shape interface  implement the get area method for each of the 3 classes

interface Shape {
	double getArea();
}
class Rectangle{
	double height,width;
	public Rectangle(double height,double width){
		this.height=height;
		this.width=width;
	}
	public double getArea(){
		return height*width;
	}
}
class Circle{
	double radius;
	public Circle(double radius){
		this.radius=radius;
	}
	public double getArea(){
		return 3.14*radius*radius ;
	}
}
class Triangle{
	double base,height;
	public Triangle(double base,double height){
		this.height=height;
		this.base=base;
	}
	public double getArea(){
		return 0.5*base*height;
	}
}
public class Area{
	public static void main(String[] args){
		Shape rect = new Rectangle(2,3);
		Shape cir = new Circle(4);
		Shape tri = new Triangle(2,3);

		System.out.println("Area of Rectangle:" + rect.getArea());
		System.out.println("Area of Circle:" + cir.getArea());
		System.out.println("Area of Triangle:" + tri.getArea());
	}
}