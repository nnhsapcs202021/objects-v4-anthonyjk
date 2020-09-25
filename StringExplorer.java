
/**
 * Exploring the String class and its methods.
 *
 * @author anthonyjk
 * @version 22sept2020
 */
public class StringExplorer
{
    public static void main(String[] args)
    {
        String river = new String("Mississippi");
        String river2 = "Mississippi"; // String literal
        river.replace("i", "x"); // Never assigned to River, so it never changed.
        System.out.println(river);
        
        /*
         * The replace method returns a reference to a new string
         *   It does not change the String object on which it is invoked
         * The String class has no mutator methods. It is not possible to change a String object
         *   Strings are immutable.
         */
        
        String riverX = river.replace("i", "x");
        System.out.println(riverX);
        //String river = river.replace("i", "w");// This gives an error as strings are immutable.
        
    }
}
