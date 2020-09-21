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
            
            /*
             * Identifiers are any combination of:
             * letters
             * digits (but not as a first character)
             * underscores
             * dollar signs
             * 
             * tThese are various identifiers;
             */
            
            int y, x2, x_y, x$;
            
            //int 2y; // This is not a valid identifier
            
            /*
             * Identifiers are case sensitive (case matters).
             * 
             * These are different:
             */
            Turtle squirt, SQUIRT, sQuIrT;
            
            /*
             * By convention, constant values are all uppercase. Use an underscore between words.
             */
            int SPEED_OF_LIGHT = 300000000; // meters/seconds
            
            /*
             * By convention, most identifiers start with a lowercase letter.
             *   Subsequent words start with an uppercase letter (CamalCase)
             */
            
        } 
        
        public static void drawLine()
        {
            /*
             * Objects are entities in a program
             *  Objects have attributes
             *  Objects are manipulated by invoking methods
             *  
             *  ocean and crush and variables that reference objects.
             *  
             *  Classes describe a collection of objects.
             *    All objects of a class have the same behavior (method)
             *      and they have the same type of attributes (but they may have different values)
             * 
             *  World and Turtle are classes.
             */
            World ocean = new World();
            /*
             * We use the new operator to construct (create, instantiate) an object
             * 
             * The class of the object is specified immdiately after the new operator (e.g. Turtle)
             * 
             * If we need to pass additional information t oconstruct the object, arguments are
             *     specified in the parentheses after the class (e.g., ocean)
             */
            Turtle crush = new Turtle(ocean);
            
            /*
             * Variables store values to be used later.
             *  Variableshave a type (e.g. int), a name (e.g. width), and a value (e.g., 20)
             */
            int width = 20; // declaring a variable
            width = 20; // assigning a value to a pre-existing variable
            
            //int width = 20 OR double width does not work, you cannot have more than 1 variable with the same name.
            
            /*
             * Java has several primitive data types:
             *  boolean holds a value of true or false.
             *  int holds a value of a whole number
             *  double holds a value of a decimal or floating point number
             *  char holds a single character
             */
            
            // here is a boolean
            boolean isSummer = true;
            
            // here is a double
            double pi = 3.1415;
            
            // here is a char
            char letter = 'c';
            
            /*
             * When invoking methods, we use the dot operator (i.e., '.') to invoke a method on an object.
             * 
             * Some methods take no arguments, but we still have parentheses (e.g., penDown)
             */
            crush.penDown();
            crush.forward(50);
            crush.setPenColor(Color.RED);
            crush.forward(150);
            
            /*
             * Accessor method returns the value of an attribute of the object
             *  The state of the object doesn't change
             *  
             *  Get pen width is an accessor method.
             */
            int penWidth = crush.getPenWidth();
        }
    }
