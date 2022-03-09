package exo2;

public class Customer1 {
	
	private int id;
	private String name;
	private int discount;

	public Customer1(int id, String name, int discount) {
		this.id = id;
		this.name = name;
		this.discount = discount;
	}

	public int getID() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDiscount() {
		return this.discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return this.name + '(' + this.id + ')' + '(' + this.discount + '%' + ')' ;
	}
	
	

}
