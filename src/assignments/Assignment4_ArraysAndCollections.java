package assignments;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Assignment4_ArraysAndCollections {

	public static void main(String[] args) {
		
//List of of top 5 large cities areas
		
		List<Integer> areas = new ArrayList<>();
		areas.add(11344);
		areas.add(8847);
		areas.add(8775);
		areas.add(7402);
		areas.add(7380);
		
		int totalArea = areas.get(2)+areas.get(3);
		
		System.out.println("Area of 3rd and 4th largest cities combined is "+totalArea+"sq km \n");
		
//Set of the top 10 most visited tourist attractions
		
		Set<String> touristSpots = new LinkedHashSet<>();
		
	touristSpots.add("Eiffel Tower");
	touristSpots.add("Colosseum");
	touristSpots.add("Great Wall of China");
	touristSpots.add("Sagrada Familia");
	touristSpots.add("Grand Canyon");
	touristSpots.add("New York");
	touristSpots.add("Acropolis of Athens");
	touristSpots.add("Louvre Museum");
	touristSpots.add("Pyramids of Egypt");
	touristSpots.add("Taj Mahal");
	
	System.out.printf("Top tourist spots around the world are %s\n",touristSpots);
	System.out.printf("Total number of top tourist spots mentioned %d \n\n", touristSpots.size());
		
		
//create array with 10 integers
		
		int[] numArray = {23,54,65,76,86,34,23,54,75,98};
		int avg = numArray[4]+numArray[5]/2;
		System.out.printf("The average of 5th and 6th numbers in array is %d\n\n",avg);
		
//List of top 5 highest-grossing movies
		
		List<String> movies = new LinkedList<>();
		
		movies.add("Dangal");
		movies.add("Baahubali 2");
		movies.add("Pushpa 2");
		movies.add("RRR");
		movies.add("K.G.F. 2");
		movies.add("Jawan");
		movies.add("Pathan");
		movies.add("Kalki 2898AD");
		movies.add("Animal");
		movies.add("Bajrangi Bhaijaan");
		
		System.out.printf("Third movie on the list is %s \n",movies.get(2));	

}
	}
