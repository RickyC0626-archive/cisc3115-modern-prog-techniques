public class Rectangle extends Shape {
	private double width;
	private double length;

	public Rectangle(String name, double width, double length) {
		super(name);
		this.width = width;
		this.length = length;
	}

	public double getArea() {
		return width * length;
	}

	public String toString() {
		return "RightTriangle[name=" + getName() +
			", width=" + width + ", length=" + length +
			", area=" + getArea() +
			"]";
	}
}
