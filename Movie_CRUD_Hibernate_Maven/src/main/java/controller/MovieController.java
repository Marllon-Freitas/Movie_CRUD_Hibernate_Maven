package controller;

import java.util.List;

import model.Movie;
import service.MovieService;

public class MovieController {
	private MovieService movieService = new MovieService();

	public void movieRegister(Movie movie) {
		movieService.movieRegister(movie);
	}

	public void movieRemove(Long id) {
		movieService.movieRemove(id);
	}

	public void movieAlter(Movie movie) {
		movieService.movieAlter(movie);
	}

	public List<Movie> movieList() {
		return movieService.movieList();
	}

	public Movie movieFind(Long id) {
		return movieService.movieFind(id);
	}
}
