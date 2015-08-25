
public class State_4 extends State{
	public int getID() {
		ID = 5;
		return ID;
	}
	public void startPump(OP op, AbstractFactory af) {
		op.setInitialValues(af);
		op.readyMsg(af);
	}
}
