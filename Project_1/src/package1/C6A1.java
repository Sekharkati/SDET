package package1;

import java.util.Scanner;

public class C6A1 {
	public int sum(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("value is" +c);
		return c;
		
	}
	public int sub(int a, int b)
	{
		int c;
		c=a-b;
		System.out.println("result is"+c);
		return c;
		
	}
	public int mul(int a, int b)
	{
		int c;
		c=a*b;
		System.out.println("result is"+c);
		return c;
		
	}
	public int div(int a, int b)
	{
		int c;
		c=a/b;
		System.out.println("result is"+c);
		return c;
		
	}
	public static void main(String[] args) {
		C6A1 ob= new C6A1();
		Scanner R=new Scanner(System.in);
		System.out.println("enter the mul class values");
		int a1=R.nextInt();
		int a2=R.nextInt();
		int M=ob.mul(a1, a2);
		System.out.println("enter the sum class values");
		int a3=R.nextInt();
		int N=ob.sum(M, a3);
		System.out.println("enter the mul class value");
		int a4=R.nextInt();
		int O=ob.mul(N, a4);
		System.out.println("enter the sub class value");
		int a5=R.nextInt();
		int P=ob.sub(O, a5);
		System.out.println("enter the div class value");
		int a6=R.nextInt();
		ob.div(P, a6);
		
	}

}
