package com.cym5240.pis;

public class WorldPopulation {
	private String rank;
	private String country;
	private String population;
	

	public WorldPopulation(String rank, String country, String population) {
		this.rank = rank;
		this.country = country;
		this.population = population;
	}

	public String getRank() {
		return this.rank;
	}

	public String getCountry() {
		return this.country;
	}
	
	public String getpopulation() {
		return this.population;
	}


}
