class SimpleIntrest
{
	public static void main(String args[])
	{
		int p,t;
		float si,r;
		p=Integer.parseInt(args[0]);
		r=Integer.parseInt(args[1]);
		t=Integer.parseInt(args[2]);
		si=(p*r*t)/100;
		System.out.print("Simple Intrest="+si);
	}
}