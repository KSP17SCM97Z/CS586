
public class State_3 extends State{
	public int getID() {
		ID = 4;
		return ID;
	}
	public void cancel(OP op, AbstractFactory af) {
		op.cancelMsg(af);
	}
	public void selectGas(int g, OP op, AbstractFactory af) {
		op.setPrice(g, af);
	}
}
