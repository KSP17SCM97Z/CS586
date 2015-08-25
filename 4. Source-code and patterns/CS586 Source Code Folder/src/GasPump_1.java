
public class GasPump_1 {
	MDA_EFSM m;
	DataStore d;
	AbstractFactory af;
	
	public GasPump_1(){
		m = new MDA_EFSM();
		d = new DataStore_1();
		af = new AbstractFactory_1(d);
	}
	
	public void activate(double a){
		if (a > 0){
			d.setTemp_A(a);
			m.activate(af);
		}
	}
	
	public void start(){
		m.start(af);
	}
	
	public void payCredit(){
		m.payCredit(af);
	}
	
	public void reject(){
		m.reject(af);
	}
	
	public void cancel(){
		m.cancel(af);
	}
	
	public void approved(){
		m.approved(af);
	}
	
	public void payCash(double c){
		if (c > 0){
			d.setTemp_cash(c);
			m.payCash(af);
		}
	}
	
	public void startPump(){
		m.selectGas(1, af);
		m.startPump(af);
	}
	
	public void pumpGallon(){
		if (d.getW() == 1){
			m.pump(af);
		}
		else if (d.getW() == 0){
			if (d.getCash() < (d.getG() + 1) * d.getPrice()){
				m.stopPump(af);
				m.receipt(af);
			}
			else {
				m.pump(af);
			}
		}
	}
	
	public void stopPump(){
		m.stopPump(af);
		m.receipt(af);
	}
}
