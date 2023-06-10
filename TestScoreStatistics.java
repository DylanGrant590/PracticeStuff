import java.util.Scanner;
public class TestScoreStatistics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int total = 0;
int count = 0;
Scanner scanner = new Scanner(System.in);
while (true) {
	System.out.println("Please enter student test score: ");
	int n = scanner.nextInt();
	scanner.close();
	if (n == 999) {
		break;}
		
		else if (n < 0 || n > 100) {
			System.out.println("The number is incorrect!");
		}
		else {
			total += n;
			count += 1;}
		}
double avg = total / count;
System.out.println("The average is: "+avg);
System.out.println("There were " +count + " numbers entered.");
	}
}
	


