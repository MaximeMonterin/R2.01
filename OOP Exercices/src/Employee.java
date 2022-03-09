public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	
	public Employee(int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public String getName() {
		return this.firstName + " " + this.lastName;
	}
	
	public int getSalary() {
		return this.salary;
	}
	
	public void setSalary(int newSalary) {
		this.salary = newSalary;
	}
	
	public int getAnnualSalary() {
		return this.salary * 12;
	}
	
	//Raise a salary with a chosen percentage
	public int raiseSalary(int percent) {
		double percentage = (double)percent / 100 * salary;
		this.salary = salary + (int)percentage;
		return this.salary;
	}
	
	public String toString() {
		return "Employee[id = " + this.id + ", Name = " + this.getName() + ", salary = " + this.salary + "]";
	}	

}
