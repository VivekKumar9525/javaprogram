class prime
{
	public static void main(String vivek_kumar[])
	{
		int n=13,i,c=0;
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			c++;
		}
		if(c==2)
		System.out.println("prime no.");
		else
		System.out.println("composite no.");
	}
}