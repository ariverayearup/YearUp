
public class project2 {

	public static void main(String[] args) 
	{
		double rectangleArea = calculateRectArea(5,6);
		System.out.println("The area of a rectangle :" + rectangleArea);
		double circleArea = calculateCircleArea(7);
		System.out.println("The area of a circle :" + circleArea);
	}
	static double calculateRectArea(int length, int breadth)
	{
		double Area = length * breadth;
		return Area;
	}
	static double calculateCircleArea( int radius )
	{
		double area = radius * radius * 3.14;
		return area;
	
	}

}
