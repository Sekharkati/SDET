package package1;

public class p4 {
	public static void main(String[] args) {
		for (int i=1;i<=5;i++) {
			for (int j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			for (int p=1;p<=2*i-1;p++) {
				System.out.print("*");
			}
			System.out.println();
		}
			
	}

}
