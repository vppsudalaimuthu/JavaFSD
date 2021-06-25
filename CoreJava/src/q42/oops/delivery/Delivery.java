package q42.oops.delivery;

public class Delivery {

	//Method overloading (compile time polymorphism)
	
	public void displayDeliveryDetails(String bowler, String batsman) {

		String bowlerLastName = (bowler.lastIndexOf(' ') == -1) ? bowler
				: bowler.substring(bowler.lastIndexOf(' ') + 1);
		String batsmanLastName = (batsman.lastIndexOf(' ') == -1) ? batsman
				: batsman.substring(batsman.lastIndexOf(' ') + 1);

		System.out.println(
				"Player details of the delivery: " + "Bowler : " + bowlerLastName + ", Batsman : " + batsmanLastName);
	}

	public void displayDeliveryDetails(Long runs) {
		
		String runText = (runs == 4)?" It is a Boundary":(runs == 6)?" It is a Sixer":"";
		
		System.out.println("Number of runs scored in the delivery :" + runs + runText + ".");

	}
}
