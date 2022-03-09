public class AnotherCircleClass {
	private double radius;

	public AnotherCircleClass() {
		this.radius = 1.0;
	}
	
	public AnotherCircleClass(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return this.radius*this.radius*Math.PI;
	}
	
	public double getCircumference() {
		return 2*Math.PI*this.radius;
	}

	public String toString() {
		return "Circle[radius = " + this.radius + "]";
	}

}
