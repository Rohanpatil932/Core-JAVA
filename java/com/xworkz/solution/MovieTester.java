package com.xworkz.solution;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.solution.dto.MovieDTO;

public class MovieTester {

	public static void main(String[] args) {

		MovieDTO dto1 = new MovieDTO("Inception", 2.30f, 8, "Fiction");

		MovieDTO dto2 = new MovieDTO("Tenet", 2.25f, 7.6, "Drama");

		MovieDTO dto3 = new MovieDTO("harry potter", 2.30f, 9, "drama/Action");

		MovieDTO dto4 = new MovieDTO("P.S. i love you", 2.0f, 8, "Romantic");

		MovieDTO dto5 = new MovieDTO("Spartans", 2.40f, 8, "Action");

		MovieDTO dto = new MovieDTO();

		Collection<MovieDTO> movies = new ArrayList();

		movies.add(dto1);
		movies.add(dto2);
		movies.add(dto3);
		movies.add(dto4);
		movies.add(dto5);

		Iterator<MovieDTO> iterator = movies.iterator();

		while (iterator.hasNext()) {

			MovieDTO movie = iterator.next();
			System.out.println(movie);
			if(movie.getGenre().equals("Action")) {
				iterator.remove();
				System.out.println(movies.size());
				System.out.println(movies);
			}
			
		}

	}

}
