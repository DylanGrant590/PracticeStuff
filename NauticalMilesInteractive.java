import java.util.Scanner;

public class NauticalMilesInteractive {

   public static final double KILOMETERS_PER_NAUTICAL_MILE = 1.852;

   public static final double MILES_PER_NAUTICAL_MILE = 1.150779;

   public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

       System.out.print("Enter a number of nautical miles: ");

       double nauticalMiles = scanner.nextDouble();

       double kilometers = nauticalMiles * KILOMETERS_PER_NAUTICAL_MILE;

       double miles = nauticalMiles * MILES_PER_NAUTICAL_MILE;

       System.out.println(nauticalMiles + " nautical miles is equal to " + kilometers + " kilometers.");

       System.out.println(nauticalMiles + " nautical miles is equal to " + miles + " miles.");

       scanner.close();

   }

}