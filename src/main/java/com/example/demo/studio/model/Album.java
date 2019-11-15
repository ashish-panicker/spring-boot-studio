package com.example.demo.studio.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "albums")
public class Album {

	@Id
	private String id;

	private String title;

	private List<Track> tracks= new ArrayList<>();;

	@CreatedDate
	private Date createdDate;

	@LastModifiedDate
	private Date modifiedDate;
	
	public Album() {
	}

	public Album(String id, String title, List<Track> tracks, Date createdDate, Date modifiedDate) {
		this.id = id;
		this.title = title;
		this.tracks = tracks;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public List<Track> getTracks() {
		return tracks;
	}

	public void setTracks(List<Track> tracks) {
		this.tracks = tracks;
	}

}
