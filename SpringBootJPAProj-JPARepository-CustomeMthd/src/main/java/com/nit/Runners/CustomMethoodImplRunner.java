package com.nit.Runners;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.Entity.Movie;
import com.nit.Service.IMovieService;

@Component
public class CustomMethoodImplRunner implements CommandLineRunner {
	
	@Autowired
	private IMovieService movieService;
	
	@Override
	public void run(String... args) throws Exception {
		
		/*try {
			Movie m1=new Movie("Hush","Thriller",LocalDate.of(2024, 3, 27),3,"English");
			Movie m2=new Movie("Bird Box","Thriller",LocalDate.of(2016, 5, 20),3,"English");
			Movie m3=new Movie("12th Fail","Biography",LocalDate.of(2023, 10, 29),3,"Hindi");
			Movie m4=new Movie("Iron Man","Science Friction",LocalDate.of(2009, 8, 2),3,"English");
			Movie m5=new Movie("Pink","Thriller Drama",LocalDate.of(2016, 9, 16),3,"Hindi");
			String msg = movieService.saveAndFlushMovieRecord(Arrays.asList(m1,m2,m3,m4,m5));
			System.out.println(msg);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}*/
		
		try {
			/*List<Movie> byname = movieService.showMovieByname("Hush");
			byname.forEach(System.out::println);*/
//			movieService.showMovieBynameIngoreCase("hush").forEach(System.out::println);
			
			/*movieService.fecthMovieNameStartWith("H").forEach(System.out::println);
			System.out.println();
			movieService.fecthMovieNameEndWith("ox").forEach(System.out::println);
			System.out.println();
			movieService.fecthMovieNameConatining("o").forEach(System.out::println);
			System.out.println();
			movieService.fecthMovieNameConatiningIgnoeCase("hu").forEach(System.out::println);
			*/

//			movieService.showGenreWiseMovieLike("%Thriller%").forEach(System.out::println);
			movieService.fetchMovieListByDuration(3).forEach(System.out::println);


		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
