package exo2;

public class MyLine {
	
	private MyPoint begin;
	private MyPoint end;
	
	private MyLine(int x1, int y1, int x2, int y2) {
		this.begin.setXY(x1, y1);
		this.end.setXY(x2, y2);
	}
	
	public MyLine(MyPoint begin, MyPoint end) {
		this.begin = begin;
		this.end = end;
	}

	public MyPoint getBegin() {
		return begin;
	}

	public void setBegin(MyPoint begin) {
		this.begin = begin;
	}

	public MyPoint getEnd() {
		return end;
	}
	
	public int getBeginX() {
		return this.begin.getX();
	}
	
	public void setBeginX(int x) {
		this.begin.setX(x);
	}
	
	public int getBeginY() {
		return this.begin.getY();
	}
	
	public void setBeginY(int y) {
		this.begin.setY(y);
	}
	
	public int getEndX() {
		return this.end.getX();
	}
	
	public void setEndX(int x) {
		this.end.setX(x);
	}
	
	public int getEndY() {
		return this.end.getY();
	}
	
	public void setEndY(int y) {
		this.end.setY(y);
	}
	
	public int[] getBeginXY() {
		int[] couple = new int[2];
		couple[0] = this.begin.getX();
		couple[1] = this.begin.getY();
		return couple;
	}
	
	public void setBeginXY(int x, int y) {
		this.begin.setX(x);
		this.begin.setY(y);
	}
	
	public int[] getEndXY() {
		int[] couple = new int[2];
		couple[0] = this.end.getX();
		couple[1] = this.end.getY();
		return couple;
	}
	
	public void setEndXY(int x, int y) {
		this.end.setX(x);
		this.end.setY(y);
	}

	public void setEnd(MyPoint end) {
		this.end = end;
	}
	
	public double getLength() {
		return Math.sqrt(this.begin.getX() * this.begin.getX() + this.begin.getY() * this.begin.getY());
	}
	
	//A FAIRE GET GRADIENT

	public String toString() {
		return "MyLine [begin=" + begin.toString() + ", end=" + end.toString() + "]";
	}
	
	

}
