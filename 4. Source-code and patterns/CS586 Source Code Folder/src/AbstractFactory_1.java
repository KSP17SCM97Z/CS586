
public class AbstractFactory_1 extends AbstractFactory{
	DataStore d;
	StoreData sd;
	PayMsg pm;
	ReadyMsg rdm;
	StoreCash sc;
	DisplayMenu dm;
	RejectMsg rm;
	SetW sw;
	SetInitialValues siv;
	PumpGasUnit pgu;
	GasPumpedMsg gpm;
	StopMsg sm;
	PrintReceipt pr;
	CancelMsg cm;
	
	public AbstractFactory_1(DataStore d){
		this.d = d;
	}
	
	public void storeData() {
		sd = new StoreData_1();
		sd.storeData(d);
	}
	
	public void payMsg() {
		pm = new PayMsg_1();
		pm.display();
	}
	
	public void storeCash() {
		sc = new StoreCash();
		sc.storeCash(d);
	}
	
	public void displayMenu() {
		dm = new DisplayMenu_1();
		dm.display();
	}
	
	public void rejectMsg() {
		rm = new RejectMsg();
		rm.display();
	}
	
	public void setW(int k) {
		sw = new SetW();
		sw.setW(d, k);
	}
	
	public void setInitialValues() {
		siv = new SetInitialValues_1();
		siv.setInitialValues(d);
	}
	
	public void pumpGasUnit() {
		pgu = new PumpGasUnit_1();
		pgu.pumpGasUnit(d);
	}
	
	public void gaspumpedMsg() {
		gpm = new GasPumpedMsg_1();
		gpm.display();
	}
	
	public void stopMsg() {
		sm = new StopMsg_1();
		sm.display();
	}
	
	public void printReceipt() {
		pr = new PrintReceipt_1();
		pr.display(d);
	}
	
	public void cancelMsg() {
		cm = new CancelMsg();
		cm.display();
	}
	
	public void readMsg() {
		rdm = new ReadyMsg();
		rdm.display();
	}
}
