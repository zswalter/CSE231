/* EXAM 1 PART 2 
*WINTER 2014 
*Zachary Walters 
* Following program is my own effort/work. 
*I did not copy this program or program segment from anyone or any website site. If proven 
otherwise I will accept the consequences and the actions that will be taken for cheating in this 
class. 
*/
package circapp;

public class CircList 
{
    private Link current;
    private int count;
    
    public CircList()
    {
        current = null;
        count = 0;
    }
    
    public boolean isEmpty()
    {
        return count == 0;
    }
    
    public int getSize()
    {
        return count;
    }
    
    public void insert(long id)
    {
        Link newLink = new Link(id);
        if (count == 0)
        {
            current = newLink;
            current.next = current;
        }
        else
        {
            newLink.next = current.next;
            current.next = newLink;
        }
        count++;
    }
    
    public Link delete()
    {
        Link temp;
        
        temp = current.next;
        current = temp.next;
        count--;
        return current;
    }
    
    public Link find(long id)
    {
        for (int i = 0; i < count; i++)
        {
            if (current.iData == id)
            {   
                i = count;
            }
            else if (i == count - 1 && current.iData != id)
                return null;
            else
                step();
        }
        return current;
    }
    
    public Link delete(long key)
    {
        Link temp = new Link(key);
        if (find(key) == null)
            return null;
        else
        {
            temp = current;
            count--;
            for (int i = 0; i < count; i++)
            {
                step();
                temp = current;
            }
            temp = current.next;
            return temp;
        }
    }
    
    public void displayList()
    {
        System.out.print("List: ");
        for (int i = 0; i < count; i++)
        {
            System.out.print((current.iData) + " ");
            step();
        }
        System.out.println("");
    }
    
    public void step()
    {
        current = current.next;
    }
    
    public Link peek()
    {
        return current;
    }
}
