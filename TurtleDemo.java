        /*
         * Every Java program contains one or more classes (e.g. TurtleDemo).
         * 
         * In general, every source file (e.g. TurtleDemo.java) contains one class (e.g. Turtle Demo).
         * 
         * The source file name must match the class name.
         * 
         * By convention, class names should start with an uppercase letter.
         * 
         * New classes must be documented in a way similar to this and also:
         * 
         * @author anthonyjk (github name)
         * @version 09 Sept 2020
         */
        
        
        import java.awt.Color;
        
public class TurtleDemo
    {
        /*
         * A class contains methods.
         * 
         * Most Java programs contain a class with a main method.
         * 
         * The main method is executed when the program starts.
         */
        public static void main(String[] args)
        {
            World ocean = new World(); // Canvas for Turtle objects
            Turtle crush = new Turtle(ocean); // place new Turtle in "ocean" canvas.
            crush.setPenColor(Color.ORANGE);
            crush.penDown();
            crush.forward(50);
            crush.forward(100);
            
            /*
             * A method contains statements.
             * 
             * Statements may invoke other methods (e.g., forward).
             * 
             * In general, methods are invoked on objects (e.g., crush).
             * 
             * When invoking a method, arguments are passed in parentheses (e.g. 50).
             * 
             */
            
            crush.backward(25); // the crush object will move backward by 25 pixels.
        } 
    }
