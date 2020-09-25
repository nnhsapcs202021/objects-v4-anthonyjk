
/**
 * Write a description of class BrighterDemo here.
 *
 * @author anthonyjk
 * @version sept252020
 */
import java.awt.Color; import javax.swing.JFrame; 
public class BrighterDemo
{
    // instance variables - replace the example below with your own
    public BrighterDemo()
    {
      JFrame frame = new JFrame();
      frame.setSize(200, 200);
      Color myColor = new Color(50, 100, 150);
      frame.getContentPane().setBackground(myColor);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
    }
}
