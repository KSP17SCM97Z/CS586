
public class DataStore_3 extends DataStore{
	private double temp_A; // store the temporary price for regular gas.
	private double temp_B; // store the temporary price for premium gas.
	private double A; // store the price for regular gas.
	private double B; // store the price for super gas.
	private double temp_cash; // store the temporary cash.
	private double cash; // contains the value of cash deposited.
	private double price; // contains the price of selected gas.
	private int L; // contains the number of gallons already pumped.
	
	public double getTemp_A(){
		return temp_A;
	}
	
	public double getTemp_B(){
		return temp_B;
	}
	
	public double getA() {
		return A;
	}
	
	public double getB() {
		return B;
	}
	
	public double getCash(){
		return cash;
	}
	
	public double getTemp_cash(){
		return temp_cash;
	}
	
	public double getPrice(){
		return price;
	}
	
	public int getL(){
		return L;
	}
	
	public void setTemp_A(double a){
		this.temp_A = a;
	}
	
	public void setTemp_B(double b){
		this.temp_B = b;
	}
	
	public void setA(double a) {
		this.A = a;
	}
	
	public void setB(double b) {
		this.B = b;
	}
	
	public void setTemp_cash(double temp_cash){
		this.temp_cash = temp_cash;
	}
	
	public void setCash(double cash){
		this.cash = cash;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	
	public void setL(int L){
		this.L = L;
	}

}