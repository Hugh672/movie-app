package com.qa.business.repository;

public interface IMovieRepository {
	
	String getAllMovies();
	String getAMovie(Long id);
	String createAMovie(String movieAsJSON);
	String deleteAMovie(Long id);
	String updateMovie(String movieAsJSON);
	
}
