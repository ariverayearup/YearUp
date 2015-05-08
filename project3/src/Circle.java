public class Circle {
	String m_color = "grey";
	double m_radius = 0.0;

	public Circle(double radius) {
		m_radius = radius;
		System.out.println("we are creating a circle");
	}

	public Circle(String color, double radius) {
		m_color = color;
		m_radius = radius;
		System.out.println("we are creating in a circle2");

	}

	public double CalculateArea() {
		double area = 3.14 * m_radius * m_radius;
		return area;
	}

	public void PrintColor()
	{
		System.out.println("my color is :" + m_color);
	}

	public static void main(String[] args) {
		Circle myCircle = new Circle(6.0);
		Circle myCircle2 = new Circle("red", 6.);
		double area = myCircle.CalculateArea();
		double area2 = myCircle2.CalculateArea();
		System.out.println(area);
		System.out.println(area2);

		myCircle.PrintColor();
		myCircle2.PrintColor();
	}
	}

