package exo2;

public class main2 {

	public static void main(String[] args) {
		
		//Test Array book and authors
		// Declare and allocate an array of Authors
		AuthorArray[] authors = new AuthorArray[3];
		authors[0] = new AuthorArray("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
		authors[1] = new AuthorArray("Paul Tan", "Paul@nowhere.com", 'm');
		authors[2] = new AuthorArray("Flo le rigolo", "Flo@nowhere.com", 'm');

		// Declare and allocate a Book instance
		BookArray javaDummy = new BookArray("Java for Dummy", authors, 19.99, 99);
		System.out.println(javaDummy.getAuthorNames());  // toString()
		
		BookArray dummyBook = new BookArray("Java for dummy", authors, 19.95, 99);  // Test Book's Constructor
		dummyBook.setPrice(29.95);
		dummyBook.setQty(28);
		System.out.println("name is: " + dummyBook.getName());
		System.out.println("price is: " + dummyBook.getPrice());
		System.out.println("qty is: " + dummyBook.getQty());
		System.out.println("Author's name is: " + dummyBook.getAuthorNames());
		System.out.println("Author's email is: " + dummyBook.getAuthorEmail());

		// Use an anonymous instance of Author to construct a Book instance
		AuthorArray[] test = new AuthorArray[1];
		test[0] = new AuthorArray("Paul Tan", "paul@somewhere.com", 'm');
		BookArray anotherBook = new BookArray("more Java", test, 29.95);
		System.out.println(anotherBook);  // toString()
		
		System.out.println();
		
		//Test book and authors
		Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
		System.out.println(a1);

		a1.setEmail("ahteck@somewhere.com");
		System.out.println(a1);
		System.out.println("name is: " + a1.getName());
		System.out.println("email is: " + a1.getEmail());

		// Test Book class
		Book b1 = new Book("12345", "Java for dummies", a1, 8.8, 88);
		System.out.println(b1);

		b1.setPrice(9.9);
		b1.setQty(99);
		System.out.println(b1);
		System.out.println("isbn is: " + b1.getName());
		System.out.println("name is: " + b1.getName());
		System.out.println("price is: " + b1.getPrice());
		System.out.println("qty is: " + b1.getQty());
		System.out.println("author is: " + b1.getAuthor());  // Author's toString()
		System.out.println("author's name: " + b1.getAuthorName());
		System.out.println("author's name: " + b1.getAuthor().getName());
		System.out.println("author's email: " + b1.getAuthor().getEmail());
		
		System.out.println();
		
		//Test Customer AND Invoice
		//Test Customer class
		Customer1 c1 = new Customer1(88, "Tan Ah Teck", 10);
		System.out.println(c1);  // Customer's toString()

		c1.setDiscount(8);
		System.out.println(c1);
		System.out.println("id is: " + c1.getID());
		System.out.println("name is: " + c1.getName());
		System.out.println("discount is: " + c1.getDiscount());

		// Test Invoice class
		Invoice inv1 = new Invoice(101, c1, 888.8);
		System.out.println(inv1);

		inv1.setAmount(999.9);
		System.out.println(inv1);
		System.out.println("id is: " + inv1.getID());
		System.out.println("customer is: " + inv1.getCustomer());  // Customer's toString()
		System.out.println("amount is: " + inv1.getAmount());
		System.out.println("customer's id is: " + inv1.getCustomerID());
		System.out.println("customer's name is: " + inv1.getCustomerName());
		System.out.println("customer's discount is: " + inv1.getCustomerDiscount());
		System.out.printf("amount after discount is: %.2f%n", inv1.getAmountAfterDiscount());
		
		System.out.println();
		
		//Test Customer AND Account class
		Customer cus1 = new Customer(88, "Tan Ah Teck", 'm');
		Account ac1 = new Account(88, cus1, 800.00);
		System.out.println(cus1);  // Customer's toString()

		System.out.println("id is: " + cus1.getID());
		System.out.println("name is: " + cus1.getName());
		System.out.println("gender is: " + cus1.getGender());
		
		Customer cus2 = new Customer(89, "Bastien", 'm');
		Account ac2 = new Account(89, cus2, 700.00);
		
		System.out.println(ac2.deposit(300));
		System.out.println(ac2.withdraw(2000));
		System.out.println(ac1.getBalance());  // Customer's toString()
		System.out.println(ac2.getBalance());  // Customer's toString()

		
		System.out.println();
		
		// Test program to test all constructors and public methods
		MyPoint p1 = new MyPoint();  // Test constructor
		System.out.println(p1);      // Test toString()
		p1.setX(8);   // Test setters
		p1.setY(6);
		System.out.println("x is: " + p1.getX());  // Test getters
		System.out.println("y is: " + p1.getY());
		p1.setXY(3, 0);   // Test setXY()
		System.out.println(p1.getXY()[0]);  // Test getXY()
		System.out.println(p1.getXY()[1]);
		System.out.println(p1);

		MyPoint p2 = new MyPoint(0, 4);  // Test another constructor
		System.out.println(p2);
		// Testing the overloaded methods distance()
		System.out.println(p1.distance(p2));    // which version?
		System.out.println(p2.distance(p1));    // which version?
		System.out.println(p1.distance(5, 6));  // which version?
		System.out.println(p1.distance());      // which version?
		
		MyPoint[] points = new MyPoint[10];  // Declare and allocate an array of MyPoint
		for (int i = 0; i < points.length; i++) {
		   points[i] = new MyPoint(i, i);    // Allocate each of MyPoint instances
		}
		
		int cpt = 0;
		while (cpt < 10) {
			System.out.println(points[cpt]);
			++cpt;
		}
		
		System.out.println();
		
		
		//Test MyLine AND MyPoint
		//A FAIRE
		
		//Test MyCircle
		// Test program to test all constructors and public methods
		MyPoint center = new MyPoint(3, 6);// Test toString()
		MyCircle cir1 = new MyCircle(center, 2);  // Test constructor
		System.out.println(cir1);  
		System.out.println("x is: " + cir1.getCenterX());  // Test getters
		System.out.println("y is: " + cir1.getCenterY());
		cir1.setCenterXY(3, 0);   // Test setXY()
		System.out.println(cir1.getCenterXY()[0]);  // Test getXY()
		System.out.println(cir1.getCenterXY()[1]);
		System.out.println(cir1);

		MyPoint point2 = new MyPoint(0, 4);  // Test another constructor
		System.out.println(p2);
		// Testing the overloaded methods distance()
		System.out.println(center.distance(point2));    // which version?
		System.out.println(point2.distance(center));    // which version?
		System.out.println(center.distance(5, 6));  // which version?
		System.out.println(center.distance());      // which version?
		
		

	}

}
