
public class Purchase {
int invoice;
double sale;
double tax;

public void newPurchase(int invoice, double sale, double tax) {

this.invoice = invoice;
this.sale = sale;
}

public void setInvoicenum(int invoice) {
	this.invoice = invoice;
}

public void setSale(double saleAmount) {
	sale = saleAmount;
	tax = (sale * 0.5);
}
public void displaysale() {
	System.out.println("Your invoice number is " + invoice + ".");
	System.out.println("Your sale amount is " + sale + ".");
	System.out.println("Your sale tax is " + tax + ".");
	
}
}
