
public class Punctuation
{
	public static void main(String[] args) //main method
	{
		Punctuation lollypop = new Punctuation(); //create new instance of class
		lollypop.searchIt(); //call searchIt function
	}

	public void searchIt
	{
		printWords(getPunctuationWords()); //calls printWords with whatever getPunctuationWords returns using checkPuncutation
		
	}

	public String getPunctuationWords() //String bc it returns a string
	{
		String speech = ("Blood, Sweat, and Tears by Winston Churchill " + "May 13, 1940" + "Mr. Speaker:" + "On Friday evening last I received His Majesty's commission to form a new " +
		"Administration. It was the evident wish and will of Parliament and thenation that this should be conceived on the broadest possible basis and that it should include all parties, both those who supported the late Government and also the parties of the Opposition." +
		"I have completed the most important part of this task. A War Cabinet has been formed of five Members, representing, with the Liberal Opposition, the unity of the nation. The three party Leaders have agreed to serve, either in the War Cabinet or in high executive office. The three Fighting Services have been filled. It was necessary that this should be done in one single day, on account of the extreme urgency and rigour of events. A number of other key positions were filled yesterday, and I am submitting a further list to His Majesty tonight. I hope to complete the appointment of the principal Ministers during tomorrow. The appointment of the other Ministers usually takes a little longer, but I trust that, when Parliament meets again, this part of my task will be completed, and that the Administration will be complete in all respects." +
		"Sir, I considered it in the public interest to suggest that the House should be summoned to meet today. Mr. Speaker agreed and took the necessary steps, in accordance with the powers conferred upon him by the Resolution of the House. At the end of the proceedings today, the Adjournment of the House will be proposed until Tuesday, the 21st May, with, of course, provision for earlier meeting, if need be. The business to be considered during that week will be notified to Members at the earliest opportunity. I now invite the House, by the Resolution which stands in my name, to record its approval of the steps taken and to declare its confidence in the new Government." +
		"Sir, to form an Administration of this scale and complexity is a serious undertaking in itself, but it must be remembered that we are in the preliminary stage of one of the greatest battles in history, that we are in action at many points in Norway and in Holland, that we have to be prepared in the Mediterranean, that the air battle is hope I may be pardoned if I do not address the House at any length today. I hope that any of my friends and colleagues, or former colleagues, who are affected by the political reconstruction, will make all allowances for any lack of ceremony with which it has been necessary to act. I would say to the House, as I said to those who’ve joined this government: \"I have nothing to offer but blood, toil, tears and sweat.\"" +
		"We have before us an ordeal of the mocontinuous and that many preparations have to be made here at home. "+
		"In this crisis Ist grievous kind. We have before us many, many long months of struggle and of suffering. You ask, what is our policy?"+
		"I will say: It is to wage war, by sea, land and air, with all our might and with all the" + " strength that God can give us; to wage war against a monstrous tyranny, never" +
		"surpassed in the dark and lamentable catalogue of human crime. That is our policy. You"+
		"ask, what is our aim? I can answer in one word: victory. Victory at all costs, victory in" +
		"spite of all terror, victory, however long and hard the road may be; for without victory," +
		"there is no survival. Let that be realised; no survival for the British Empire, no survival" +
		"for all that the British Empire has stood for, no survival for the urge and impulse of the" +
		"ages, that mankind will move forward towards its goal. " +
		"But I take up my task with buoyancy and hope. I feel sure that our cause" +
		"will not be suffered to fail among men. At this time I feel entitled to claim the aid of all," +
		"and I say, \"Come then, let us go forward together with our united strength.\""); //this speech is literally the bane of my existence
		String pancakes = new String("");
		String turtles = new String(""); //D+I strings used
		int start = 0; 
		int end = -1; //D+I ints for the start and end in the substring
		speech = speech + " "; //to make sure the program doesn't go haywire without it
		int speechLength = speech.length(); //length of speech
		int characterCount = 0;
		while (characterCount < speechLength) //checks each character in the loop
		{
			if (speech.charAt(characterCount) == ' ') //goes through and finds the spaces
			{
				end = characterCount; //set it to the index
				pancakes = speech.substring(start, end); //it makes the string the word
				start = end+1; //sets start to the next word
				turtles = turtles + checkPunctuation(pancakes); //concatenates with the new word from checkPunctuation
			
			}
			characterCount++;//incrementation in the loop. in hindsight, i should use a for loop, it would make it easier
		}
		return turtles; //return the variable
		
	}

	public String checkPunctuation(String waffles) //String bc it returns a string
	{
		String iceCream = ""; //new string variable
		for (int counter = 0; counter < waffles.length(); counter ++) //loop checks for the punctuation
		{
			if (waffles.charAt(counter) == ('.') || waffles.charAt(counter) == (',') || waffles.charAt(counter) == (';') || waffles.charAt(counter) == (':')
			|| waffles.charAt(counter) == ('!') || waffles.charAt(counter) == ('?') || waffles.charAt(counter) == ('"') || waffles.charAt(counter) == ('(')
			|| waffles.charAt(counter) == (')') || waffles.charAt(counter) == ('-') || waffles.charAt(counter) == (char)(39)) 
			iceCream = waffles + " "; //add the word and a space so it doesn't look kooky
		
		}
		return iceCream; //return the variable
	}

	public void printWords(String pizza)
	{
		System.out.println(pizza); //print all of the words with a type of punctuation
	}
}
