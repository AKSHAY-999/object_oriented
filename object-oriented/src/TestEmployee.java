import com.ibm.emp.Executive;
import com.ibm.emp.Manager;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Employee e1=new Employee("Polo",0400);
//		e1.payslip();
//		Employee e2=new Employee("lilli",5000);
//		e2.payslip();
		
		Manager m1=new Manager("Milli",5000,2000);
		showSalary(m1);
		Executive x1=new Executive("Jack",3000,1000);
		showSalary(x1);
//		m1.payslip();
//		System.out.println("Mnager sakary: "+m1.getSalary());

	}

	private static void showSalary(Executive x1) {
		// TODO Auto-generated method stub
		System.out.println("Executive salary: "+x1.getSalary());
	}

	private static void showSalary(Manager m1) {
		// TODO Auto-generated method stub
		System.out.println("Manager salary: "+m1.getSalary());
	}

}
