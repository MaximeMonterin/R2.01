package exo2;

public class Invoice {
	
	private int id;
	private Customer1 customer;
	private double amount;
	
	public Invoice(int id, Customer1 customer, double amount) {
		this.id = id;
		this.customer = customer;
		this.amount = amount;
	}

	public int getID() {
		return id;
	}

	public void setID(int id) {
		this.id = id;
	}

	public Customer1 getCustomer() {
		return customer;
	}

	public void setCustomer(Customer1 customer) {
		this.customer = customer;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public String getCustomerName() {
		return customer.getName();
	}
	
	public int getCustomerID() {
		return customer.getID();
	}
	
	public int getCustomerDiscount() {
		return customer.getDiscount();
	}
	
	public double getAmountAfterDiscount() {
		double calcul = (this.amount * customer.getDiscount()) / 100;
		return this.amount -= calcul;
	}

	public String toString() {
		return "Invoice [id=" + id + ", customer=" + customer.toString() + ", amount=" + amount + "]";
	}
	
	

}
