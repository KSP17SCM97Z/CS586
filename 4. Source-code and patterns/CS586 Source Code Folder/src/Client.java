import java.util.Scanner;
public class Client {
	//start the demo
	public void printStartInfo(){
		System.out.println("CS 586\nPROJECT\nDEMO\n\n\nPress any key");
	}
	
	//print the menu for selection of different gas pumps.
	public void printFirstMenu(){
		System.out.print("Select GP-1, GP-2, GP-3\n1. GP-1\n2. GP-2\n3. GP-3\n\nSelect GP: ");
	}
	
	public void printPumpMenu_1(){
		System.out.println("MENU of Operations\n\t"
				+ "0. Activate(int)\n\t"
				+ "1. Start()\n\t"
				+ "2. PayCredit\n\t"
				+ "3. Reject()\n\t"
				+ "4. Cancel()\n\t"
				+ "5. Approved()\n\t"
				+ "6. PayCash()\n\t"
				+ "7. StartPump()\n\t"
				+ "8. PumpGallon()\n\t"
				+ "9. StopPump()\n\t"
				+ "q. Quit the demo program\n\n\n");
	}
	public void printSelection_1(){
		System.out.print("\tSelect Operation:\n0-Activate, 1-Start, 2-PayCredit, 3-Reject, 4-Cancel, 5-Approved, "
				+ "6-PayCash, 7-StartPump, 8-PumpGallon, 9-StopPump, q-quit\nSelect: ");
	}
	
	public void printPumpMenu_2(){
		System.out.println("MENU of Operations\n\t"
				+ "0. Activate(float, float)\n\t"
				+ "1. Start()\n\t"
				+ "2. PayCredit\n\t"
				+ "3. Reject()\n\t"
				+ "4. Cancel()\n\t"
				+ "5. Approved()\n\t"
				+ "6. Super()\n\t"
				+ "7. Regular()\n\t"
				+ "8. StartPump()\n\t"
				+ "9. PumpGallon()\n\t"
				+ "10. StopPump()\n\t"
				+ "q. Quit the demo program\n\n\n");
	}
	public void printSelection_2(){
		System.out.print("\tSelect Operation:\n0-Activate, 1-Start, 2-PayCredit, 3-Reject, 4-Cancel, 5-Approved, "
				+ "6-Super, 7-Regular, 8-StartPump, 9-PumpGallon, 10-StopPump, q-quit\nSelect: ");
	}
	
	public void printPumpMenu_3(){
		System.out.println("MENU of Operations\n\t"
				+ "0. Activate(float, float)\n\t"
				+ "1. Start()\n\t"
				+ "2. PayCash(float)\n\t"
				+ "3. Cancel()\n\t"
				+ "4. Premium()\n\t"
				+ "5. Regular()\n\t"
				+ "6. StartPump()\n\t"
				+ "7. PumpLiter()\n\t"
				+ "8. StopPump()\n\t"
				+ "9. Receipt()\n\t"
				+ "10. NoReceipt()\n\t"
				+ "q. Quit the demo program\n\n\n");
	}
	public void printSelection_3(){
		System.out.print("\tSelect Operation:\n0-Activate, 1-Start, 2-PayCash, 3-Cancel, 4-Premium, 5-Regular, "
				+ "6-StartPump, 7-PumpLiter, 8-StopPump, 9-Receipt, 10-NoReceipt, q-quit\nSelect: ");
	}
	
	public void selectOperation_1(String n, GasPump_1 gp1){
		Scanner scanner = new Scanner(System.in);
		switch (n){
		case "0":	
			System.out.println("Please input a price for regular gas: ");
			double price = scanner.nextDouble();
			gp1.activate(price);
			break;
		case "1":
			gp1.start();
			break;
		case "2":
			gp1.payCredit();
			break;
		case "3":
			gp1.reject();
			break;
		case "4":
			gp1.cancel();
			break;
		case "5":
			gp1.approved();
			break;
		case "6":
			gp1.payCash(1);
			break;
		case "7":
			gp1.startPump();
			break;
		case "8":
			gp1.pumpGallon();
			break;
		case "9":
			gp1.stopPump();
			break;
		case "q":
			System.exit(0);;
			break;
		}
	}
	
	public void selectOperation_2(String n, GasPump_2 gp2){

		Scanner scanner = new Scanner(System.in);
		switch (n){
		case "0":	
			System.out.println("Please input a price for regular gas: ");
			double price1 = scanner.nextDouble();
			System.out.println("Please input a price for super gas: ");
			double price2 = scanner.nextDouble();
			gp2.activate(price1, price2);
			break;
		case "1":
			gp2.start();
			break;
		case "2":
			gp2.payCredit();
			break;
		case "3":
			gp2.reject();
			break;
		case "4":
			gp2.cancel();
			break;
		case "5":
			gp2.approved();
			break;
		case "6":
			gp2.Super();
			break;
		case "7":
			gp2.regular();
			break;
		case "8":
			gp2.startPump();
			break;
		case "9":
			gp2.pumpGallon();
			break;
		case "10":
			gp2.stopPump();
			break;
		case "q":
			System.exit(0);
			break;
		}
	}
	
	public void selectOperation_3(String n, GasPump_3 gp3){

		Scanner scanner = new Scanner(System.in);
		switch (n){
		case "0":	
			System.out.println("Please input a price for regular gas: ");
			double price1 = scanner.nextDouble();
			System.out.println("Please input a price for premium gas: ");
			double price2 = scanner.nextDouble();
			gp3.activate(price1, price2);
			break;
		case "1":
			gp3.start();
			break;
		case "2":
			gp3.payCash(1);
			break;
		case "3":
			gp3.cancel();
			break;
		case "4":
			gp3.premium();
			break;
		case "5":
			gp3.regular();
			break;
		case "6":
			gp3.startPump();
			break;
		case "7":
			gp3.pumpLiter();
			break;
		case "8":
			gp3.stopPump();
			break;
		case "9":
			gp3.receipt();
			break;
		case "10":
			gp3.noReceipt();
			break;
		case "q":
			System.exit(0);
			break;
		}
	}
	
	public static void main(String[] args){
		Client client = new Client();
		Scanner scanner = new Scanner(System.in);
		client.printStartInfo();
		scanner.next();
		client.printFirstMenu();
		int num = scanner.nextInt();
		if (num == 1){
			GasPump_1 gp1 = new GasPump_1();
			client.printPumpMenu_1();
			while (true){
				client.printSelection_1();
				String n = scanner.next();
				client.selectOperation_1(n, gp1);
			}
		}
		if (num == 2){
			GasPump_2 gp2 = new GasPump_2();
			client.printPumpMenu_2();
			while (true){
				client.printSelection_2();
				String n = scanner.next();
				client.selectOperation_2(n, gp2);
			}
		}
		if (num == 3){
			GasPump_3 gp3 = new GasPump_3();
			client.printPumpMenu_3();
			while (true){
				client.printSelection_3();
				String n = scanner.next();
				client.selectOperation_3(n, gp3);
			}
		}
		
	}
}
