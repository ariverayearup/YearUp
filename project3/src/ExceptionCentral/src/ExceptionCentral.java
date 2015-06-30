
public class ExceptionCentral {

	public static void main(String[] args) 
	{
		ExceptionCentral exceptionsCentral = new ExceptionCentral();
		
		try
		{
			exceptionsCentral.Divide(50, 0);
		}
		catch(Exception ex)
		{
			System.out.println("could not do the division");
		}
		
		try
		{
			exceptionsCentral.PrintSomething(null);
		}
		catch(NullPointerException exceptionNull)
		{
			System.out.println("String inserted is null");
		}
		
		int[] array = null;
		exceptionsCentral.PrintArrayValues(array);
		
		int[] array2 = {4,7,9,12};
		exceptionsCentral.PrintArrayValues(array2);
	}
	
	int Divide(int number, int divisor) throws ArithmeticException
	{
		int quotient = number/divisor;
		return quotient;
	}

	void PrintSomething(String someString) throws NullPointerException
	{
		String smallString = someString.toLowerCase();
		System.out.println(smallString);
	}
	
	void PrintArrayValues(int[] array)
	{
		try
		{
			for(int i = 0; i < 10; i++)
			{
				System.out.println(array[8]);
			}
		}
		catch(ArrayIndexOutOfBoundsException arrayIndexEx)
		{			
			System.out.println("array passed in did not have 8 slots");
			arrayIndexEx.printStackTrace();
		}
		catch(NullPointerException nullPtrEx)
		{
			System.out.println("array passed in is null");
			nullPtrEx.printStackTrace();
		}		
	}
}
