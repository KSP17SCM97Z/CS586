
public class MDA_EFSM {
	State state;
	int ID;
	OP op;
	public MDA_EFSM(){
		state = new Start();
		ID = state.getID();
		op = new OP();
	}
	public void activate(AbstractFactory af){
		if (ID == 0){
			state.activate(op, af);
			state = new State_0();
			ID = state.getID();
		}
	}
	public void start(AbstractFactory af){
		if (ID == 1){
			state.start(op, af);
			state = new State_1();
			ID = state.getID();
		}
	}
	public void payCredit(AbstractFactory af){
		if (ID == 2){
			state.payCredit();
			state = new State_2();
			ID = state.getID();
		}
	}
	public void payCash(AbstractFactory af){
		if (ID == 2){
			state.payCash(op, af);
			state = new State_3();
			ID = state.getID();
		}
	}
	public void reject(AbstractFactory af){
		if (ID == 3){
			state.reject(op, af);
			state = new State_0();
			ID = state.getID();
		}
	}
	public void cancel(AbstractFactory af){
		if (ID == 4){
			state.cancel(op, af);
			state = new State_0();
			ID = state.getID();
		}
	}
	public void approved(AbstractFactory af){
		if (ID == 3){
			state.approved(op, af);
			state = new State_3();
			ID = state.getID();
		}
	}
	public void startPump(AbstractFactory af){
		if (ID == 5){
			System.out.println("start pumping...");
			state.startPump(op, af);
			state = new State_5();
			ID = state.getID();
		}
	}
	public void pump(AbstractFactory af){
		if (ID == 6){
			state.pumpGas(op, af);
		}
	}
	public void stopPump(AbstractFactory af){
		if (ID == 6){
			state.stopPump(op, af);
			state = new State_6();
			ID = state.getID();
		}
	}
	public void selectGas(int g, AbstractFactory af){
		if (ID == 4){
			state.selectGas(g, op, af);
			state = new State_4();
			ID = state.getID();
		}
	}
	public void receipt(AbstractFactory af){
		if (ID == 7){
			state.receipt(op, af);
			state = new State_0();
			ID = state.getID();
		}
	}
	public void noReceipt(AbstractFactory af){
		if (ID == 7){
			state.noReceipt(op, af);
			state = new State_0();
			ID = state.getID();
		}
	}
}
