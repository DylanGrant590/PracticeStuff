public class TestJobApplicant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
JobApplicant applicant1 = new JobApplicant("John", "211-8769", true, false, false, false);
JobApplicant applicant2 = new JobApplicant("Dylan", "311-8264", true, false, true, false);
JobApplicant applicant3 = new JobApplicant("Alex", "566-3445", false, false, false, false);
JobApplicant applicant4 = new JobApplicant("Peter", "676-6543", true, true, true, false);
JobApplicant applicant5 = new JobApplicant("Jack", "768-9870", true, true, true, true);

String qualifiedMessage = "is qualified for an interview.";
String notqualifiedMessage = "is not qualified for an interview.";

if(isQualified(applicant1))
	display(applicant1, qualifiedMessage);
else
	
if(isQualified(applicant2))
	display(applicant2, qualifiedMessage);
else
	
if(isQualified(applicant3))
	display(applicant4, qualifiedMessage);
else

if(isQualified(applicant5))
	display(applicant5, qualifiedMessage);
else
		display(applicant5, notqualifiedMessage);
	}
public static boolean isQualified(JobApplicant applicant) {
	int count = 0;
	boolean isQualified;
	final int minSkills = 3;
	
	 if(applicant.isWordProcessing())

         count += 1;

     if(applicant.isSpreadsheets())

         count += 1;

     if(applicant.isDatabases())

         count += 1;

     if(applicant.isGraphics())

         count += 1;

     if(count >= minSkills)

         isQualified = true;

     else

         isQualified = false;

     return isQualified;

 }

 public static void display(JobApplicant applicant, String message) {

     System.out.println(applicant.getName() + " " + message + " Phone: " + applicant.getPhoneNum());

 }

}