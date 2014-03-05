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

public class ReverseWords 
{
    //pre condition is 7 words are inputed and post is that those 
    //strings are displayed in reverse
    public static void main(String args[])
    {
        //create scanner, stack, and declare variables
        BoundedStackInterface<String> stack;
        stack = new ArrayStack<String>(7);
        Scanner input = new Scanner(System.in);
        String line;
        
        //get 7 words from uer
        System.out.println("Enter seven words at the prompts.");
        for (int i = 1; i <= 7; i++)
        {
            System.out.print("Enter a word:");
            line = input.nextLine();
            stack.push(line);
        }
        
        //reverse the stack of strings and print
        System.out.println("In reverse order:");
        while (!stack.isEmpty())
        {
            line = stack.top();
            stack.pop();
            System.out.println(line);
        }
    }
}
