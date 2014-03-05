
/* LAB #2
*WINTER 2014
*Zachary, Walters
*Following program is my own effort/work.
*I did not copy this program or program segment from anyone or any website site. 
If proven otherwise I will accept the consequences and the actions that will be 
taken for cheating in this class.
*/
package Lab2;
import java.util.*;
import ch03.stacks.*;

public class ReverseCharacters 
{
    //pre condition is that there is an entered scentence and 
    //post is that strings are reversed within the sentence
    public static void main(String args[])
    {
        //create scanner, stack, and declare variables
        Scanner input = new Scanner(System.in);
        UnboundedStackInterface<String> stack;
        stack = new ArrayListStack<String>();
        String line;
        char a;
        int len = 0;
        
        //get input from user
        System.out.println("Eneter a sentence:");
        line = input.nextLine();
        line += " ";
        System.out.println("Reversing each word:");
        
        //get line length
        len = line.length();
        
        //reverse the stacks
        for (int i = 0; i < len; i++)
        {
            a = line.charAt(i);
            stack.push(Character.toString(a));
            if (Character.isWhitespace(a) || i == len - 1)
            {
                stack.pop();
                while (!stack.isEmpty())
                {
                    System.out.print(stack.top());
                    stack.pop();
                }
                if (i != len -1)
                    System.out.print(" ");
            }
        }
        System.out.println();
    }
}