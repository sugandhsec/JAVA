class callvalue
{
	void show(int y)
	{
		y=y*2;
	}
}
class callvaluedemo
{
	public static void main(String s[])
	{
		int x=10;
		callvalue ob=new callvalue();
		System.out.println("X="+x);
		ob.show(x);
		System.out.println("X="+x);
	}
}