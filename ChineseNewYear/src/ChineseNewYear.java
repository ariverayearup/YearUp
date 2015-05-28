import java.util.Scanner;
public class ChineseNewYear 
{
	static int s_knownYear = 1900;
	
	public void EvaluateChineseYear(int unknownYear) 
	{  
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter your birth year:\n");
//		String year = scanner.nextLine();
//		System.out.println("This is the year of the " + year);
//		scanner.close();
// 		the problem here was that the main method was on the top and i wasnt setting it up right
		if (unknownYear >= s_knownYear)
		{
			int yearDifference = unknownYear - s_knownYear;
			int remainder = yearDifference % 12;
		
			switch (remainder) 
			{
			case 0:
				System.out.println(unknownYear + " is the year of rat.");
				break;

			case 1:
				System.out.println(unknownYear + " is the year of ox.");
				break;

			case 2:
				System.out.println(unknownYear + " is the year of tiger.");
				break;

			case 3:
				System.out.println(unknownYear + " is the year of rabbit.");
				break;

			case 4:
				System.out.println(unknownYear + " is the year of dragon.");
				break;

			case 5:
				System.out.println(unknownYear + " is the year of snake.");
				break;

			case 6:
				System.out.println(unknownYear + " is the year of horse.");
				break;

			case 7:
				System.out.println(unknownYear + " is the year of sheep.");
				break;

			case 8:
				System.out.println(unknownYear + " is the year of monkey.");
				break;

			case 9:
				System.out.println(unknownYear + " is the year of rooster.");
				break;

			case 10:
				System.out.println(unknownYear + " is the year of dog.");
				break;

			case 11:
				System.out.println(unknownYear + " is the year of pig.");
				break;
			}
// my program was not running right becuase the else was put between the brackets.
		}
		else
		{
			System.out.println("You must change your input.");
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your birth year:\n");
		int year = scanner.nextInt();
		ChineseNewYear BirthYear = new ChineseNewYear();
		BirthYear.EvaluateChineseYear(year);
		scanner.close();
	}

}