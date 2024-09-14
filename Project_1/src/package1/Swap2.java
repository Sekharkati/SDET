package package1;

import java.util.Scanner;

public class Swap2 {
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.println("enter the value of a");
		int a=x.nextInt();
		System.out.println("enter the value of b");
		int b=x.nextInt();
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("after swap a ="+a);
		System.out.println("after swap b="+b);
		
		
	}

}
