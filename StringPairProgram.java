
/**
 * Write a description of class StringPairProgram here.
 *
 * @author anthonyjk
 * @version (a version number or a date)
 */

import java.util.StringTokenizer;

public class StringPairProgram
{
    public StringPairProgram()
    {
        //String 1
        String test = "This is a Test";
        String test2 = test.toLowerCase();
        System.out.println(test2);
        test2 = new String( "whisper" );
        String bigTestString = test2.toUpperCase(); 
        System.out.println(bigTestString);
        
        //String 2
        String animal1 = new String( "quick brown fox" );
        String animal2 = new String( "lazy dog" );
        String article = new String( "the" );
        String action = new String( "jumps over" );
        String message = new String(article + " " + animal1 + " " + action + " " + animal2);
        System.out.println(message);
        
        String sentence1 = new String( "      abc   " );
        String sentence2 = new String( "   def" );
        String sentence3 = new String( "ghi         " );
       
        String message2 = new String(sentence1.replace(" ", "") + sentence2.replace(" ", "") + sentence3.replace(" ", ""));

        System.out.println(message2);
        
        String sentence = new String( "Mary had a little lamb." );
        StringTokenizer mystery = new StringTokenizer(sentence);
        System.out.println(mystery.countTokens());
        System.out.println(mystery.nextToken());
        System.out.println(mystery.nextToken());
    }
}
