package _Caesars_Cipher;

public class Main {

	public static void main(String[] args) {
		
		String message = "The lenght of this must be less than 26";
		
		int offset = 12;
		
		CaesarsCipher caesarsCipher = new CaesarsCipher(); //instance of cipher class
		
		String cipheredMessage = caesarsCipher.cipher(message, offset);
		
		System.out.println("OG message: " + message);
		System.out.println("Offset number: " + offset);
		System.out.println("Encrypted message: " + cipheredMessage);
	}

}


/**
 * 
 * TO DO:
 * 1.Take user input instead of hardcoded msg
 * 2.Update test case file after you do this
 * 3.Add other test cases
 * 
 * LONG TERM GOALS:
 * 1.Implement GUI with javaFX 
 * 2.Add a login and landing page to save converted phrases? 
 * 3. Different kinds of cyphers available to user? - Convert to Cipher class, with each cipher being object?
 * (Above may just be an entirely new project?)
 * /
 */