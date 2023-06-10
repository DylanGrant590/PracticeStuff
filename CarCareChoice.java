import java.util.Scanner;
public class CarCareChoice {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] offers =  {"oil change", "tire rotation", "battery check", "brake inspection"};
        
        int[] prices = {25, 22, 15, 5};
        
        System.out.println("Enter Selection: ");
        String choice = scanner.nextLine();
        scanner.close();
        
        for(int x = 0; x < prices.length; ++x){
             if(offers[x].equals(choice)){
                System.out.println(offers[x] + " price is $" + prices[x]);
                return;
             }
        }  
        System.out.println("Invalid Entry!");
    }
}