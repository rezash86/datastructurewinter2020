package tasks;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Task2 {

	public void findUniqueNumbers(int[] arr) {
		// {1,2,2,2,2,4,5,6} => {1,2,4,5,6}
		Set<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}

		set.stream().forEach(num -> System.out.println(num));
	}

	// "ghtoaerukikklllu"
	public boolean containAllVowels(String str) {
		
		/*
		Set<Character> chars = new HashSet<Character>();
		for (Character character : str.toCharArray()) {
			chars.add(character);
		}
		
		//having voels
		Set<Character> vowels = new HashSet<Character>();
		Character[] characters = new Character[] {'a', 'e','i','o','u'};
		List<Character> asList = java.util.Arrays.asList(characters);
		vowels.addAll(asList);
		
		
		return chars.containsAll(vowels);
		
		
		*/
		
		Set<Character> setVowels = new HashSet<Character>();
		for (int i = 0; i < str.toLowerCase().length(); i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) =='e'|| 
					str.charAt(i) == 'i' 
					|| str.charAt(i) == 'o' || str.charAt(i) =='u') {
				
				setVowels.add(str.charAt(i));
			}
		}
		
		return setVowels.size() == 5;
		
	}
	
	public Map<String, Integer> findOccurance(String str){
		//separate the words
		String[] words = str.split(" ");
		
		Map<String, Integer> occurances = new HashMap<String, Integer>();
		for (String word : words) {
			if(!occurances.containsKey(word)) {
				occurances.put(word, 1);
			}
			else {
				occurances.put(word, (occurances.get(word) + 1));
			}
		}
		
		return occurances;
	}
	
	
	
	
	
	
}
