import java.awt.Color;

public class TurtleLab
{
    public static void main(String[] args)
    {
        // Turtles & Canvas
        World canvas = new World();
        Turtle paint = new Turtle(canvas);
        Turtle brush = new Turtle(canvas);
        // Turtle Settings + Extra
        paint.setPenColor(Color.RED);
        paint.setPenWidth(10);
        brush.setPenColor(Color.BLUE);
        int timer = 250;
        int[] penWidth = {1,2,4,8,16,32};
        
        while (timer != 0)
        {
            paint.forward(25);
            timer--;
        }
        
    }
}
