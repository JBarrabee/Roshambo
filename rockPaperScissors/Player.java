package rockPaperScissors;

public abstract class Player {

	private String name;
	private String roshambo;
	// private Roshambo value;

	public Player() {
	}

	public String getName() {
		return name;
	}

	public String getRoshambo() {
		return roshambo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRoshambo(String roshambo) {
		this.roshambo = roshambo;
	}

}
