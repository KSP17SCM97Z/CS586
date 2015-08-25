
public class AbstractFactory_2 extends AbstractFactory {
	DataStore d;
	StoreData sd;
	PayMsg pm;
	DisplayMenu dm;
	RejectMsg rm;
	SetPrice sp;
	SetInitialValues siv;
	PumpGasUnit pgu;
	GasPumpedMsg gpm;
	StopMsg sm;
	PrintReceipt pr;
	CancelMsg cm;
	
	public AbstractFactory_2(DataStore d){
		this.d = d;
	}
	
	public void storeData() {
		sd = new StoreData_2();
		sd.storeData(d);
	}
	
	public void payMsg() {
		pm = new PayMsg_2();
		pm.display();
	}
	
	public void displayMenu() {
		dm = new DisplayMenu_2();
		dm.display();
	}
	
	public void rejectMsg() {
		rm = new RejectMsg();
		rm.display();
	}
	
	public void setPrice(int g){
		sp = new SetPrice_2();
		sp.setPrice(d, g);
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
}
