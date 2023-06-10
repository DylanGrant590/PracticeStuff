import java.util.Scanner;
public class FitnessTracker {
	public static void main(String[] args) {
Tracker trackerObject = new Tracker("January 1st", "running", 0, 0);
String activity;
int time;
int date;
int cal;
Scanner scanner = new Scanner(System.in);
System.out.println("What day are you recording this information for? ");
date = scanner.nextInt();
System.out.println("What fitness excercise did you complete? ");
activity = scanner.nextLine();
System.out.println("How many miniutes did you spend "+activity+ "?");
time = scanner.nextInt();
System.out.println("How many calories did you burn? ");
cal = scanner.nextInt();
scanner.close();
} 
}
