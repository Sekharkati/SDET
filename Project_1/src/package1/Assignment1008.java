package package1;

public class Assignment1008{
	public void mth()
	{
		System.out.println("default mth");
		this.mth1();
	}
	public void mth1()
	{
		System.out.println("one parameterized mth");
		this.mth2();
	
	}
	public void mth2()
	{
		System.out.println("two paramterized mth");
	}
	public void mth3()
	{
		System.out.println("three paramterized mth");
	}
	public void mth4()
	{
		this.mth3();
		this.mth();
		System.out.println("four paramterized mth");
	}
	public static void main(String[] args) {
		Assignment1008 obj=new Assignment1008();
		obj.mth4();
	}

}
