import graphics.Circle;
import graphics.Rectangle;
import utility.Calculator;
public class Test 
{
	public static void main(String[] args) 
	{
		Circle c1 = new Circle(4.5);
		Rectangle r1 = new Rectangle(5.0,6.0);
		System.out.println(c1.area());
		System.out.println(r1.area());
		System.out.println(Calculator.square(14));
	}

}
