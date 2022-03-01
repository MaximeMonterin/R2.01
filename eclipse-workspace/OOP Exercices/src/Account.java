public class Account {
	private String id;
	private String name;
	private int balance = 0;
	
	public Account(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Account(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	public String getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getBalance() {
		return this.balance;
	}
	
	public int credit(int amount) {
		this.balance = this.balance + amount;
		return balance;
	}
	
	public int debit(int amount) {
		if (amount <= this.balance) {
			this.balance -= amount;
		} else {
			System.out.println("Amount exceeded balance");
		}
		return this.balance;
	}
	
	public int transferTo(int amount, Account another) {
		if (amount <= this.balance) {
			another.balance += amount;
			this.balance -= amount;
		} else {
			System.out.println("Amount exceeded balance");
		}
		return this.balance;
	}
}
