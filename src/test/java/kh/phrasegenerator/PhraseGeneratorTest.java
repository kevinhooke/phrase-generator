package kh.phrasegenerator;

import static org.junit.Assert.*;

import org.junit.Test;

public class PhraseGeneratorTest {

	@Test
	public void testFormPresentParticple() {

		PhraseGenerator generator = new PhraseGenerator();
		String result = generator.formPresentParticiple("eat");
		
		assertEquals("eating", result);			
	}

	@Test
	public void testFormPresentParticple_endingInE() {

		PhraseGenerator generator = new PhraseGenerator();
		String result = generator.formPresentParticiple("breathe");
		
		assertEquals("breathing", result);			
	}

}
