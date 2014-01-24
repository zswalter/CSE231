/* LAB # 
*FALL 2013 
*STUDENTÕS FIRST NAME, LAST NAME 
* Following program is my own effort/work. 
*I did not copy this program or program segment from anyone or any website site. If proven 
otherwise I will accept the consequences and the actions that will be taken for cheating in this 
class. 
*/ 
public class Ackermanns 
{

	public static void main(String[] args) 
	{
		//test the recursive method
		System.out.println(ackermann(0, 0));
		System.out.println(ackermann(0, 1));
		System.out.println(ackermann(1, 1));
		System.out.println(ackermann(1, 2));
		System.out.println(ackermann(1, 3));
		System.out.println(ackermann(2, 2));
		System.out.println(ackermann(3, 2));
		
	}
	
	public static int ackermann(int m, int n)
	{
		//if m is 0 then return n + 1
		if (m == 0)
			return (n + 1);
		//if n is 0 run ackermann as m-1, 1 till m is 0
		else if (n == 0)
			return ackermann(m -1, 1);
		//repeat till either m is 0
		else
			return ackermann(m-1, ackermann(m, n-1));
	}
	
}
