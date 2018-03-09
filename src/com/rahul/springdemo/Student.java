package com.rahul.springdemo;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
	private String favLang;


	private LinkedHashMap<String, String> countryOptions;
	private LinkedHashMap<String, String> languageOptions;
	
	public Student() {
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("USA", "United States of America");
		countryOptions.put("IND","India");
		countryOptions.put("GER","Germany");
		countryOptions.put("FRA","France");
		
		languageOptions = new LinkedHashMap<>();
		languageOptions.put("Java", "Java");
		languageOptions.put("Python", "Python");
		languageOptions.put("Go", "Go");
		languageOptions.put("C#", "C#");
		
	}
	
	public LinkedHashMap<String, String> getLanguageOptions() {
		return languageOptions;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFavLang() {
		return favLang;
	}

	public void setFavLang(String favLang) {
		this.favLang = favLang;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}