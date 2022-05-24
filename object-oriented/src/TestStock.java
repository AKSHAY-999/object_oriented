import com.ibm.stock.Broker;
import com.ibm.stock.Exchange;
import com.ibm.stock.Holder;
import com.ibm.stock.Stock;
import com.ibm.stock.StockSingleton;

public class TestStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Holder h=StockSingleton.getStock();
//		Stock ril=new Stock();
//		Holder  h=ril;
		h.view();
		
		
		Broker b= StockSingleton.getStock();
		b.view();
		b.get();
		
		Exchange x=StockSingleton.getStock();
		x.view();
		x.get();
		x.set();
		System.out.println(h==b);
		System.out.println(b==x);

	}

}
