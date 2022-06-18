package kh.phrasegenerator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PhraseGenerator {

	public static void main(String[] args) throws Exception{
		PhraseGenerator generator = new PhraseGenerator();
		
		String personNoun = generator.getRandomWordFromFile("./noun.person.parsed.txt");
		String verb = generator.getRandomWordFromFile("./verb.change.parsed.txt");
		String noun2 = generator.getRandomWordFromFile("./noun.person.parsed.txt");
		String adjective = generator.getRandomWordFromFile("./adj.all.parsed.txt");
		String pp = generator.formPresentParticiple(verb);
		
		String articlePlusAdjective = generator.addArticle(adjective);
		
		System.out.format("%s %s %s %s", personNoun, pp, articlePlusAdjective, noun2);

	}

	/**
	 * Adds article 'a' or 'an' to noun depending whether it starts with a
	 * vowel or consonant.
	 * 
	 * @param noun
	 * @return
	 */
	private String addArticle(String noun) {
		String result = null;
		
		if(noun.toLowerCase().startsWith("a") 
			|| noun.toLowerCase().startsWith("e")
			|| noun.toLowerCase().startsWith("i")
			|| noun.toLowerCase().startsWith("u")){
			result = "an " + noun;
		}
		else {
			result = "a " + noun;
		}
		return result;
	}

	String getRandomWordFromFile(String filename) throws Exception{
		String word = null;
		BufferedReader reader = new BufferedReader(new FileReader(filename));
		List<String> words = new ArrayList<>();
		String nextWord = null;
		while((nextWord = reader.readLine()) != null) {
			words.add(nextWord);
		}
		
		int wordsInFile = words.size();
		int randomWord = (new Random()).nextInt(wordsInFile);
		word = words.get(randomWord);
		
		word = word.replaceAll("_", " ");
		
		reader.close();
		return word;
	}
	
	String formPresentParticiple(String verb) {
		String result = null;
		if(verb.endsWith("e")) {
			result = verb.substring(0, verb.length() -1) + "ing";
		}
		else {
			result = verb + "ing";
		}
		return result;
	}
}
