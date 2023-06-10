import java.util.Scanner;
public class CareCarChoice2 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("List of available services: \noil change, tire rotation, battery check, or brake inspection.");
	        System.out.print("Please choose a service: ");
	        String choose = scanner.next();
	        scanner.close();
	        if(choose.contains("oil")){
	            System.out.println("You chose an oil change. Price: $25 ");
	        }
	        else if(choose.contains("tir")){
	            System.out.println("You chose a tire rotation. Price: $22 ");
	        }
	        else if(choose.contains("bat")){
	            System.out.println("You chose a battery check. Price: $15 ");
	        }
	        else if(choose.contains("bra")){
	            System.out.println("You chose a brake inspection. Price: $5 ");
	        }
	        else{
	            System.out.println("Error, you chose an invalid item!");
	        }
	}

}
