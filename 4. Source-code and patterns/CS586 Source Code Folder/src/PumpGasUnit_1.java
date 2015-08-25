
public class PumpGasUnit_1 extends PumpGasUnit{
	public void pumpGasUnit(DataStore d) {
		int gallon = d.getG();
		System.out.println("current gallons: " + gallon);
		d.setG(gallon + 1);
	}
}
