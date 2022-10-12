import java.util.Scanner;
public class ComConditionTest1{
	public static void main (String args[])
	{
		Scanner stdin = new Scanner(System.in);
		System.out.print("Month: ");
		int mon = stdin.nextInt();
		switch (mon)
		{
			case 3:
			case 4:
			case 5:
				System.out.println("Spring");
			case 6:
			case 7:
			case 8:
				System.out.println("Summer");
			case 9:
			case 10:
			case 11:
				System.out.println("Fall");
			case 12:
			case 1:
			case 2:
				System.out.println("Winter");
			default:
				System.out.println("NO VALID SEASON");
			
		}
		
	}
}
