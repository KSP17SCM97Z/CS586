
public class StoreData_2 extends StoreData{
	public void storeData(DataStore d){
		d.setA(d.getTemp_A());
		d.setB(d.getTemp_B());
		System.out.println("Gas pump activated!");
	}
}
