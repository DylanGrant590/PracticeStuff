
public class Student {
int idnumber;
int numofcredit;
int numofpoints;
double gpa;

public Student() {
	this.idnumber = 9999;
	this.numofcredit = 3;
	this.numofpoints = 12;
}
	public void setCredithours(int credithours) {

	       this.numofcredit = credithours;

	   }

	   public void setPoints(int points) {

	       this.numofpoints = points;

	   }

	   public void setSid(int sid) {

	       this.idnumber = sid;

	   }

	   public void computeAveragegrade()

	   {

	       this.gpa = this.numofpoints / this.numofcredit;

	   }

	   public void showSid(){

	       System.out.println("Student id is : " + this.idnumber);

	   }

	   public void showPoints(){

	       System.out.println("Number of points earned : " + this.numofpoints);

	   }

	   public void showCredithours(){

	       System.out.println("Number of credit hours earned : " + this.numofcredit);

	   }

	   public void showAveragegrade(){

	       System.out.println("Average grade point is : " + this.gpa);

	   }

	}


