
public class DataStore_1 extends DataStore{
	private double temp_A; // store the temporary price for regular gas.
	private double temp_cash; // store the temporary cash.
	private double cash; // contains the value of cash deposited.
	private double price; // contains the price of selected gas.
	private int G; // contains the number of gallons already pumped.
	private int w; //cash or credit flag, 0 is cash, 1 is credit.

	public double getTemp_A(){
		return temp_A;
	}
	public double getTemp_cash(){
		return temp_cash;
	}
	public double getCash(){
		return cash;
	}
	public double getPrice(){
		return price;
	}
	public int getG(){
		return G;
	}
	public int getW(){
		return w;
	}
	public void setTemp_A(double a){
		this.temp_A = a;
	}
	public void setTemp_cash(double c){
		this.temp_cash = c;
	}
	public void setCash(double cash){
		this.cash = cash;
	}
	public void setPrice(double price){
		this.price = price;
	}
	public void setG(int G){
		this.G = G;
	}
	public void setW(int w){
		this.w = w;
	}
}
