
/**
 * This is the Square Class. Since the Super Class to this class
 * is Rectangle, it 'Extends Rectangle' instead of Implements.
 * A new field is created called length because Squares have the
 * same length on all sides.
 *
 * @author Joshua Johnston
 * @course: CSC 233 OOP 
 * @instructor: Rajesh Rajchal
 * @date: July 14, 2021
 */
public class Square extends Rectangle
{
   private double length;
   
   /**
    * The Square constructor still requires input from the Super Class
    * and must be called with the super() function to access the fields.
    */
   public Square(double height, double width, double length){
       super(height, width);
       this.length = length;
       
       
   }
   
   /**
    * This method returns the area of the Square 
    */
   public double area(){
       return this.length * this.length; 
   }
   
   /**
    * This method returns the perimeter of the Square 
    */
   public double perimeter(){
       return this.length * 4; 
   }
   
   /**
    * The toString returns both the data from the Super Class as well as
    * the data calculated in this class
    */
   @Override
   public String toString(){
       return super.toString() + " " + "Area of your square: " + area() + '\n' 
       + "Perimeter of your square: " + " " + perimeter(); 
   }
}
