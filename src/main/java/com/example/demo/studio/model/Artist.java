package com.example.demo.studio.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "artists") // make sure all the model class has a @Document annotation
public class Artist{

	@Id
	private String id;
	
	private String name;

	@DBRef
	private List<Album> albums = new ArrayList<>();
	
	@CreatedDate
	protected Date createdDate;

	@LastModifiedDate
	protected Date modifiedDate;

	
	public Artist() {
	}

	public Artist(String id, String name, List<Album> albums, Date createdDate, Date modifiedDate) {
		this.id = id;
		this.name = name;
		this.albums = albums;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public List<Album> getAlbums() {
		return albums;
	}

	public void setAlbums(List<Album> albums) {
		this.albums = albums;
	}

}
