
public class State_2 extends State{
	public int getID() {
		ID = 3;
		return ID;
	}
	public void approved(OP op, AbstractFactory af) {
		op.setW(1, af);
		op.displayMenu(af);
	}
	public void reject(OP op, AbstractFactory af) {
		op.rejectMsg(af);
	}
}
