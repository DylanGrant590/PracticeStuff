import java.util.Scanner;
public class ChiliToGo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num = null;
Scanner scanner = new Scanner(System.in);
System.out.println("Please choose a number from the menu:");
num = scanner.nextLine();
scanner.close();
switch (num) {
case "1":
	System.out.println("Adult meal is 7 dollars.");
	break;
case "2":
	System.out.println("Child's meal is 5 dollars.");
	break;
default:
	System.out.println("That number does not exist!");
	
}

	}

}
