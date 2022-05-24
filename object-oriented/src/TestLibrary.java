import com.ibm.lib.Book;
import com.ibm.lib.Member;

public class TestLibrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1=new Book("the Alchemist");
		Member m1=new Member("Polo");
		
		/////////////////logic to issue and return 
		b1.issueBook(m1);
		b1.status();
		m1.status();
		
		b1.returnBook(m1);
		b1.status();
		m1.status();

	}

}
