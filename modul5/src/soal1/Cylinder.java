package soal1;

public class Cylinder extends Shape{
	private double radius, height;
	public Cylinder(double r, double h)
	{
		super("Cylinder");
		radius = r;
		height = h;
	}

	@Override
	public double area()
	{
		return Math.PI * (radius * radius) * height;
	}
	
	@Override
	public String toString()
	{
		return super.toString() + " radius " + radius + " height " + height;
	}
}
