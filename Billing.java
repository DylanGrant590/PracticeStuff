
public class Billing {

static double computeBill(double priceofBook) {
	double taxes = 0.08 * priceofBook;
	return priceofBook + taxes;
}
static double computeBill(double priceofBook, int quantityOrdered) {
	double taxes = 0.08 * (priceofBook * quantityOrdered);
	return (priceofBook * quantityOrdered) + taxes;
}
static double computeBill(double priceofBook, int quantityOrdered, int couponValue) {
	double taxes = 0.08 * (priceofBook * quantityOrdered);
	return (priceofBook * quantityOrdered + taxes) - couponValue;
}
public static void main(String args[]) {
	System.out.println(computeBill(10));

	System.out.println(computeBill(10, 2));

	System.out.println(computeBill(10, 20, 50));
}
}
