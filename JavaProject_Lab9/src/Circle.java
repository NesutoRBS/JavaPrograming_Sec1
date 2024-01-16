
public class Circle {
	
	public static final double DEFAULT_RADIUS = 1.0;
	public static final String DEFAULT_COLOR = "red";
	
	private double radius = 1.0;
	private String color = "red";
	
	Circle() {
		this.radius = DEFAULT_RADIUS;
		this.color = DEFAULT_COLOR;
	}
	
	Circle(double radius) {
		this.radius = radius;
		this.color = DEFAULT_COLOR;
	}
	
	Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		return "Circle[radius=" + radius + ", color=" + color + "]";
	}
	
	public double getArea() {
		return Math.PI*Math.pow(getRadius(), 2);
	}
	
	public double getCircumference() {
		return 2.0*Math.PI*getRadius();
	}
	
}
