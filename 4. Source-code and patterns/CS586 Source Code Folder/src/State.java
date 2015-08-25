
public abstract class State {
	int ID;
	public int getID() {return ID;}
	public void activate(OP op, AbstractFactory af) {}
	public void start(OP op, AbstractFactory af) {}
	public void payCash(OP op, AbstractFactory af) {}
	public void payCredit() {}
	public void approved(OP op, AbstractFactory af) {}
	public void reject(OP op, AbstractFactory af) {}
	public void cancel(OP op, AbstractFactory af) {}
	public void selectGas(int g, OP op, AbstractFactory af) {}
	public void startPump(OP op, AbstractFactory af) {}
	public void pumpGas(OP op, AbstractFactory af) {}
	public void stopPump(OP op, AbstractFactory af) {}
	public void receipt(OP op, AbstractFactory af) {}
	public void noReceipt(OP op, AbstractFactory af) {}
}
