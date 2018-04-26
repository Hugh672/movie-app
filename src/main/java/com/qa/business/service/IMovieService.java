package com.qa.business.service;

public interface IMovieService {
	String getAllMovies();
	String getAMovie(Long id);
	String createAMovie(String movieAsJSON);
	String deleteAMovie(Long id);
	String updateMovie(String movieAsJSON);
	
	}
