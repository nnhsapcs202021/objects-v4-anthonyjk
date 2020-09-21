
/**
 * Write a description of class DialogViewer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class DialogViewer
{
    public static void main(String[] args) throws Exception
   {
      URL imageLocation = new URL( "https://cdn.discordapp.com/attachments/750346791932788796/755145684910342254/unknown.png");
      JOptionPane.showMessageDialog(null, "there is one impostor among us", "funny", JOptionPane.PLAIN_MESSAGE,
            new ImageIcon(imageLocation));

   }
}
