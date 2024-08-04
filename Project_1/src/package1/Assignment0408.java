package package1;

public class Assignment0408 {
	public Assignment0408()
	{
		this(10,20,30);
		System.out.println("default constructor");
	}
	public Assignment0408(int a)
	{
		this(20,30);
		System.out.println("one parmeterized constructor");
	}
	public Assignment0408(int a,int b)
	{
		this();
		System.out.println("two parameterized constructor");
	}
	public Assignment0408(int a,int b,int c)
	{
		System.out.println("three parameterized constructor");
	}
	public static void main(String[] args) {
		Assignment0408 obj=new Assignment0408(20);
		
	}
	
	
	

}
