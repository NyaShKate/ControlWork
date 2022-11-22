
public class Client {
	
	private Order order;
	
	public Client(Order order) {
		this.order = order;
	}
	
	public Order cloneOrder() throws CloneNotSupportedException{
		return (Order) this.order.clone();
	}

}
