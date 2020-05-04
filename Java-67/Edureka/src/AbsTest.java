abstract class Shape
{
 String color;
 
 Shape(String color){
	 this.color = color;
 }
 
 public String getColor() {
	 return this.color;
 }
 public void setColor(String color) {
	 this.color = color;
 }
 abstract public void area();
}

class Rectangle extends Shape
{
 String color;
 int length, breadth;
 
 Rectangle(String color, int length, int breadth)
 {
	 super(color);
	 this.length = length;
	 this.breadth = breadth;
 }
 public void area() {
	 System.out.println("Area of Rectangle = "+(this.length*this.breadth));
 }
}

class Circle extends Shape
{
 String color;
 float radius;
 
 Circle(String color, float radius)
 {
	 super(color);
	 this.radius = radius;	 
 }
 public void area() {
	 System.out.println("Area of Circle = "+(Math.PI*this.radius*this.radius));
 }
}

public class AbsTest 
{
 public static void main(String[] args) 
 {
	 Shape shape = null;
	 //shape = new Shape();
	 shape = new Circle("red",5);
	 System.out.println("Color = "+ shape.getColor());
	 shape.area();
	 
	 shape = new Rectangle("blue",5,4);
	 shape.area();
 }
}
