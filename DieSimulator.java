
/**
 * Write a description of class DieSimulator here.
 *
 * @author anthonyjk
 * @version sept252020
 */
import java.util.Random;
public class DieSimulator
{
    // instance variables - replace the example below with your own
    public DieSimulator()
    {
        Random rand = new Random();
        int die = rand.nextInt(6);
        die++;
        System.out.println(die);
    }
}
