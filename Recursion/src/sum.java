
public class sum 
{
	public static int summation(int n)
	{
		int result;
		if (n == 1)
			result = 1;
		else
			result = n + summation(n - 1);
		return result;
	}
}
