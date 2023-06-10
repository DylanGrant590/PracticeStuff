import java.util.Scanner;
public class BookstoreCredit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		double gpa;
		final double credit = 10;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your name: ");
		name = scanner.nextLine();
		System.out.println("Please enter your gpa: ");
		gpa = scanner.nextInt();
		computeDiscount(name, gpa, credit);
		scanner.close();
	}

	private static void computeDiscount(String name, double gpa, double credit) {
		// TODO Auto-generated method stub
		double total_credits = gpa * credit;
        System.out.println(name+ ", your GPA is "+gpa+", so your credit is $"+total_credits+".");
	}

}
