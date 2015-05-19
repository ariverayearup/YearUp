import java.util.Scanner;

public class DayOfWeek 
{	
	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a new day of week:\n");
		String day = scanner.nextLine();
		System.out.println("Today is a " + day);
		
		DayOfWeek dayOfWeekEvaluator = new DayOfWeek();
		dayOfWeekEvaluator.EvaluateDayOfWeek(day);
		
		scanner.close();
	}
	void EvaluateDayOfWeek(String dayOfWeek)
	{
		if (dayOfWeek != null)
		{	
			if (dayOfWeek.equalsIgnoreCase("saturday")
				||dayOfWeek.equalsIgnoreCase("sunday"))
			{
				System.out.println(dayOfWeek + " is the Weekend!!!");
			}
			else if   (dayOfWeek.equalsIgnoreCase("monday")
					||dayOfWeek.equalsIgnoreCase("tuesday")
					||dayOfWeek.equalsIgnoreCase("wednesday")
					||dayOfWeek.equalsIgnoreCase("Thursday")
					||dayOfWeek.equalsIgnoreCase("Friday"))
			{
				System.out.println(dayOfWeek + " is a weekday. :[ ");
			}
				
			else 
			{
				System.out.println(dayOfWeek+ "  is not even a valid day!!");
			}
		}
		
	}
}











