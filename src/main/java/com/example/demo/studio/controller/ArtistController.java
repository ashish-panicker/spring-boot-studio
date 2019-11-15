package com.example.demo.studio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.studio.model.Artist;
import com.example.demo.studio.repo.StudioDal;

@RestController
public class ArtistController {
	
	@Autowired
	private StudioDal repo;

	@PostMapping("/artists")
	private Artist create(@RequestBody Artist a) {
		
		return repo.createArtist(a);
		
	}
	
	@PutMapping("/artists/albums/{name}")
	private Artist update(@PathVariable String name, @RequestBody Artist a) {
		return repo.updateArtist(name, a);
	}
}
