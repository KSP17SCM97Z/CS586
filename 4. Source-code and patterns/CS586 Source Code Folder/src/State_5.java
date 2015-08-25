
public class State_5 extends State{
	public int getID() {
		ID = 6;
		return ID;
	}
	public void pumpGas(OP op, AbstractFactory af) {
		op.pumpGasUnit(af);
		op.gasPumpedMsg(af);
	}
	public void stopPump(OP op, AbstractFactory af) {
		op.stopMsg(af);
	}
}
