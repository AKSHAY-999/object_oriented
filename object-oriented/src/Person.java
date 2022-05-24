
public class Person {
	
	private String name;
	private int age;
	
	public Person() {
		// TODO Auto-generated constructor stub
		this("anonymous",-1);
	}
	
	
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public void print() {
		System.out.println("Name: "+name+"\tAge "+age);
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: "+name +"\tage: "+age;
	}
	
	public static void main(String[] args) {
		Person p1=new Person("Polo",21);
//		p1.setState("Polo",21);
		p1.print();
		System.out.println(p1.hashCode());
		System.out.println(p1.toString());
//	
//		Person p2=new Person();
//		p2.print();
////		
	}

}
