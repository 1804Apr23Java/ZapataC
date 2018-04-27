package com.revature.media;

import java.io.Serializable;

public class Movie extends Media implements Comparable<Movie> {
	private String producer;

	public Movie(String producer, String title, int yearPublished, String genre) {
		super();
		this.producer = producer;
		this.title = title;
		this.yearPublished = yearPublished;
		this.genre = genre; // these are being shadowed
		
	}

	@Override
	public String toString() {
		return "Book [Producer=" + producer + ", title=" + title + ", yearPublished=" + yearPublished + ", genre="
				+ genre + ", getAuthor()=" + getProducer() + "]";
	}

	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}
	
	public int compareTo(Movie m) {
		return this.yearPublished.compareTo(m.getYearPublished());
	}
}
