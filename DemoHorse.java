
public class DemoHorse {
	 public static void main(String[] args) {
	        Horse horse = new Horse(null, null, 0);
	        horse.setName("Kaze");
	        horse.setBirthYear(2010);
	        horse.setColor("Brown");

	        RaceHorse raceHorse = new RaceHorse(null, null, 0);
	        raceHorse.setName("Kage");
	        raceHorse.setBirthYear(2019);
	        raceHorse.setColor("White");
	        raceHorse.setNumOfRaces(10);

	        System.out.println(horse.getName()+" "+horse.getBirthYear()+" year, "+horse.getColor());
	        System.out.println(raceHorse.getName()+" "+raceHorse.getBirthYear()+" year, "
	                +raceHorse.getColor()+", races: "+raceHorse.getNumOfRaces());
	    }
}
