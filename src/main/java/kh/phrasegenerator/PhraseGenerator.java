package kh.phrasegenerator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PhraseGenerator {

	public static void main(String[] args) throws Exception{
		PhraseGenerator generator = new PhraseGenerator();
		
		String word1 = generator.getRandomWordFromFile("./noun.person.parsed.txt");
		
		System.out.println(word1);

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
		
		reader.close();
		return word;
	}
}
