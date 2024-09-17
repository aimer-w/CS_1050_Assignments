import java.util.Scanner;

public class Blake_Larson_Assign1 
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
								+ "Let's read this story to see if it will get any better. \n\n"
								+ "Once upon a time, in a land of technology, "
								+ "there was computer that started acting up.\n"
								+ "It was producing random errors, freezing at the most "
								+ "inconvenient times, and generally causing chaos.\n\n"
								+ "The owner, frustrated, decided to consult a computer wizard "
								+ "renowned for fixing the most stubborn issues.\nThe wizard "
								+ "approached the computer, waved a magical mouse, and uttered "
								+ "the words: \"Crtl + Alt + Del!\" \nTo everyone's surprise, "
								+ "the computer responded, \"Are you sure you want to delete all "
								+ "your problems and start a new life?\"\n\nThe owner burst "
								+ "into laughter, realizing that sometimes a little humor can be "
								+ "the best solution to tech troubles.\nAnd from that day on, "
								+ "they lived happily ever after, sharing a chuckle whenever "
								+ "the computer misbehaved.");
		}
		else {
			System.out.println("AWESOME. There will be a lot more fun coming.");
		}
		
		keyboard.close();
	}
}
