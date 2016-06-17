package projects;

import java.util.ArrayList;
import java.util.Scanner;

public class Movies {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// I am creating 10 different Movie Objects
		MovieMethods movie1 = new MovieMethods("Twins", "Comedy");
		MovieMethods movie2 = new MovieMethods("Twister", "Action");
		MovieMethods movie3 = new MovieMethods("Fatal Attraction", "Horror");
		MovieMethods movie4 = new MovieMethods("Zootopia", "Family");
		MovieMethods movie5 = new MovieMethods("E.T.", "Science Fiction");
		MovieMethods movie6 = new MovieMethods("The Last Boy Scout", "Action");
		MovieMethods movie7 = new MovieMethods("Oscar", "Comedy");
		MovieMethods movie8 = new MovieMethods("Aliens", "Science Fiction");
		MovieMethods movie9 = new MovieMethods("Toys", "Family");
		MovieMethods movie10 = new MovieMethods("Batman v Superman", "Action");

		// Instatiating a List Array for Movies and for Categories
		ArrayList<MovieMethods> moviesArray = new ArrayList<MovieMethods>();

		// Loop loading the movie list array with movie objects

		moviesArray.add(movie1);
		moviesArray.add(movie2);
		moviesArray.add(movie3);
		moviesArray.add(movie4);
		moviesArray.add(movie5);
		moviesArray.add(movie6);
		moviesArray.add(movie7);
		moviesArray.add(movie8);
		moviesArray.add(movie9);
		moviesArray.add(movie10);

		ArrayList<String> categoriesArray = new ArrayList<String>();

		categoriesArray.add("Comedy");
		categoriesArray.add("Action");
		categoriesArray.add("Horror");
		categoriesArray.add("Family");
		categoriesArray.add("Science Fiction");

		System.out.println("Welcome to the Movie List Application");
		boolean repeat = true;
		while (repeat) {
			System.out.println("There are 10 movies in this list.");

			System.out.println("We have several categories available: \r\r\t Action \r\t Comedy\r\t Horror\r\t"
					+ " Family\r\t and Science Fiction\r");
			System.out.println("What category are you interested in?");
			String choice = scan.nextLine();
			System.out.println("Here are the movies that are Category: \t " + choice + "\r");

			for (MovieMethods Movies : moviesArray) {

				String movieCategory = Movies.getCategory();
				if (choice.substring(0, 1).equalsIgnoreCase(movieCategory.substring(0, 1))) {
					System.out.println("\t" + Movies.getTitle());
				}
			}
			System.out.println();
			repeat = Validator.getYorN(scan, repeat, "Continue y/n:", "OK, have a good day");
		}

	}
}
