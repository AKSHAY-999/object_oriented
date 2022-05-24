
public class TestAlfaBeta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alfa a=new Alfa();
//		a.demo();
		Beta b= new Beta();
//		b.test();
//		b.demo();
		Alfa ab=b;////up-casting
		ab.demo();
//		ab.test();//ero]ror 
		Beta ba=(Beta)ab;//downcasting
		ba.demo();
		ba.test();
		

	}

}
