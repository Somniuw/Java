import java.util.Scanner;
public class MultiIFTest1{
	public static void main (String args[])
	{
		Scanner stdin = new Scanner(System.in);
		System.out.print("Score: ");
		int grade = stdin.nextInt();
		switch (grade)
		{
			case 90:
				System.out.println("A");
			case 80:
				System.out.println("B");
			case 70:
				System.out.println("C");
			case 60:
				System.out.println("D");
			default:
				System.out.println("Fail");
		}
	}
}
