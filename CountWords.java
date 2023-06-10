import java.util.Scanner;
public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
System.out.println("Please enter a word: ");
String a = scanner.nextLine();
scanner.close();
int count = Length(a);
         System.out.println("Number of words in a given string is: " +count);
}
static int Length(String s)
{
int c = 0;
for (int i = 0; i<=(s.length()-1); i++)
	{
	  if(((i>0)&& (s.charAt(i)!=' ') &&(s.charAt(i-1)==' ')) || ((s.charAt(i)!=' ')&&(i==0)) )
      	  c++;    
	}
return c; 
	}
}