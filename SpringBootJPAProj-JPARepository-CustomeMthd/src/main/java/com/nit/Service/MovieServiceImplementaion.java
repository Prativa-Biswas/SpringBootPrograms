package com.nit.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.Entity.Movie;
import com.nit.Repository.IMovie;

@Service("movieService")
public class MovieServiceImplementaion implements IMovieService {
	
	@Autowired
	private IMovie movieRepo;

	@Override
	public String saveAndFlushMovieRecord(List<Movie> list) {
		List<Movie> listofMovie = movieRepo.saveAllAndFlush(list);
		return listofMovie.stream().count()+" Movies record saved in Directory";
	}
	
	@Override
	public List<Movie> showMovieByname(String name) {

//		List<Movie> list = movieRepo.findBymovieNameEquals(name);
//		List<Movie> list = movieRepo.findBymovieNameIs(name);
		List<Movie> list = movieRepo.findBymovieName(name);
		return list;
	}

	@Override
	public List<Movie> showMovieBynameIngoreCase(String name) {

		return movieRepo.findBymovieNameEqualsIgnoreCase(name);
	}
	
	@Override
	public List<Movie> fecthMovieNameStartWith(String name) {
		return movieRepo.readBymovieNameStartingWith(name);
	}
	
	@Override
	public List<Movie> fecthMovieNameEndWith(String name) {
		return movieRepo.readBymovieNameEndingWith(name);
	}
	
	@Override
	public List<Movie> fecthMovieNameConatining(String name) {
		return movieRepo.readBymovieNameContaining(name);
	}
	
	@Override
	public List<Movie> fecthMovieNameConatiningIgnoeCase(String name) {
		return movieRepo.readBymovieNameContainingIgnoreCase(name);
	}
	
@Override
	public List<Movie> showGenreWiseMovieLike(String genre) {
		return movieRepo.getBygenreLike(genre);
	}

@Override
public List<Movie> fetchMovieListByDuration(Integer time) {
	return movieRepo.findBydurationLessThan(time);
}
	

}
