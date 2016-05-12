package mum.edu.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import mum.edu.service.MovieService;

@Controller
public class MovieController {
	
	public MovieService movieService;
	
	@RequestMapping()
	public String welcomePager(Model model){
		model.addAttribute("moves",movieService.findAll());
		return "movieDetails";
	}
}
