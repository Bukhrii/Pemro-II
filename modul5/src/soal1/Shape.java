package soal1;

public abstract class Shape {
	protected String shapeName;
	
	public Shape(String n) {
		shapeName = n;
	}
	
	public abstract double area();
	
	public String toString() {
		return shapeName;
	};
}
