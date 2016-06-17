package projects;

public class MovieMethods {

	private String title;
	private String category;

	public MovieMethods(String t, String c) {
		title = t;
		category = c;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String t) {
		title = t;
	}

	public void setCategory(String c) {
		category = c;
	}

	public String getCategory() {
		return category;
	}
}