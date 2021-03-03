package com.devSense.misc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Version4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, List<String>> myMap = new HashMap<Integer, List<String>>();
		
		List<String> listOfMoviesFav = Arrays.asList("SEVEN", "TENET", "GRAVITY", "PHILADELPHIA");
		List<String> listOfSeriesFav = Arrays.asList("GOT", "SCAM", "POI", "YOUNGSHELDON");
		
		myMap.put(01, listOfMoviesFav);
		myMap.put(02, listOfSeriesFav);
		
		
		System.out.println("My 3 Favourite Movie is : "+ myMap.get(01).get(2));
		Iterator<String> itr = myMap.get(01).iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}
