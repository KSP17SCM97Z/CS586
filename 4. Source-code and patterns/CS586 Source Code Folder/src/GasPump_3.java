
public class GasPump_3 {
	MDA_EFSM m;
	DataStore d;
	AbstractFactory af;
	public GasPump_3(){
		m = new MDA_EFSM();
		d = new DataStore_3();
		af = new AbstractFactory_3(d);
	}
	
	public void activate(double a, double b){
		if (a > 0 && b > 0){
			d.setTemp_A(a);
			d.setTemp_B(b);
			m.activate(af);
		}
	}
	
	public void start(){
		m.start(af);
	}
	
	public void payCash(double c){
		if (c > 0){
			d.setCash(c);
			m.payCash(af);
		}
	}
	
	public void cancel(){
		m.cancel(af);
	}
	
	public void premium(){
		m.selectGas(2, af);
	}
	
	public void regular(){
		m.selectGas(1, af);
	}
	
	public void startPump(){
		m.startPump(af);
	}
	
	public void pumpLiter(){
		if (d.getCash() < (d.getL() + 1) * d.getPrice()){
			m.stopPump(af);
		}
		else {
			m.pump(af);
		}
	}
	
	public void stopPump(){
		m.stopPump(af);
	}
	
	public void receipt(){
		m.receipt(af);
	}
	
	public void noReceipt(){
		m.noReceipt(af);
	}
}
