package in.co.rays.ioc;

public class Order1 {

	private Inventory inventory;

	private Payment payment;

	public void setInventory(Inventory inventory) {

		this.inventory = inventory;
	}

	public void setPayment(Payment payment) {

		this.payment = payment;
	}

	public void boolATicket(int item) {

		int price = 10;

		double totalAmount = item * price;

		double updatedBalance = payment.makePayment(totalAmount);

		double updatedStock = inventory.sold(item);

		System.out.println("Price per Item" + price);
		System.out.println("Total Items" + item);
		System.out.println("totalAmount" + totalAmount);
		System.out.println("updatedBalance" + updatedBalance);
		System.out.println("updatedStock" + updatedStock);

	}

}
