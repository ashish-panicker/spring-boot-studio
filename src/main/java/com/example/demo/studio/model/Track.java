package com.example.demo.studio.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tracks")
public class Track {

	@Id
	private String id;

	private String song;

	@DBRef
	private Album album;

	private List<Artist> artists = new ArrayList<>();;

	@CreatedDate
	private Date createdDate;

	@LastModifiedDate
	private Date modifiedDate;

	public Track(String id, String song, Album album, List<Artist> artists, Date createdDate, Date modifiedDate) {
		this.id = id;
		this.song = song;
		this.album = album;
		this.artists = artists;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
	}

	public Track() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}

	public Album getAlbum() {
		return album;
	}

	public void setAlbum(Album album) {
		this.album = album;
	}

	public List<Artist> getArtists() {
		return artists;
	}

	public void setArtists(List<Artist> artists) {
		this.artists = artists;
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

}
