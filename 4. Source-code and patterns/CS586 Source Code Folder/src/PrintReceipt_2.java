
public class PrintReceipt_2 extends PrintReceipt {
	public void display(DataStore d){
		double totalPrice = d.getL() * d.getPrice();
		System.out.println("Receipt:\n\tTotal liters: " + d.getL());
		System.out.println("\tPrice per liter: " + d.getPrice());
		System.out.println("\tTotal: $" + totalPrice);
	}
}
