import java.util.Scanner;
public class QuartsToGallons2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int numofQuartsGallon = 4;
int numofQuartsforPainting = 18;
int numQuarts;
int numofGallons;
Scanner scanner = new Scanner(System.in);
System.out.println("Please enter the number of quarts needed: ");
numQuarts = scanner.nextInt();
numofGallons = numQuarts / numofQuartsGallon;
numofQuartsforPainting = numQuarts % numofQuartsGallon;
System.out.println("A job that needs " + numQuarts + " quarts requires " + numofGallons + " gallons plus "
+ numofQuartsforPainting + " quarts. ");
scanner.close();

	}

}
