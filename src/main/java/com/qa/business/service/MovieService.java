package com.qa.business.service;

import javax.inject.Inject;

import com.qa.business.repository.IMovieRepository;

public class MovieService implements IMovieService {
	
	@Inject
	private IMovieRepository repo;
	
	@Override
	public String getAllMovies() {
		return repo.getAllMovies();
	}
	
	@Override
	public String getAMovie(Long id) {
	return repo.getAMovie(id);
	
	}

	@Override
	public String createAMovie(String movieAsJSON) {
	return repo.createAMovie(movieAsJSON);
	}

	@Override
	public String deleteAMovie(Long id) {
	return repo.deleteAMovie(id);
	}

	@Override
	public String updateMovie(String movieAsJSON) {
		return repo.updateMovie(movieAsJSON);
	}
}