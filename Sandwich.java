
public class Sandwich {
	private String ingredient;
	private String bread;
	private double price;

	public Sandwich(String ing, String bre, double pri) {
	    ingredient = ing;
	    bread = bre;
	    price = pri;
	}

	public void setIngredient(String ing) {
	    this.ingredient = ing;
	}

	public String getIngredient() {
	    return ingredient;
	}
	public String getBread() {
	    return bread;
	}
	public Double getPrice() {
	    return price;
	}
	}