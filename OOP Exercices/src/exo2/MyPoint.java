package exo2;

public class MyPoint {
	
	private int x = 0;
	private int y = 0;
	
	public MyPoint() {
	}

	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public int[] getXY() {
		int[] couple = new int[2];
		couple[0] = this.x;
		couple[1] = this.y;
		return couple;
	}
	
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public double distance(int x, int y) {
		int xDiff = this.x - x;
		int yDiff = this.y - y;
		return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
	}
	
	public double distance(MyPoint another) {
		int xDiff = this.x - another.x;
		int yDiff = this.y - another.y;
		return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
	}
	
	public double distance() {
		return Math.sqrt(this.x * this.x + this.y * this.y);
	}

	public String toString() {
		return '(' + String.valueOf(this.x) + String.valueOf(this.y) + ')';
	}
	
	
	
	
	

}
