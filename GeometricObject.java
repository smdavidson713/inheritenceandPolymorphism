

/**
 * Representation of a geometric object.
 * @author Qi Wang
 * @version 1.0
 */
public abstract class GeometricObject {
	/**
	 * The color of this object
	 */
	private String color;
	
	/**
	 * Constructs a white geometric object. 
	 */
	protected GeometricObject(){
		this("white");
	}
	
	/**
	 * Constructs a specific colored geometric object. 
	 * @param color A Reference to a string specifying a color
	 */
	protected GeometricObject(String color) {
		this.color = color;
	}
	
	/**
	 * Returns the color of this object.
	 * @return A Reference to the color of this object
	 */
	public String getColor(){
		return this.color;
	}
	
	/**
	 * Changes the color of this object.
	 * @param color A Reference to the color of this object
	 */
	public void setColor(String color){
		this.color = color;
	}
	
	/**
	 * Returns the area of this object. 
	 * @return The area of this object
	 */
	public abstract double area();
	
	/**
	 * Returns the perimeter of this object. 
	 * @return The perimeter of this object
	 */
	public abstract double perimeter();

	/**
	 * Returns a string representation of this object. 
	 * @return A string representation of this object
	 */
	public String toString() {
		return this.getClass().getSimpleName() + ": color= " + this.color;
	}
	
	
	/**
	 * Indicates if this object is equal to some other object. 
	 * @param obj A reference to an object
	 * @return A value specifying if this object is equal to some other object
	 */
	public boolean equals(Object obj) {
		if(!(obj instanceof GeometricObject)){
			return false;
		}
		
		GeometricObject other = (GeometricObject)obj;
		return this.color.equalsIgnoreCase(other.color);
	}
}