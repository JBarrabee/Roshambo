package rockPaperScissors;

import java.util.Random;

public class Spock extends Player {

	public Spock() {
	}

	public void calculateRoshambo() {
		Random rand = new Random(); // Random Class
		int ranNumber = rand.nextInt(3);
		if (ranNumber == 0) {
			setRoshambo("Rock");
		}
		if (ranNumber == 2) {
			setRoshambo("Scissors");
		}
		if (ranNumber == 1) {
			setRoshambo("Paper");
		}
	}

}
