package exo2;

public class MyRectangle {
	
	private MyPoint topLeft;
	private MyPoint bottomRight;
	
	public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
		this.topLeft = topLeft;
		this.bottomRight = bottomRight;
	}

	public MyPoint getTopLeft() {
		return topLeft;
	}

	public void setTopLeft(MyPoint topLeft) {
		this.topLeft = topLeft;
	}

	public MyPoint getBottomRight() {
		return bottomRight;
	}

	public void setBottomRight(MyPoint bottomRight) {
		this.bottomRight = bottomRight;
	}
	
	public double getArea() {
		double area = this.topLeft.distance(this.bottomRight);
		return area;
	}
	
	

}
