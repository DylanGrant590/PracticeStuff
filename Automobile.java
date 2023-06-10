import java.util.Scanner;
public class Automobile {
private int idnum;
private String model;
private String colour;
private int year;
private int miles; 

Scanner scanner = new Scanner(System.in);

public Automobile(int idnum, String model, String colour, int year, int miles) {

this.idnum = idnum;
this.model = model;
this.colour = colour;
this.year = year;
this.miles = miles;
}
public int getIdnum() {
	return idnum;
}
public void setIdnum(int idnum) {

	while (idnum <= -1 || idnum >= 1000) {
		System.out.println("Please enter a valid ID number that is between 1-9999.");
		idnum = scanner.nextInt();
	this.idnum = idnum;
	}
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public String getColour() {
	return colour;
}
public void setColour(String colour) {
	this.colour = colour;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	while (year <= 1999 || year >= 2018) {
		System.out.println("Please enter a valid year between 2000 and 2017.");
		year = scanner.nextInt();
	}
	this.year = year;
}
public int getMiles() {
	return miles;
}
public void setMiles(int miles) {
	while (miles <= 9 || miles >= 61) {

		System.out.println("\nPlease enter a valid miles per gallon between 10 and 60.");
		miles = scanner.nextInt();
	this.miles = miles;
	}
}
}
