

class CountVowelConsonant {
	public static void main(String[] args) {
		// Initialize vowel and consonant counters
		int vCount = 0, cCount = 0;

		String str = "A quick brown fox jumps over the lazy dog"; // Declare a string

		str = str.toLowerCase(); // Convert entire string to lower case

		// Iterate through each character in the string
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			// Check for vowels
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vCount++;
			}
			// Check for consonants (letters from 'a' to 'z' that are not vowels)
			else if (ch >= 'a' && ch <= 'z') {
				cCount++;
			}
		}

		// Print the number of vowels and consonants
		System.out.println("Number of vowels: " + vCount);
		System.out.println("Number of consonants: " + cCount);
	}
}
