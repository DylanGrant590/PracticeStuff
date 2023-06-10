import java.util.Scanner;
public class Insurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double currentYear;
double birthYear;
Scanner scanner = new Scanner(System.in);
System.out.println("Please enter the current year: ");
currentYear = scanner.nextDouble();
System.out.println("Please enter your birth year: ");
birthYear = scanner.nextDouble();
computePremium(currentYear,birthYear);
double premium = computePremium(currentYear, birthYear);
System.out.println("Premium amount = "+premium);
scanner.close();

	}

	private static double computePremium(double currentYear, double birthYear) {
		// TODO Auto-generated method stub
		double age = (currentYear - birthYear)/10;
        double premium = (age +15)*20;
        return premium;
	}

}
