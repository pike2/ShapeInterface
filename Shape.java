
/**
 * This is the Shape Interface Class. It is the Super Class for all of 
 * the Shape subclasses such as: Rectangle, Square and Circle. Below
 * the Shape Class creates two methods to be used in all of the subclasses
 * perimeter() and area(). These will be used to calculate the results in
 * the following subclasses. 
 * 
 * Answer to Question 1: It is possible to change the class to abstract,
 * however, it requires a change of the class name and type. Instead of 
 * the class being called 'public interface Shape,'the class would need
 * to be renamed 'public abstract class Shape.' 
 * The following methods would need to be changed as well to include the
 * 'abstract' naming convention.
 *
 * @author Joshua Johnston
 * @course: CSC 233 OOP 
 * @instructor: Rajesh Rajchal
 * @date: July 14, 2021
 */
public interface Shape
{
    double area();
    
    double perimeter(); 
    
    
    
    
}
