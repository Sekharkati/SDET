package package1;

import java.util.Scanner;

public class C6A2 {
	public int sum(int a,int b)
	{
	int c = a+b;
	System.out.println("Addition of 2 numbers is: "+c); 
	return c;
	}
	public int sub(int a, int b)
	{
	int c = a-b;
	System.out.println("Subtraction of 2 numbers is: "+c); 
	return c;
	}
	public int mul(int a, int b)
	{
	int c = a*b;
	System.out.println("Multiplication of 2 numbers is: "+c);
	return c;
	}
	public void div(int a, int b)
	{
	int c = a/b;
	System.out.println("Division of 2 numbers is: "+c);
	}
	public static void main(String[] args) {
		C6A2 ob=new C6A2();
		Scanner obj=new Scanner(System.in);
		System.out.println("enter value for sum class");
		int a1=obj.nextInt();
		int a2=obj.nextInt();
		int m=ob.sum(a1, a2);
		System.out.println("enter value for sum class");
		int x1=obj.nextInt();
		int n=ob.sum(m, x1);
		System.out.println("enter value for sub class");
		int y1=obj.nextInt();
		int o=ob.sub(n, y1);
		System.out.println("enter value for mul class");
		int z1=obj.nextInt();
		int p=ob.mul(o, z1);
		System.out.println("enter value for div class");
		int b1=obj.nextInt();
		ob.div(p, b1);
		
	}
	

}
