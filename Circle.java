
/**
 * This is the Circle Class. It implements the Super Class Shape. 
 * The Circle class is designed to receive input from the user to
 * calculate the perimeter and area of a circle, then print out 
 * the correct data. 
 *
 * @author Joshua Johnston
 * @course: CSC 233 OOP 
 * @instructor: Rajesh Rajchal
 * @date: July 14, 2021
 */
public class Circle implements Shape
{
    /**
     * Since it is a Circle we need a radius field
     */
    private double radius; 
    
    
    /**
     * Initializes the fields above to use in the calculations
     */
    public Circle(double radius){
        this.radius = radius;
    }
    
    
    /**
     * Calculates the perimeter 'circumference' of a Circle
     */
    @Override
    public double perimeter(){
        return this.radius * 2 * Math.PI; 
    }
    
    /**
     * Calculates the area of a Circle
     */
    @Override
    public double area(){
        return Math.pow(this.radius, 2) * Math.PI;
    }
    
    /**
     * Returns the data calculated above 
     */
    @Override
    public String toString(){
        return "Perimeter of your Circle: " + perimeter() + '\n' + "Area of your Circle: " + area(); 
    }

}
