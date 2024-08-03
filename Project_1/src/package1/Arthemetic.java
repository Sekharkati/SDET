package package1;

public class Arthemetic {
	
	public int sum(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("result is"+c);
		return c;
		
	}
	public int mul(int a2, int b2)
	{
		int c2;
		c2=a2*b2;
		System.out.println("result is"+c2);
		return c2;
		
	}
	public int sub(int a3, int b3)
	{
		int c3;
		c3=a3-b3;
		System.out.println("result is"+c3);
		return c3;
		
	}
	public int mul2(int x, int y)
	{
		int z;
		z=x*y;
		System.out.println("result is"+z);
		return z;
	}
	
	public void div(int a4, int b4)
	{
		int c4;
		c4=a4/b4;
		System.out.println("final result is"+c4);
		
	}
	public static void main(String[] args) {
		Arthemetic obj=new Arthemetic();
		int sumresult=obj.sum(10, 2);
		int mulresult=obj.mul(sumresult, 2);
		int subresult=obj.sub(mulresult, 2);
		int mul2result=obj.mul2(subresult, 2);
		obj.div(mul2result, 2);
		
	}

}
