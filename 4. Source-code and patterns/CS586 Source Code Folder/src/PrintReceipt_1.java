
public class PrintReceipt_1 extends PrintReceipt {
	public void display(DataStore d){
		double totalPrice = d.getG() * d.getPrice();
		System.out.println("Receipt:\n\tTotal gallons: " + d.getG());
		System.out.println("\tPrice per gallon: " + d.getPrice());
		System.out.println("\tTotal: $" + totalPrice);
	}
}
