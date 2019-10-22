public class erSumNZ 
{
	static int n=6;
	public static void main(String[] args) 
	{
		int m = summieren(n);
		System.out.println(m);
	}
	
	public static int summieren(int n)
	{
		return hinzufügen_summieren(0,n);
	}
	
	public static int hinzufügen_summieren(int m, int n)
	{
		if(n==0) {return m;}
		return hinzufügen_summieren(m+n, n-1);
	}
}
