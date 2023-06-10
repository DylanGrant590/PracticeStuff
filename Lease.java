
public class Lease {

String tenantName;
int apartmentNumber;
double rentAmount;
int lease;

public Lease() {
	this.tenantName = "XXX";
	this.apartmentNumber = 0;
	this.rentAmount = 1000;
	this.lease = 12;
}

public String getTenantName() {
	return tenantName;
}

public void setTenantName(String tenantName) {
	this.tenantName = tenantName;
}

public int getApartmentNumber() {
	return apartmentNumber;
}

public void setApartmentNumber(int apartmentNumber) {
	this.apartmentNumber = apartmentNumber;
}

public double getRentAmount() {
	return rentAmount;
}

public void setRentAmount(double rentAmount) {
	this.rentAmount = rentAmount;
}

public int getLease() {
	return lease;
}

public void setLease(int lease) {
	this.lease = lease;}

	public void addPetFee() {
	 this.rentAmount += 10;
	 explainPetPolicy();

	}

	public static void explainPetPolicy() {

	 System.out.println("Explanation of the pet policy is as follows: ");

	}

	}


