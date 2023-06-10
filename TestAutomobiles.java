import java.util.Scanner;

public class TestAutomobiles {
	
	public static void main(String[] args) {
		
		int idnum;
		String model;
		String colour;
		int year;
		int miles;
		
	Scanner scanner = new Scanner(System.in);{

			System.out.print("\nPlease enter your ID number: ");
			idnum = scanner.nextInt();
			
			System.out.println("\nYou have entered " + idnum + " as your ID number. ");
			scanner.nextLine();
			
			System.out.println("\nPlease enter your automobile's model: ");
			model = scanner.nextLine();
			
			System.out.println("\nYou have entered " + model + " as your model. ");
			scanner.nextLine();
			
			System.out.println("\nPlease enter your automobile's color: ");
			colour = scanner.nextLine();
			
			System.out.println("\nYou have entered " + colour + " as your color. ");
			scanner.nextLine();
			
			System.out.println("\nPlease enter your automobile's year: ");
			year = scanner.nextInt();
			
			System.out.println("\nYou have entered " + year + " as your year. ");
			scanner.nextLine();
			
			System.out.println("\nPlease enter your automobile's miles per gallon: ");
			miles = scanner.nextInt();
			
			System.out.println("\nYou have entered " + miles + " as your miles per gallon. ");
			scanner.nextLine();
			
			System.out.println("\nThe year and model of your car is a " + year + " " + model + " ");
			
			scanner.close();
		}
	}

}