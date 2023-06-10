import java.util.Scanner;
public class TestSandwich {
public static void main(String[] args) {
    String Ingredient;
    String Bread;
    Double Price;
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Please enter an ingredient: ");
    Ingredient = keyboard.nextLine();
    System.out.println("Please enter a bread type: ");
    Bread = keyboard.nextLine();
    System.out.println("Please enter a price: ");
    Price = keyboard.nextDouble();
    Sandwich obj = new Sandwich(Ingredient, Bread, Price);
    System.out.println("The ingredient is " + obj.getIngredient());
    System.out.println("The bread is " + obj.getBread());
    System.out.println("The price is " + obj.getPrice());  
    keyboard.close();
}
}