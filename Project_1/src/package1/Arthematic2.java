package package1;

public class Arthematic2 {
	public int div(int a, int b)
	{
		int c;
		c=a/b;
		System.out.println("resulty is"+ c);
		return c;
	}
	public int sub(int x, int y)
	{
		int z;
		z=x-y;
		System.out.println("result is"+ z);
		return z;
	}
	public int mul(int m, int n)
	{
		int o;
		o=m*n;
		System.out.println("result is"+ o);
		return o;
	}
	public int sub2(int x1, int y1)
	{
		int z1;
		z1=x1-y1;
		System.out.println("result is"+ z1);
		return z1;
	}
	public void sum(int a1, int b1)
	{
		int c1;
		c1=a1+b1;
		System.out.println("final result is"+ c1);
	}
	public static void main(String[] args) {
		Arthematic2 var=new Arthematic2();
		int divresult=var.div(10, 2);
		int subresult=var.sub(divresult, 2);
		int mulresult=var.mul(subresult, 2);
		int sub2result=var.sub2(mulresult, 2);
		var.sum(sub2result, 2);
	}
		
		

}
