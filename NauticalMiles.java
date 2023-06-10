public class NauticalMiles {

   public static final double KILOMETERS_PER_NAUTICAL_MILE = 1.852;

   public static final double MILES_PER_NAUTICAL_MILE = 1.150779;

   public static void main(String[] args) {

       double nauticalMiles = 10.0; 

       double kilometers = nauticalMiles * KILOMETERS_PER_NAUTICAL_MILE;

       double miles = nauticalMiles * MILES_PER_NAUTICAL_MILE;

       System.out.println(nauticalMiles + " nautical miles is equal to " + kilometers + " kilometers.");

       System.out.println(nauticalMiles + " nautical miles is equal to " + miles + " miles.");

   }

}