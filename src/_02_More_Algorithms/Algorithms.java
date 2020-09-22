package _02_More_Algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for(int i = 0; i<eggs.size(); i++){
			if(eggs.get(i).equals("cracked")){
				return i ;
			}
		}
		
		return 0;
	}

	public static int countPearls(List<Boolean> oysters) {
        ArrayList<Boolean> PO = new ArrayList<Boolean>();
		for(int i = 0; i<oysters.size(); i++){
			if(oysters.get(i) == true){
				PO.add(oysters.get(i));
			}
		}
		return PO.size();
	}

	public static double findTallest(List<Double> peeps) {
		double greatest = 0;
		for(int i = 0; i<peeps.size();i++){
			if(peeps.get(i)>greatest){
				greatest = peeps.get(i);
			}else{
				
			}
		}
		return greatest;
	}

	public static String findLongestWord(List<String> words) {
		String largestWord = "";
		for(int i = 0; i<words.size();i++){
			if(words.get(i).length() > largestWord.length()){
				largestWord = words.get(i);
			}
		}
		
		
		return largestWord;
	}

	public static boolean containsSOS(List<String> message1) {
		for(int i =0; i<message1.size();i++){
			if(message1.get(i).contains("... --- ...")){
				return true;
			}
		}
		return false;
	}
	
	
	public static List<Double> sortScores(List<Double> results){
		Collections.sort(results);
		return results;
//		for(int i = 0; i<results.size()-1;i++){
//		if(results.get(i)>results.get(i+1)){
//			double temp = results.get(i);
//			results.set(i,results.get(i+1));
//			results.set(i+1,temp);
//		}
//	}
//	
//	return results;
//
	}

	public static List<String> sortDNA(List<String> unsortedSequences) {
		String temp = "";
		
		for(int y = 0; y<unsortedSequences.size();y++){
			for(int i =y+1; i<unsortedSequences.size();i++){
				if(unsortedSequences.get(y).length()>unsortedSequences.get(i).length()){
					temp = unsortedSequences.get(y);
					unsortedSequences.set(y,unsortedSequences.get(i));
					unsortedSequences.set(i, temp);
				}
			}
		}
		return unsortedSequences;
	}

	public static List<String> sortWords(List<String> words) {
		for(int i =0; i<words.size(); i++){
			for(int j = i+1; j <words.size(); j++){
				if(words.get(i).compareTo(words.get(j)) > 0){
					String temp  = words.get(i);
					words.set(i, words.get(j));
					words.set(j, temp);
				}
			}
		}
		return words;
	}
	
	
	
	
	
}





