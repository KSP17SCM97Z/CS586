
public class GasPump_2 {
	MDA_EFSM m;
	AbstractFactory af;
	DataStore_2 d;
	
	public GasPump_2(){
		m = new MDA_EFSM();
		d = new DataStore_2();
		af = new AbstractFactory_2(d);
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
	
	public void Super(){
		m.selectGas(2, af);
	}
	
	public void regular(){
		m.selectGas(1, af);
	}
	
	public void startPump(){
		m.startPump(af);
	}
	
	public void pumpGallon(){
		m.pump(af);
	}
	
	public void stopPump(){
		m.stopPump(af);
		m.receipt(af);
	}
}
