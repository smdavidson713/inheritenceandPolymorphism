
/**
Sydney Davidson
CSI 213
Lab 1
Demonstrates inheritance and polymorphism **/

public class ComparableSphere extends GeometricObject implements Comparable<ComparableSphere>{

	/**
	The radius of the sphere
	**/
	private int radius;

	/**
	default Constructor for ComparableSphere
	**/
	 ComparableSphere(){
	 	super();  // calls constructor in GeometricObject
	 	radius = 1;
	 }

	 /**
	Constructor for ComparableSphere
	@param color a String that specifies a color of the sphere
	@param radius an int that references the radius of the sphere
	 **/

	 ComparableSphere(String color, int radius){
	 	super(color);
	 	this.radius = radius;
	 } 

	 /**
	 calculates the area of the sphere
	 @return the area of the sphere
	  **/

	 public double area(){
	 	double area;
	 	area = 4 * 3.14 * (radius * radius);
	 	return area;
	 }

	 /**
	 calculates the perimeter of the sphere
	 @return the perimeter of the sphere
	 **/

	 public double perimeter(){
	 	double perimeter;
	 	perimeter = 2 * 3.14 * radius;
	 	return perimeter;
	 }

	 /**
	 compares this comparable sphere to another 
	 comparable sphere object
	 @return the differences between the radius
	 @param sphere the comparable sphere that is being compared
	 **/

	 public int compareTo(ComparableSphere sphere){
	 	return this.getRadius() - sphere.getRadius();
	 }

	 /**
	 Sets the radius for the sphere
	 @param radius the radius as an integer for the sphere
	 **/

	 public void setRadius(int radius){
	 	this.radius = radius;
	 }

	 /**
	 Returns the radius of the sphere
	 @return the radius of the sphere
	 **/

	 public int getRadius(){
	 	return radius;
	 }
}