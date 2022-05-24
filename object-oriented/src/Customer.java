
public class Customer {
	private int custId;
	private String custName;
	private double creditLimit;
	private static int counter=1;
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Customer(String custName, double creditLimit) {
		super();
		this.custId = counter++;
		this.custName = custName;
		this.creditLimit = creditLimit;
	}
	
	
	public double getCreditLimit() {
		return creditLimit;
	}
	public void showDetails() {
		System.out.println("Cust ID: "+custId);
		System.out.println("Cust name: "+custName);
		System.out.println("Credit Limit: "+creditLimit);
	}

}
