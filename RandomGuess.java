import javax.swing.JOptionPane;

public class RandomGuess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Think of a number between 1 and 10.");
JOptionPane.showMessageDialog(null,"The number is "+
(1 + (int)(Math.random() * 10)));
	}

}
