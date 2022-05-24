import com.ibm.shop.Cart;
import com.ibm.shop.Product;

public class TestShopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cart c=new Cart();
		Product p1=new Product("Pen",100);
		
		c.addToCart(p1);
		c.addToCart(new Product("MArker ",50));
		c.addToCart(new Product("Duster",50));
		
		c.checkout();

	}

}
