package _Caesars_Cipher;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CaesarsCipherTestCase1 {
	
	private CaesarsCipher caesarCipher = new CaesarsCipher();
	
	@Test
	void testCipheredMessageWithOffsetOf12() {
		assertEquals("tai mdq kag pauzs fapmk",caesarCipher.cipher("how are you doing today", 12));
		//This method tests that these values are equal. if so test passed
	}
	
	@Test
	void testEmptyString() {
		assertEquals("",caesarCipher.cipher("", 12));
	}
	
	/*
	 * @Test void testCipheredMessageWithOffsetOf11() {
	 * assertEquals("tai mdq kag pauzs fapmk",caesarCipher.
	 * cipher("how are you doing today", 11)); //This method tests that these values
	 * are equal. if so test passed }
	 */
}
