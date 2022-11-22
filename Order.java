
public class Order implements Cloneable {
	private int orderNum, clientID;
	
	public Order clone() throws CloneNotSupportedException{
		Order clone = (Order)super.clone();
		return clone;
	}

}
