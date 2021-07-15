
/**
 * This is the Rectangle Class. It implements the Super Class Shape. 
 * The Rectangle class is designed to receive input from the user to
 * calculate the perimeter and area of a rectangle, then print out 
 * the correct data. 
 *
 * @author Joshua Johnston
 * @course: CSC 233 OOP 
 * @instructor: Rajesh Rajchal
 * @date: July 14, 2021
 */
public class Rectangle implements Shape
{
/**
 * Two fields: height and width to be used for calculations
 */
    private double height;
    private double width;
    
/**
 * The Rectangle constructor takes input and assigns the numbers to the above fields
 */
  public Rectangle(double height, double width){
      this.height = height; 
      this.width = width; 
  }
  
  /**
   * This calculates the area of the Rectangle by calling the method from the super class
   */
  @Override
  public double area(){
      return this.height * this.width;
    }
  
    /**
   * This calculates the perimeter of the Rectangle by calling the method from the super class
   */
  @Override
  public double perimeter(){
      return this.height * 2 + this.width * 2; 
  }
  
  /**
   * This returns all the data calculated above
   */
  @Override
  public String toString(){
      return "The perimeter of the rectangle is: " + perimeter() + '\n' 
      + "The area of the rectangle is: " + area();
  }
}
