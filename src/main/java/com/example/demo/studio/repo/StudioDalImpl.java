package com.example.demo.studio.repo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.studio.model.Artist;

@Repository
public class StudioDalImpl implements StudioDal {
	
	@Autowired
	private MongoTemplate db;

	@Override
	public Artist createArtist(Artist a) {
		db.save(a);
		return a;
	}

	@Override
	public Artist findArtist(String name) {
		return db.findOne(new Query(Criteria.where("name").is(name)), Artist.class);
	}

	@Override
	public Artist updateArtist(String name, Artist artist) {
		Artist searchArtist = findArtist(name);
		if(searchArtist != null) {
			if( searchArtist.getAlbums() != null) {
				searchArtist.getAlbums().addAll(artist.getAlbums());
			}else {
				searchArtist.setAlbums(artist.getAlbums());
			}
			searchArtist.getAlbums().forEach(al -> { db.save(al);});
			
			db.save(searchArtist);
		}
		
		return searchArtist;
	}

}
