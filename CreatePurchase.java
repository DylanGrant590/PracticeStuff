import java.util.Scanner;
public class CreatePurchase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int invoice;
double sale;

Purchase sale2 = new Purchase();
Scanner scanner = new Scanner(System.in);
System.out.println("Please enter an invoice number between 1000 and 8000: ");
invoice = scanner.nextInt();
while (invoice < 1000 || invoice > 8000) {
	System.out.println("You have entered an INCORRECT invoice number!");
	System.out.println("Please enter an invoice number between 1000 and 8000: ");
	invoice = scanner.nextInt();
}
System.out.println("Please enter sale amount: ");
sale = scanner.nextDouble();
while (sale < 0) {
	System.out.println("Please enter a number greater than 0: ");
	System.out.println("Please enter a sale amount: ");
	sale = scanner.nextDouble();
	}
sale2.setInvoicenum(invoice);
sale2.setSale(sale);
sale2.displaysale();
scanner.close();
}
}
