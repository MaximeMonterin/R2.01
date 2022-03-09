package exo2;

public class MyTriangle {
	private MyPoint v1;
	private MyPoint v2;
	private MyPoint v3;
	
	public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
	}
	
	public MyPoint getV1() {
		return v1;
	}
	
	public void setV1(MyPoint v1) {
		this.v1 = v1;
	}
	
	public MyPoint getV2() {
		return v2;
	}
	
	public void setV2(MyPoint v2) {
		this.v2 = v2;
	}
	
	public MyPoint getV3() {
		return v3;
	}
	
	public void setV3(MyPoint v3) {
		this.v3 = v3;
	}

	public double getPerimeter() {
		double perim = v1.distance(v2) + v2.distance(v3) + v1.distance(v3);
		return perim;
	}
	
	public String getType() {
		String type = "";
		double v1DISv2 = v1.distance(v2);
		double v1DISv3 = v1.distance(v3);
		double v2DISv3 = v2.distance(v3);
		
		if (v1DISv2 == v1DISv3 && v1DISv2 == v2DISv3) {
			type = "equilateral";
		} else if (v1DISv2 == v1DISv3 || v1DISv2 == v2DISv3 || v2DISv3 == v1DISv2) {
			type = "isoscele";
		} else {
			type = "scalene";
		}
		
		return type;
	}
	public String toString() {
		return "MyTriangle [v1=" + v1.toString() + ", v2=" + v2.toString() + ", v3=" + v3.toString() + "]";
	}
	
	

}
