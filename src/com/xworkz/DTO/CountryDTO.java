package com.xworkz.DTO;

public class CountryDTO {
	private String name;
	private String[] states;
	private long population;
	private String primeMinister;
	private String president;
	private String[] languages;

	public CountryDTO() {
		super();
	}

	public CountryDTO(String name) {
		super();
		this.name = name;
	}

	public CountryDTO(String primeMinister, String president) {
		super();
		this.primeMinister = primeMinister;
		this.president = president;
	}



	public CountryDTO(String name,  long population, String primeMinister, String president,
			String[] languages) {
		super();
		this.name = name;
		
		this.population = population;
		this.primeMinister = primeMinister;
		this.president = president;
		this.languages = languages;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getStates() {
		return states;
	}

	public void setStates(String[] states) {
		this.states = states;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	public String getPrimeMinister() {
		return primeMinister;
	}

	public void setPrimeMinister(String primeMinister) {
		this.primeMinister = primeMinister;
	}

	public String getPresident() {
		return president;
	}

	public void setPresident(String president) {
		this.president = president;
	}

	public String[] getLanguages() {
		return languages;
	}

	public void setLanguages(String[] languages) {
		this.languages = languages;
	}

}
