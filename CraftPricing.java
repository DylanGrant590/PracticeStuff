import java.util.Scanner;
public class CraftPricing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String nameofProduct;
Double costofMaterials;
int numofHours;
Scanner scanner = new Scanner(System.in);
System.out.println("Please enter the name of the product: ");
nameofProduct = scanner.nextLine();
System.out.println("Please enter the cost of the material: ");
costofMaterials = scanner.nextDouble();
System.out.println("Please enter the number of hours worked: ");
numofHours = scanner.nextInt();
computePrice(nameofProduct,costofMaterials,numofHours);
double price = computePrice(nameofProduct,costofMaterials,numofHours);
System.out.println("Price of product = "+price);
scanner.close();
	}

	private static double computePrice(String nameofProduct, Double costofMaterials, int numofHours) {
		// TODO Auto-generated method stub
        double price = (costofMaterials + 12) * numofHours + 7;
        return price;
	}

}
