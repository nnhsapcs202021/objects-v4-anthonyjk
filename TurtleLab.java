import java.awt.Color;

public class TurtleLab
{
    public static void main(String[] args)
    {
        // Turtles & Canvas
        World canvas = new World();
        Turtle paint = new Turtle(canvas); // Paints the middle
        Turtle brush = new Turtle(440, 225, canvas); // Brushes the outside
        // Turtle Settings + Extra
        paint.setPenColor(Color.RED);
        paint.setPenWidth(1);
        brush.setPenColor(Color.BLUE);
        int repeater = 50; // How many times a shape is repeated
        int offset = 5; // Offset degree after each shape
        int sides = 8; // How many sides each shape should have.
        int length = 50; // Length of each side of shape.
        while (repeater != 0)
        {
            for(int i = 0; i <= sides; i++) {
                paint.forward(length);
                brush.forward(length);
                paint.turn(360 / sides);
                brush.turn(360 / sides);
            }
            paint.turn(360/offset);
            brush.turn(-360/offset);
            repeater--;
        }
        
    }
}
