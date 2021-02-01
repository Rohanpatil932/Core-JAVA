package com.xworkz.solution.dto;

public class MovieDTO {

	private String name;
	private float duration;
	private double ratring;
	private String genre;

	public MovieDTO() {

	}

	public MovieDTO(String name, float duration, double ratring, String genre) {
		super();
		this.name = name;
		this.duration = duration;
		this.ratring = ratring;
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "MovieDTO [name=" + name + ", duration=" + duration + ", ratring=" + ratring + ", genre=" + genre + "]";
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the duration
	 */
	public float getDuration() {
		return duration;
	}

	/**
	 * @return the ratring
	 */
	public double getRatring() {
		return ratring;
	}

	/**
	 * @return the genre
	 */
	public String getGenre() {
		return genre;
	}

}
