
public class arraySum 
{
	public static int sum(int n[], int s, int e)
	{
		if (s > e)
			return 0;
		else 
			return n[s] + sum(n, s + 1, e);
	}
}
