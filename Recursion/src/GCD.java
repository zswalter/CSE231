
public class GCD 
{
	public static int gcd(int x, int y)
	{
		if (x % y ==0)
			return y;
		else 
			return gcd(y, x % y);
	}

}
