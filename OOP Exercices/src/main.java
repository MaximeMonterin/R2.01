public class main {

	public static void main(String[] args) {
		
		//Circle class test (creates circles)
	      // Declare an instance of Circle class called c1.
	      // Construct the instance c1 by invoking the "default" constructor
	      // which sets its radius and color to their default value.
	      Circle c1 = new Circle();
	      // Invoke public methods on instance c1, via dot operator.
	      System.out.println("The circle has radius of " 
	         + c1.getRadius() + " and area of " + c1.getArea());
	      //The circle has radius of 1.0 and area of 3.141592653589793
	   
	      // Declare an instance of class circle called c2.
	      // Construct the instance c2 by invoking the second constructor
	      // with the given radius and default color.
	      Circle c2 = new Circle(2.0);
	      // Invoke public methods on instance c2, via dot operator.
	      System.out.println("The circle has radius of " 
	         + c2.getRadius() + " and area of " + c2.getArea());
	      //The circle has radius of 2.0 and area of 12.566370614359172
	      Circle c3 = new Circle();   // construct an instance of Circle
	      c3.setRadius(5.5);          // change radius
	      System.out.println("radius is: " + c3.getRadius()); // Print radius via getter
	      c3.setColor("green");       // Change color
	      System.out.println("color is: " + c3.getColor());   // Print color via getter

	      // You cannot do the following because setRadius() returns void, which cannot be printed
	      //System.out.println(c3.setRadius(4.4));
	      
	      
	      System.out.println();
	      

		//AnotherCircleClass class test (creates circles)

		AnotherCircleClass c4 = new AnotherCircleClass(1.1);
		System.out.println(c4);   // toString()
		AnotherCircleClass c5 = new AnotherCircleClass(); // default constructor
		System.out.println(c5);

		// Test setter and getter
		c4.setRadius(2.2);
		System.out.println(c4);      // toString()
		System.out.println("radius is: " + c4.getRadius());

		// Test getArea() and getCircumference()
		System.out.printf("area is: %.2f%n", c4.getArea());
		System.out.printf("circumference is: %.2f%n", c4.getCircumference());
		

		System.out.println();
		
		
		//Rectangle class test (creates rectangles)
		
		// Test constructors and toString()
		// You need to append a 'f' or 'F' to a float literal
		Rectangle r1 = new Rectangle(1.2f, 3.4f);
		System.out.println(r1);  // toString()
		Rectangle r2 = new Rectangle();  // default constructor
		System.out.println(r2);

		// Test setters and getters
		r1.setLength(5.6f);
		r1.setWidth(7.8f);
		System.out.println(r1);  // toString()
		System.out.println("length is: " + r1.getLength());
		System.out.println("width is: " + r1.getWidth());

		// Test getArea() and getPerimeter()
		System.out.printf("area is: %.2f%n", r1.getArea());
		System.out.printf("perimeter is: %.2f%n", r1.getPerimeter());
		

		System.out.println();
		
		
		//Employee class test (creates employees)
		
		// Test constructor and toString()
		Employee e1 = new Employee(8, "Peter", "Tan", 2500);
		System.out.println(e1);  // toString();

		// Test Setters and Getters
		e1.setSalary(999);
		System.out.println(e1);  // toString();
		System.out.println("id is: " + e1.getId());
		System.out.println("firstname is: " + e1.getFirstName());
		System.out.println("lastname is: " + e1.getLastName());
		System.out.println("salary is: " + e1.getSalary());

		System.out.println("name is: " + e1.getName());
		System.out.println("annual salary is: " + e1.getAnnualSalary()); // Test method

		// Test raiseSalary()
		System.out.println(e1.raiseSalary(10));
		System.out.println(e1);

		
		System.out.println();
		
		
		//InvoiceItem class test (creates items for the stock managment)
		
		// Test constructor and toString()
		InvoiceItem inv1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
		System.out.println(inv1);  // toString();

		// Test Setters and Getters
		inv1.setQty(999);
		inv1.setUnitPrice(0.99);
		System.out.println(inv1);  // toString();
		System.out.println("id is: " + inv1.getId());
		System.out.println("desc is: " + inv1.getDesc());
		System.out.println("qty is: " + inv1.getQty());
		System.out.println("unitPrice is: " + inv1.getUnitPrice());

		// Test getTotal()
		System.out.println("The total is: " + inv1.getTotal());

		
		System.out.println();
		
		
		//Account class test

		// Test constructor and toString()
		Account a1 = new Account("A101", "Tan Ah Teck", 88);
		System.out.println(a1);  // toString();
		Account a2 = new Account("A102", "Kumar"); // default balance
		System.out.println(a2);

		// Test Getters
		System.out.println("ID: " + a1.getId());
		System.out.println("Name: " + a1.getName());
		System.out.println("Balance: " + a1.getBalance());

		// Test credit() and debit()
		a1.credit(100);
		System.out.println(a1);
		a1.debit(50);
		System.out.println(a1);
		a1.debit(500);  // debit() error
		System.out.println(a1);

		// Test transfer()
		a1.transferTo(a2, 100);  // toString()
		System.out.println(a1);
		System.out.println(a2);

		
		System.out.println();
		
		
		//Date class test
		// Test constructor and toString()
		Date d1 = new Date(1, 2, 2014);
		System.out.println(d1);  // toString()

		// Test Setters and Getters
		d1.setMonth(12);
		d1.setDay(9);
		d1.setYear(2099);
		System.out.println(d1);  // toString()
		System.out.println("Month: " + d1.getMonth());
		System.out.println("Day: " + d1.getDay());
		System.out.println("Year: " + d1.getYear());

		// Test setDate()
		d1.setDate(3, 4, 2016);
		System.out.println(d1);  // toString()

		
		System.out.println();
		
		
		//Time class test
		// Test constructors and toString()
		Time t1 = new Time(1, 2, 3);
		System.out.println(t1);  // toString()

		// Test Setters and Getters
		t1.setHour(4);
		t1.setMinute(5);
		t1.setSecond(6);
		System.out.println(t1);  // toString()
		System.out.println("Hour: " + t1.getHour());
		System.out.println("Minute: " + t1.getMinute());
		System.out.println("Second: " + t1.getSecond());

		// Test setTime()
		t1.setTime(23, 59, 58);
		System.out.println(t1);  // toString()

		// Test nextSecond();
		System.out.println(t1.nextSecond());
		System.out.println(t1.nextSecond().nextSecond());

		// Test previousSecond()
		System.out.println(t1.previousSecond());
		System.out.println(t1.previousSecond().previousSecond());

		
		System.out.println();
		
		
		// Test constructor and toString()
		Ball ball = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
		System.out.println(ball);  // toString()

		// Test Setters and Getters
		ball.setX(80.0f);
		ball.setY(35.0f);
		ball.setRadius(5);
		ball.setXDelta(4.0f);
		ball.setYDelta(6.0f);
		System.out.println(ball);  // toString()
		System.out.println("x is: " + ball.getX());
		System.out.println("y is: " + ball.getY());
		System.out.println("radius is: " + ball.getRadius());
		System.out.println("xDelta is: " + ball.getXDelta());
		System.out.println("yDelta is: " + ball.getYDelta());

		// Bounce the ball within the boundary
		float xMin = 0.0f;
		float xMax = 100.0f;
		float yMin = 0.0f;
		float yMax = 50.0f;
		for (int i = 0; i < 15; i++) {
			ball.move();
			System.out.println(ball);
			float xNew = ball.getX();
			float yNew = ball.getY();
			int radius = ball.getRadius();
			// Check boundary value to bounce back
			if ((xNew + radius) > xMax || (xNew - radius) < xMin) {
				ball.reflectHorizontal();
			}
			if ((yNew + radius) > yMax || (yNew - radius) < yMin) {
				ball.reflectVertical();
			}
		}
		
	}

}
