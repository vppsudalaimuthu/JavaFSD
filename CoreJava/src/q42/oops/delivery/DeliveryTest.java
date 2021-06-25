package q42.oops.delivery;

import java.util.Scanner;

public class DeliveryTest {

	public static void main(String[] args) {

		System.out.println("Menu : " + "1.Player details of the delivery " + "2.Run details of the delivery");

		Scanner userInput = new Scanner(System.in);

		int menuOption = userInput.nextInt();

		// Create object for Delivery class
		Delivery delivery = new Delivery();

		switch (menuOption) {
		case 1:
			System.out.print("Enter the bowler name:");
			String bowler = new Scanner(System.in).nextLine();

			System.out.print("Enter the batsman name:");
			String batsman = new Scanner(System.in).nextLine();

			delivery.displayDeliveryDetails(bowler, batsman);
			break;
		case 2:
			System.out.print("Enter the number of runs:");
			Long runs = userInput.nextLong();
			delivery.displayDeliveryDetails(runs);
			break;

		default:
			System.out.println("Invalid Option, Try(Run) Again.");
			break;
		}

		userInput.close();
	}

}
