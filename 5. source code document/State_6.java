
public class State_6 extends State{
	public int getID() {
		ID = 7;
		return ID;
	}
	public void receipt(OP op, AbstractFactory af) {
		op.printReceipt(af);
	}
	public void noReceipt(OP op, AbstractFactory af) {
		
	}
}
