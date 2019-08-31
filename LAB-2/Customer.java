
class Customer {
	private String name;
	private String idNo;
	private double balance;
	private Item item;
	
	public Customer(String name, String idNo, double balance) {
		this.name = name;
		this.idNo = idNo;
		this.balance = balance;
	}
	
	public Customer(String name, String idNo) {
		super();
		this.name = name;
		this.idNo = idNo;
		this.balance = 5000.0;
	}

	public String getName() {
		return name;
	}

	public String getIdNo() {
		return idNo;
	}

	public double getBalance() {
		return balance;
	}

	public Item getItem() {
		return item;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}
	
	public void print() {
		System.out.printf("Item name: %s , Item Id No: %s, item quantity: %d, item price: %f, balance: %f \n", item.getItemName(),item.getItemidNo(),item.getItemQuantity(),item.getItemPrice(), balance);
	}
	
	public void buyItem(Item item) {
		this.item = item;
		if(item.getItemQuantity() < 1)
			System.out.println("Order not valid!");
		else if(balance < item.getItemQuantity() * item.getItemPrice())
			System.out.println("Insufficient Balance");
		else {
			balance -= item.getItemQuantity() * item.getItemPrice();
			print();
		}
	}
	
}
