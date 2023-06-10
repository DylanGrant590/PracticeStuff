import java.util.Scanner;
public class InchesToFeet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int inches; 
double feet;
Scanner scanner = new Scanner(System.in);
System.out.println("Please enter an inch: ");
inches = scanner.nextInt();
feet = inches / 12;
System.out.println(+inches + " inches becomes " + feet + " feet and " + inches + " inches. ");
scanner.close();
	}

}
