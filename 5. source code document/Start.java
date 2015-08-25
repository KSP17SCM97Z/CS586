
public class Start extends State{
	public int getID() {
		ID = 0;
		return ID;
	}
	public void activate(OP op, AbstractFactory af) {
		op.storeData(af);
	}
}
