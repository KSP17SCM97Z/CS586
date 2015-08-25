
public class State_1 extends State{
	public int getID() {
		ID = 2;
		return ID;
	}
	public void payCash(OP op, AbstractFactory af) {
		op.storeCash(af);
		op.setW(0, af);
		op.displayMenu(af);
	}
	public void payCredit() {
		System.out.println("Processing credit card payment...");
	}
}
