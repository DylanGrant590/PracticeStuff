public class RaceHorse extends Horse{
    public RaceHorse(String name, String color, int birthYear) {
		super(name, color, birthYear);
	}

	private int numOfRaces;

    public int getNumOfRaces() {
        return numOfRaces;
    }

    public void setNumOfRaces(int numOfRaces) {
        this.numOfRaces = numOfRaces;
    }
}