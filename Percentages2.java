import java.util.Scanner;
public class Percentages2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double num1 = 2.0;
double num2 = 5.0;
Scanner scanner = new Scanner(System.in);
System.out.println("Please enter a number: ");
num1 = scanner.nextDouble();
System.out.println("Please enter a second number: ");
num2 = scanner.nextDouble();
scanner.close();
		double result1 = (num1/num2)*100;
        double result2 = (num2/num1)*100;
        System.out.println(num1+" is "+result1+ " percent of "+num2);
        System.out.println(num2+" is "+result2+ " percent of "+num1);
	}

}