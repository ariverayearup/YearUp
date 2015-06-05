
public class ReverseString 
{

	public static void main(String[] args) 
	{
		String originalString = "!!!ti did maharbA";
		String reversedString = ReverseInPlace(originalString);
		System.out.println(reversedString);
	}
	public static String ReverseInPlace(String originalString)
	{
		String reversedString = null;
		if (originalString !=null)
		{
			char[] originalStringCharacters = originalString.toCharArray();
	
		for (int i = 0, j = originalStringCharacters.length - 1; i < originalStringCharacters.length/2; i++, j--)
		{ 
			/*  I starts at the begining and j is at the end. temp(empty) holds I(h). And  J(now empty) holds i
			 * and I(now empty) now holds temp. reversing the process and the index is now incremented and ect. */
			char temp = originalStringCharacters[j];
			originalStringCharacters[j] = originalStringCharacters[i];
			originalStringCharacters[i] = temp;
		}
		reversedString = new String(originalStringCharacters);
	}
	
	return reversedString;
	}
	
	public static String ReverseOutOfPlace(String originalString)
	{
		String reversedString = null;
		if (originalString != null)
		{
			char[] originalStringCharacters = originalString.toCharArray();
			char[] reversedStringCharacters = new char[originalStringCharacters.length];
			for (int i = 0, j = originalStringCharacters.length; i < originalStringCharacters.length;i++,j--)
			{
				reversedStringCharacters[j] = originalStringCharacters[i];
			}
			reversedString = new String(reversedStringCharacters);
		}
		return reversedString;
			}
	}