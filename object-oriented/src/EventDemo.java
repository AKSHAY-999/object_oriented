class EventImpl implements Event{
	public void perform() {
		System.out.println("Fprst Performance");
		
	}
}




public class EventDemo{
	class InnerEventImpl implements Event{

		@Override
		public void perform() {
			// TODO Auto-generated method stub
			System.out.println("Second Performance");
			
		}
		
	}
	
	public static void main(String[] args) {
		EventImpl ei=new EventImpl();
		ei.perform();
		
		EventDemo demo= new EventDemo();
		InnerEventImpl inner=demo.new InnerEventImpl();
		inner.perform();
		
	}
	
}