package com.nit.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.Entity.Movie;

public interface IMovie extends JpaRepository<Movie, Integer> {
	
	public List<Movie> findBymovieNameEquals(String name);
	public List<Movie> findBymovieNameIs(String name);
	public List<Movie> findBymovieName(String name);
	
	public List<Movie> findBymovieNameEqualsIgnoreCase(String name);
	
	public List<Movie> readBymovieNameStartingWith(String intiChars);
	public List<Movie> readBymovieNameEndingWith(String intiChars);
	public List<Movie> readBymovieNameContaining(String intiChars);
	public List<Movie> readBymovieNameContainingIgnoreCase(String intiChars);
	
	public List<Movie> getBygenreLike(String genre);
	
	public List<Movie> findBydurationLessThan(Integer time);


	

}
