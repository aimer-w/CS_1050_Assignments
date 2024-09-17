package Blake_Larson_Assignment01;

import java.util.Scanner;

public class Blake_Larson_Assignment01 
{
	public static void main(String[] args)
	{
		String input;
		char answer;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Are you having fun? Y=yes, N=no ");
		input = keyboard.nextLine();
		answer = input.charAt (0);
		
		if(answer=='N') {
			System.out.println("Sorry to hear that you are not having fun. "
					+ "Let read this story to see if it will get better.n\n\"
					+ "Once upon a time, in a land of technology, "
					+ "there was a computer that was acting up.\n"
					+ "It was producing random errors, freezing at th most "
					+ "inconvienent times, and generally causing chaos.n\n\"
					+ "The owner, frustrated, decided to consult a computer wizard "
					+ "renowned for fixing the most stubborn issues.n\The wizard "
					+ "apporached the computer, waved a magical mouse, and uttered "
					+ "the words: \"Ctrl + Alt + Del!\" \nTo everyone's surprise, "
					+ "the computer responded, \"Are you sure you would like to delete all "
					+ "your problems and start a new life?\"\n\nThe owner burst "
					+ "into laughter, realizing that sometimes a little humor can be "
					+ "the best solution to tech troubles.\n And from that day on, "
					+ "they lived happily ever after, sharing a chuckle whenever "
					+ "the computer misbehaved.");
		}
		else {
			System.out.println("AWESOME. There will be a lot more fun coming");
		}
		
		keyboard.close();
	}
}
