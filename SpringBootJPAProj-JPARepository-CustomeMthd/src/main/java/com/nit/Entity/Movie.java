package com.nit.Entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="Movie_List")
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Movie {

	@Id
	@SequenceGenerator(name="movie_seq", sequenceName="movie_sequence",allocationSize =3,initialValue =100)
	@GeneratedValue(generator="movie_seq",strategy=GenerationType.SEQUENCE )
	private Integer movieId;
	
	@Column(name="M_NAME" ,length=20)
	@NonNull
	private String movieName;
	
	@Column(name="GENRE" ,length=20)
	@NonNull
	private String genre;
	
	@Column(name="R_DATE")
	@NonNull
	private LocalDate releaseDate;
	@Column(name="DUR_INHOUR")
	@NonNull
	private Integer duration;
	@NonNull
	private String language;
	
	
}
