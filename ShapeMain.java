import java.util.ArrayList;
import java.util.List;

/**
 * This is the main method of the Shape Interface Class.
 * It receives the input numbers from the user and then
 * calls the appropriate subclasses to calculate the
 * perimeter() and area(). It then prints to the 
 * screen the toString() data from those subclasses.
 *
 * @author Joshua Johnston
 * @course: CSC 233 OOP 
 * @instructor: Rajesh Rajchal
 * @date: July 14, 2021
 */
public class ShapeMain
{
    public static void main(String[] args){
        Rectangle box = new Rectangle(12.0, 5.5);
        
        box.perimeter(); 
        box.area();
        
        System.out.println(box);
        
        System.out.println("---------");
        
        Square square = new Square(10, 10, 10); 
        
        square.perimeter();
        square.area();
        
        System.out.println(square);
        
        System.out.println("---------");
        
        Circle oval = new Circle(12.8);
        
        oval.perimeter();
        oval.area();
        
        System.out.println(oval);
        
        List<Object> shapes = new ArrayList<>();
        
        shapes.add(box);
        shapes.add(square);
        shapes.add(oval);
        
        System.out.println(shapes); 
        
        
        
        
        
        
        
    }
}
