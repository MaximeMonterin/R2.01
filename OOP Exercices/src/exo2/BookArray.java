package exo2;
public class BookArray {
	
	private String name;
	private AuthorArray[] author;
	private double price;
	private int qty = 0;

	public BookArray(String name, AuthorArray[] author, double price) {
		this.name = name;
		this.author = author;
		this.price = price;
	}
	
	public BookArray(String name, AuthorArray[] author, double price, int qty) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AuthorArray[] getAuthor() {
		return author;
	}

	public void setAuthor(AuthorArray[] author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public String getAuthorNames() {
		String authors = null;
		for(int i = 0; i < this.author.length; ++i) {
			authors += ", " + this.author[i].getName();
		}
		return authors;
	}
	
	public String getAuthorEmail() {
		String email = null;
		for(int i = 0; i < this.author.length; ++i) {
			email += ", " + this.author[i].getEmail();
		}
		return email;
	}

	public String toString() {
		return "Book [name=" + this.name + ", authors=" + this.author + ", price=" + this.price + ", qty=" + this.qty + "]";
	}
	
	
}
