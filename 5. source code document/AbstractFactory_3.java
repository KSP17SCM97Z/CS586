
public class AbstractFactory_3 extends AbstractFactory {
	DataStore d;
	StoreData sd;
	PayMsg pm;
	StoreCash sc;
	DisplayMenu dm;
	SetPrice sp;
	SetInitialValues siv;
	PumpGasUnit pgu;
	GasPumpedMsg gpm;
	StopMsg sm;
	PrintReceipt pr;
	CancelMsg cm;
	
	public AbstractFactory_3(DataStore d){
		this.d = d;
	}
	
	public void storeData() {
		sd = new StoreData_2();
		sd.storeData(d);
	}
	
	public void payMsg() {
		pm = new PayMsg_3();
		pm.display();
	}
	
	public void storeCash() {
		sc = new StoreCash();
		sc.storeCash(d);
	}
	
	public void displayMenu() {
		dm = new DisplayMenu_3();
		dm.display();
	}
	
	public void setPrice(int g){
		sp = new SetPrice_2();
		sp.setPrice(d, g);
	}
	
	public void setInitialValues() {
		siv = new SetInitialValues_2();
		siv.setInitialValues(d);
	}
	
	public void pumpGasUnit() {
		pgu = new PumpGasUnit_2();
		pgu.pumpGasUnit(d);
	}
	
	public void gaspumpedMsg() {
		gpm = new GasPumpedMsg_2();
		gpm.display();
	}
	public void stopMsg() {
		sm = new StopMsg_2();
		sm.display();
	}
	
	public void printReceipt() {
		pr = new PrintReceipt_2();
		pr.display(d);
	}
	
	public void cancelMsg() {
		cm = new CancelMsg();
		cm.display();
	}
}