package exo2;

public class MyCircle {
	
	private MyPoint center;
	private int radius;
	
	public MyCircle() {
		this.radius = 1;
	}
	
	public MyCircle(MyPoint center, int radius) {
		this.center.setX(center.getX());
		this.center.setY(center.getY());
		this.radius = radius;
	}

	public MyPoint getCenter() {
		return center;
	}

	public void setCenter(MyPoint center) {
		this.center = center;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public int getCenterX() {
		return this.center.getX();
	}

	public void setCenterX(int x) {
		this.center.setX(x);
	}
	
	public int getCenterY() {
		return this.center.getY();
	}
	
	public void setCenterY(int y) {
		this.center.setY(y);
	}
	
	public int[] getCenterXY() {
		int[] couple = new int[2];
		couple[0] = this.center.getX();
		couple[1] = this.center.getY();
		return couple;
	}
	
	public void setCenterXY(int x, int y) {
		this.center.setX(x);
		this.center.setY(y);
	}
	
	public double getArea() {
		return (Math.PI*this.getRadius())*(Math.PI*this.getRadius());
	}
	
	public double getCircumference() {
		return Math.PI*this.getRadius() * 2;
	}
	
	public double distance(MyCircle another) {
		int xDiff = this.center.getX() - another.center.getX();
		int yDiff = this.center.getY() - another.center.getY();
		return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
	}
	
	public String toString() {
		return "MyCircle [center=" + center.toString() + ", radius=" + radius + "]";
	}
	
	

}
