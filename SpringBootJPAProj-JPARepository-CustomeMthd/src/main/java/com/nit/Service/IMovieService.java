package com.nit.Service;

import java.util.List;

import com.nit.Entity.Movie;

public interface IMovieService {
	public String saveAndFlushMovieRecord(List<Movie> list);
	
	public List<Movie> showMovieByname(String name);
	public List<Movie> showMovieBynameIngoreCase(String name);
	
	public List<Movie> fecthMovieNameStartWith(String name);
	public List<Movie> fecthMovieNameEndWith(String name);
	public List<Movie> fecthMovieNameConatining(String name);
	public List<Movie> fecthMovieNameConatiningIgnoeCase(String name);
	
    public List<Movie> showGenreWiseMovieLike(String genre);
    
    public List<Movie> fetchMovieListByDuration(Integer time);






}
