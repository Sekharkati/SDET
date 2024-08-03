package package1;

public class Student {
	int rollNo;
	int age;
	public void display1() {
		System.out.println("Welcome to all of you");
	}
	public void display2() {
		System.out.println("automation is very easy");
	}
	public static void main(String[] args) {
		Student Boy=new Student();
		Boy.display1();
		Boy.display2();
		Boy.rollNo=167;
		Boy.age=18;
		System.out.println("roll call "+Boy.rollNo);
		System.out.println("age"+Boy.age); 
	}

}
