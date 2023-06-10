public class FormLetterWriter
{
static void displaySalutation(String last_Name)
   {
       System.out.println("Dear Mr. or Ms. " + last_Name);
   }
   static void displaySalutation(String first_Name, String last_Name) 
   {
       System.out.println("Dear " + first_Name + " " + last_Name);
   }
   public static void message()
   {
       System.out.println("Thank you for your recent order.");
   }
   public static void main(String[] args) 
   {
       displaySalutation("Dionne");
       message();
       displaySalutation("Dylan", "Grant");
       message();
   }
}