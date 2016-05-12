package mum.edu.DAO;

import java.util.Date;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import mum.edu.models.Artist;
import mum.edu.models.Characters;
import mum.edu.models.Director;
import mum.edu.models.Genre;
import mum.edu.models.Movie;

public class MovieDAOImp implements MovieDAO{

	SessionFactory sessionFectory;
	
	public List<Movie> getAllMovie() {
		Session session = this.sessionFectory.openSession();
		List<Movie> movies = session.createQuery("from Movie").list();
		return movies;
	}

	/*public Movie getMovie(int id) {
		tx.begin();
		Query query = em.createQuery("SELECT a FROM Movie a WHERE a.id = :id");
		query.setParameter("id",id);
		Movie movie = (Movie) query.getSingleResult();
		tx.commit();
		return movie;
	}

	public List<Movie> getAllMovieGenre(Genre genre) {
		tx.begin();
		Query query = em.createQuery("SELECT a FROM Movie a WHERE a.genre = :genre");
		query.setParameter("genre", genre);
		List<Movie> movies = query.getResultList();
		tx.commit();
		return movies;
	}

	public List<Movie> getAllMovieRating(int rating) {
		tx.begin();
		Query query = em.createQuery("SELECT a FROM Movie a WHERE a.rating = :rating");
		query.setParameter("rating", rating);
		List<Movie> movies = query.getResultList();
		tx.commit();
		return movies;
	}

	public List<Movie> getAllMovieYear(Date date) {
		tx.begin();
		Query query = em.createQuery("SELECT a FROM Movie a WHERE a.releaseDate = :date");
		query.setParameter("date", date);
		List<Movie> movies = query.getResultList();
		tx.commit();
		return movies;
	}

	public List<Characters> findAllCharacters(String movName) {
		tx.begin();
		Query query = em.createQuery("SELECT m.artists FROM Movie m where m.title = :movName ");
		query.setParameter("movName", movName);
		List<Characters> characters = (List<Characters>)query.getResultList();
		tx.commit();
		return characters;
	}

	public List<Director> findAllDirector(String movieName) {
		tx.begin();
		Query query = em.createQuery("SELECT m.artists FROM Movie m where m.title = :movName ");
		query.setParameter("movName", movieName);
		List<Director> directors = (List<Director>)query.getResultList();
		tx.commit();
		return directors;
	}

	public void addArtist(Artist artist) {
		// TODO Auto-generated method stub
		
	}

	public void deleteArtist(Artist artist) {
		// TODO Auto-generated method stub
		
	}

	public void updateArtist(Artist artist) {
		// TODO Auto-generated method stub
		
	}*/

}
