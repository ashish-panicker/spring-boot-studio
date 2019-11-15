package com.example.demo.studio.repo;

import com.example.demo.studio.model.Artist;

public interface StudioDal {
	
	Artist createArtist(Artist a);
	
	Artist findArtist(String name);
	
	Artist updateArtist(String name, Artist a);
	
	

}
