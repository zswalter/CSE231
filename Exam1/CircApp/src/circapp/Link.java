/* EXAM 1 PART 2 
*WINTER 2014 
*Zachary Walters 
* Following program is my own effort/work. 
*I did not copy this program or program segment from anyone or any website site. If proven 
otherwise I will accept the consequences and the actions that will be taken for cheating in this 
class. 
*/
package circapp;

public class Link 
{
    public long iData;
    public Link next;
    
    public Link(long id)
    {
        this.iData = id;
        next = null;
    }
    
    public void displayLink()
    {
        System.out.println(this.iData);
    }    
}
