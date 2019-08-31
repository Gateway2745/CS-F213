
public class TestsStore {

	public static void main(String[] args) {
		Customer cust = new Customer("rohit", "1", 1000.0);
		Item item1 = new Item("clock", "1", 1, 600.0);
		Item item2 = new Item("pant", "1", 2, 300.0);
		cust.buyItem(item1);
		cust.buyItem(item2);
	}

}
