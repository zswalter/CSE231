
package circapp;

public class CircApp 
{
    public static void main(String[] args) 
    {
        Link f, d;
        CircList theList = new CircList();
        
        theList.insert(10);
        theList.displayList();
        theList.insert(20);
        theList.displayList();
        theList.insert(30);
        theList.displayList();
        theList.insert(40);
        theList.displayList();
        theList.insert(50);
        theList.displayList();        
        theList.insert(60);
        theList.displayList();
        theList.insert(70);
        
        theList.displayList();
        
        f = theList.find(30);
        if (f != null)
            System.out.println("Found link with key " + f.iData);
        else
            System.out.println("Can't fined link with key 30");
        theList.displayList();
        
        System.out.println("Inserting link with key 80");
        theList.insert(80);
        theList.displayList();
        
        d = theList.delete(60);
        if (d != null)
            System.out.println("Deleted link with key " + d.iData);
        else
            System.out.println("Can't delete link with key 60");
        theList.displayList();
        
        f = theList.find(99);
        if (f != null)
            System.out.println("Found link with key " + f.iData);
        else
            System.out.println("Can't find link with key 99");
        theList.displayList();
        
        d = theList.delete(13);
        if (d != null)
            System.out.println("Deleted link with key " + d.iData);
        else
            System.out.println("Can't delete link with key 13");
        theList.displayList();
        
        System.out.println("Stepping through list");
        for (int j = 0; j < theList.getSize(); j++)
        {
            theList.step();
            theList.displayList();
        }
        
        System.out.println("Will delete and step one by one");
        while (theList.isEmpty() == false)
        {
            theList.delete();
            theList.step();
            theList.displayList();
        }
    }  
}
