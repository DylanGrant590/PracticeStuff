import java.util.Scanner;
public abstract class TestCertOfDeposit {

	public TestCertOfDeposit(String[] args) {
		// TODO Auto-generated method stub
int certNum;
String lastName;
double balance;
int issueDate;
int month;
int year;
Scanner scanner = new Scanner(System.in);
System.out.println("Please enter a certificate number: ");
certNum = scanner.nextInt();
System.out.println("Please enter a last name: ");
lastName = scanner.nextLine();
System.out.println("Please enter a balance: ");
balance = scanner.nextDouble();
System.out.println("Please enter an issue date: ");
issueDate = scanner.nextInt();
System.out.println("Please enter a month: ");
month = scanner.nextInt();
System.out.println("Please enter a year: ");
year = scanner.nextInt();
scanner.close();

	}
}