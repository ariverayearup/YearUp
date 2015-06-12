public class Loops
{

     public static void main(String[] args)
     {
    	 int[] Array1 = {4,2,23,12};
    	 Problem1(Array1, 4);
    	 
    	 int[] Array2 = {13,7,13,7,8,9,7};
    	 Problem2(Array2, 7);
     }
     
     public static void Problem1(int[] array, int searchValue)
     {    	 
    	 boolean there = false;
    	 for (int i = 0; i < array.length; i++)
    	 {
    		 if (searchValue == array[i])
    		 {
    			 there = true;
    			 System.out.println("Search Value for array1 is in index " + i);
    			 break;
    		 }
    	 }
    	 if (there == false)
    	 {
    		 System.out.println("Search Value is not found");
    	 }    	 
     }
     
     public static void Problem2(int [] secondArray, int searchValue)
     {
    	 boolean there = false;
    	 int numberOfOccurences = 0;
    	 
    	 if (secondArray != null)
    	 {
    		 for (int i = 0; i <secondArray.length; i++)
    		 {
    			 if (searchValue == secondArray[i])
    			 {
    				 there = true;
    				 numberOfOccurences++;
    			 }
    		 } 
    		 if (there = true)
    		 {
    			 System.out.println("Search Value for array2 was found " + numberOfOccurences + " times");
    		 }
    		 else
    		 {
    			 System.out.println("Search Value was not found.");
    		 }
    	 }
    		 
     }
}