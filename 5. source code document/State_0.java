
public class State_0 extends State{
	public int getID() {
		ID = 1;
		return ID;
	}
	public void start(OP op, AbstractFactory af) {
		op.payMsg(af);
	}
}
