
public class DataStore_2 extends DataStore{
	private double temp_A; // store the temporary price for regular gas.
	private double temp_B; // store the temporary price for super gas.
	private double A; // store the price for regular gas.
	private double B; // store the price for super gas.
	private double price; // contains the price of selected gas.
	private int G; // contains the number of gallons already pumped.
	
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
	
	public double getPrice(){
		return price;
	}
	
	public int getG(){
		return G;
	}
	
	public void setTemp_A(double a){
		this.temp_A = a;
	}
	
	public void setTemp_B(double b){
		this.temp_B = b;
	}
	
	public void setA(double a) {
		A = a;
	}
	
	public void setB(double b) {
		B = b;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	
	public void setG(int G){
		this.G = G;
	}

}
