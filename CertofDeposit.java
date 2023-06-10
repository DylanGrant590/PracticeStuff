import java.time.LocalDate;

public class CertofDeposit {
	
private int certNum;
private String lastName;
private double balance;
LocalDate issueDate;
LocalDate maturityDate = issueDate.plusYears(1);

public int getCertNum() {
	return certNum;
}
public void setCertNum(int certNum) {
	this.certNum = certNum;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public LocalDate getIssueDate() {
	return issueDate;
}
public void setIssueDate(LocalDate issueDate) {
	this.issueDate = issueDate;
}
public LocalDate getMaturityDate() {
	return maturityDate;
}
public void setMaturityDate(LocalDate maturityDate) {
	this.maturityDate = maturityDate;
}
public void CertOfDeposit(int cn, String ln, Double b, LocalDate id)
{
	issueDate = id;
	certNum = cn;
	lastName = ln;
	balance = b;
}
public void displayInfo()
{
	System.out.println(certNum);
	System.out.println(lastName);
	System.out.println(balance);
	System.out.println(issueDate);
	System.out.println(maturityDate);
}
}
