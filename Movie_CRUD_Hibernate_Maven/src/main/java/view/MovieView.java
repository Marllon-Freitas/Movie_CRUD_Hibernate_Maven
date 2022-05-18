package view;

import controller.MovieController;
import model.Movie;

public class MovieView {

	public static void main(String[] args) {
		MovieController movieController = new MovieController();
		
		Movie movieAltered = new Movie();
		movieAltered = movieController.movieFind((long) 5);
		
		System.out.println(movieAltered);
		
		movieAltered.setTitle("Novo titulo 2");
		movieAltered.setCategory("Nova categoria 2");
		movieAltered.setPrice(4000);
		movieAltered.setDurationMinutes(100);
		movieAltered.setDate("04/03/2004");
		movieAltered.setId(null);
		
		movieController.movieList();
		


//		movieController.movieRegister(movie);
//		movieController.movieRemove((long) 1);

//		Movie movie2 = new Movie();
//		movie2.setTitle("Avengers");
//		movie2.setCategory("Action/Hero");
//		movie2.setPrice(35);
//		movie2.setDurationMinutes(120);
//		movie2.setDate("01/05/2019");
//		movie2.setId(null);
//		
//		MovieController movieController2 = new MovieController();
//		movieController2.movieRegister(movie2);
	}
}
