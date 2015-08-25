import java.util.Scanner;
public class StoreCash {
	public void storeCash(DataStore d){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input the amount of cash payment: ");
		double cash = scanner.nextDouble();
		d.setCash(cash);
	}
}
