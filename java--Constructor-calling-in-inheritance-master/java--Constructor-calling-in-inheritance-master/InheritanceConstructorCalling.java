class sem1
{
	int m11,m12,m13;
	double avg1;
	sem1()
	{
		System.out.println("Constructor 1");
		m11=80;
		m12=65;
		m13=45;
		avg1=(m11+m12+m13)/3;
	}
	
}
class sem2 extends sem1
{
	int m21,m22,m23;
	double avg2;
	sem2()
	{
		super();
		System.out.println("Constructor 2");
		m21=80;
		m22=65;
		m23=45;
		avg2=(m21+m22+m23)/3;
	}
	
}
class sem3 extends sem2
{

	int m31,m32,m33;
	double avg3;
	sem3()
	{
			super();
		System.out.println("Constructor 3");
		m31=80;
		m32=65;
		m33=45;
		avg3=(m31+m32+m33)/3;
	}
	double totavg()
	{
		double ans;
		ans=(avg1+avg2+avg3)/3;
		return ans;
	}

	 
}

class InheritanceConstructorCalling
{
	public static void main(String s[])
	{
		sem3 ob=new sem3();
		System.out.println(ob.avg1);
		System.out.println(ob.avg2);
		System.out.println(ob.avg3);
		System.out.println(ob.totavg());
	}
}