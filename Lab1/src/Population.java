/* LAB # 
*FALL 2013 
*STUDENTÕS FIRST NAME, LAST NAME 
* Following program is my own effort/work. 
*I did not copy this program or program segment from anyone or any website site. If proven 
otherwise I will accept the consequences and the actions that will be taken for cheating in this 
class. 
*/ 
import java.util.*;
public class Population 
{

	public static void main(String[] args) 
    {
        //initialize the user input variables and input reader
		int days = 0;
        double org = 0, growth = -1;
        Scanner input = new Scanner(System.in);
        
        
        //get the starting organisms and make sure it is 2 or more
        while (org < 2)
        {
            System.out.print("Enter the starting number of organisms: ");
            org = Integer.parseInt(input.nextLine());
        }
        
        //get the daily increase amount and make sure it is positive
        while (growth < 0)
        {
            System.out.print("Enter the daily increase: ");
            growth = Double.parseDouble(input.nextLine());
        }
        
        //get the number of days to multiply organisms and make sure it is 1 or more
        while (days < 1)
        {
            System.out.print("Enter the number of days the organisms will multiply: ");
            days = Integer.parseInt(input.nextLine());
        }
        
        //print the header of the table
        System.out.println("Day          Organisms");
        System.out.println("----------------------------");
        
        //call the display method
        displayPopulation(org, growth, days);
    }
    
    private static void showPopulation(int dayNum, int days, double organisms, double dailyIncrease)
    {
         //if only 1 day just print the day number and the starting organisms
         if (days == 1)
             System.out.println(dayNum + "            " + organisms);
         
         //for the first day print out the day and starting organisms and increase day to 2
         else if (dayNum == 1)
         {
             System.out.println(dayNum + "            " + organisms);
             dayNum++;
             showPopulation(dayNum, days, organisms, dailyIncrease);
         }
         
         //for the last day print out the final data and quit
         else if (dayNum == days)
         {
             System.out.println(dayNum + "            " + (organisms * dailyIncrease));
         }
         
         //calculate the total organisms for the next day and then add another day and repeat
         else
         {
             organisms = (organisms * dailyIncrease);
             System.out.println(dayNum + "            " + organisms);
             dayNum ++;
             showPopulation(dayNum, days, organisms, dailyIncrease);
         }
             
    }
     
    public static void displayPopulation(double startingOrganisms, double increase, int days)
    {	
    	 //initialize the day
         int day = 1;
         
         //convert the increase into a percentage
         increase *= .01;
         increase += 1;
         
         //call the recursive method to print the table
         showPopulation(day, days, startingOrganisms, increase);
    }
	
}
