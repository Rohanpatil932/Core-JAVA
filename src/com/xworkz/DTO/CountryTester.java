package com.xworkz.DTO;

import java.util.Arrays;

public class CountryTester {
	public static void main(String[] args) {
		CountryDTO country = new CountryDTO();
		country.setName("INDIA");
		country.setPopulation(1340000000l);
		country.setPresident("Ram Nath Kovind");
		country.setPrimeMinister("Narendra Modi");
		country.setLanguages(new String[] { "Assamese", "Bangla", "Bodo", "Dogri", "Gujarati", "Hindi", "Kashmiri",
				"Kannada", "Konkani", "Maithili", "Malayalam", "Manipuri", "Marathi", "Nepali", "Oriya", "Punjabi",
				"Tamil", "Telugu", "Santali", "Sindhi", "Urdu" });
		country.setStates(new String[] { "Jammu&Kashmir", "New Delhi", "Rajastan", "Gujarat", "Orissa", "MP", "Assam",
				"west Bengal", "Goa", "Maharastra", "Arunachal Pradesh", "Jharkand", "Karnataka", "AP", "TN", "Kerala",
				"Jharkand", "Bihar" });
		System.out.println(Arrays.toString(country.getLanguages()));
		System.out.println(Arrays.toString(country.getStates()));

		System.out.println(country.getName());
		System.out.println(country.getPopulation());
		System.out.println(country.getPresident());
		System.out.println(country.getPrimeMinister());


		CountryDTO country1 = new CountryDTO("Mike Pence", "Donald Trump");
		country1.setName("USA");
		country1.setPopulation(328200000l);
		country1.setLanguages(new String[] { "English", "Spanish", "Chinese", "Cantonese", "Mandarin", "varieties",
				"French", "Creole", "Tagalog", "Vietnamese", "Korean", "German" });
		System.out.println(Arrays.toString(country.getLanguages()));
		System.out.println(country1.getName());
		System.out.println(country1.getPopulation());
		System.out.println(country1.getPresident());
		System.out.println(country1.getPrimeMinister());

		String[] language = new String[4];
		language[0] = "Afrikaans";
		language[0] = "English";
		language[0] = "Zulu";
		language[0] = "Xhosa";
		CountryDTO country2 = new CountryDTO("south africa", 59000000l, "David Mabuza", "Cyril Ramaphosa", language);
		System.out.println(country2.getName());
		System.out.println(country2.getPopulation());
		System.out.println(country2.getPresident());
		System.out.println(country2.getPrimeMinister());
		
		CountryDTO country3=new CountryDTO("UAE");
				System.out.println(country3.getName());
				country3.setPresident("Khalifa bin Zayed Al Nahyan");
				System.out.println(country3.getPresident());

	}

}
