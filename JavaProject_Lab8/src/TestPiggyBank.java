import java.util.*;
public class TestPiggyBank {
	static Scanner scan = new Scanner(System.in);
	static PiggyBank pb = new PiggyBank();
	public static void main(String[] args) {
		inputCoin();
	}
	
	public static void inputCoin() {
		System.out.println("Money Total : " + pb.getTotal());
		System.out.print("Please define size of PiggyBank : ");
		pb.setPiggyBank(scan.nextInt());
		System.out.println("Size of your PiggyBank : " + pb.getPiggyBank());
		MainMenu();
	}

	public static void MainMenu() {
		int choice;
		while(true) {
			System.out.print(
					"\n========================\n"
					+ "Menu of PiggyBank\n"
					+ "========================\n"
					+ "[1] one baht.\n"
					+ "[2] two baht.\n"
					+ "[3] five baht.\n"
					+ "[4] ten baht.\n"
					+ "[5] Exit\n"
					+ "========================\n"
					+ "Please Select Menu[1-5] : ");
			choice = scan.nextInt();
			if (choice == 1) {
				System.out.print("Insert 1 Baht Money : ");
				pb.addOne(scan.nextInt());
			}
			else if (choice == 2)
			{
				System.out.print("Insert 2 Baht Money : ");
				pb.addTwo(scan.nextInt());
			}
			else if (choice == 3)
			{
				System.out.print("Insert 5 Baht Money : ");
				pb.addFive(scan.nextInt());
			}
			else if (choice == 4)
			{
				System.out.print("Insert 10 Baht Money : ");
				pb.addTen(scan.nextInt());
			}
			else if (choice == 5) {
				System.out.print("Bye Bye");
				break;
			}
			System.out.println("Money Total : " + pb.getTotal());
		}
	}
}
