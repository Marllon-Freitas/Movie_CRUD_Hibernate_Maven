package service;

import java.util.List;

import model.Movie;
import repository.MovieRepository;

//services cuida das regras de negocio
//View -> Controller -> Service -> Repository -> Base de dados
public class MovieService {
	private MovieRepository movieRepository = new MovieRepository();

	public void movieRegister(Movie movie) {
		movieRepository.movieRegister(movie);
	}

	public void movieRemove(Long id) {
		movieRepository.movieRemove(id);
	}

	public void movieAlter(Movie movie) {
		movieRepository.movieAlter(movie);
	}

	public List<Movie> movieList() {
		return movieRepository.movieList();
	}

	public Movie movieFind(Long id) {
		return movieRepository.movieFind(id);
	}
}
