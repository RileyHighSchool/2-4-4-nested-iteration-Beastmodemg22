/*
 * Activity 2.4.4
 */
public class LetterFrequencies
{
	public static void main(String[] args)
	{
		String letters = "abcdefghijklmnopqrstuvwxyz"; 
		String phrase = "This is a phrase!";

		System.out.println("The following shows the letter frequencies for the phrase\n");

    /* your code here */
	for (int i = 0; i < 26; i++){
		String Alphchar = letters.substring(i, i+1);
		int count = 0;
		for (int c = 0; c < phrase.length(); c++){
			String Phrasechar = phrase.substring(c, c+1);
			if (Alphchar.equals(Phrasechar)){
				count++;
			}
		}
		System.out.println(Alphchar + " appeared " + count + " times");
	}
	}
}
