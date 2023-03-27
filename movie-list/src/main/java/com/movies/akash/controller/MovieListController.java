package com.movies.akash.controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/")
public class MovieListController {
	@RequestMapping(method=RequestMethod.GET, value="/movies")
	public String getMovieListByActor(Model model) {
		List<Movie> movieList=new ArrayList<Movie>();
		
		Movie movie=new Movie();
		movie.setActor("Akash");
		movie.setDescription("Cognizant");
		movie.setName("Salesforce");
		
		movieList.add(movie);
		model.addAttribute("movies",movieList);
		return "MovieList";
	}
}
