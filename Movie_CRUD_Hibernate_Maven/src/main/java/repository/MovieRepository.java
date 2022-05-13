package repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Movie;

public class MovieRepository {
	private List<Movie> movies = new ArrayList<Movie>();

	public void movieRegister(Movie movie) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("crud-hibernate");
		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();
		manager.persist(movie);
		manager.getTransaction().commit();

		factory.close();
		manager.close();
		this.movies.add(movie);
	}

	public void movieRemove(Long id) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("crud-hibernate");
		EntityManager manager = factory.createEntityManager();

		Movie movie = manager.find(Movie.class, id);

		manager.getTransaction().begin();
		manager.remove(movie);
		manager.getTransaction().commit();

		factory.close();
		manager.close();
	}

	public void movieAlter(Movie movie) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("crud-hibernate");
		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();
		manager.merge(movie);
		manager.getTransaction().commit();

		factory.close();
		manager.close();
	}

	public List<Movie> movieList() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("crud-hibernate");
		EntityManager manager = factory.createEntityManager();

		List<Movie> movies = manager.createQuery("select m from Movie as m").getResultList();

		factory.close();
		manager.close();
		return movies;
	}
	
	public Movie movieFind(Long id) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("crud-hibernate");
		EntityManager manager = factory.createEntityManager();

		Movie movie = manager.find(Movie.class, id);

		System.out.println(movie);
		
		factory.close();
		manager.close();
		return movie;
	}
}
