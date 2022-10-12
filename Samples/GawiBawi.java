import java.util.Scanner;

public class GawiBawi {
	public static void main (String args[])
	{
		Scanner stdin = new Scanner(System.in);
		System.out.print("Integer? : ");
		int user = stdin.nextInt();
		swich (user%3)
		{
			case 0:
				System.out.println("Gawi");
				break;
			case 1:
				System.out.println("Bawi");
				break;
			case 2:
				System.out.println("Bo");
				break;
		}	
	}
	
}
