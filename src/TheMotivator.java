
public class TheMotivator {
	public void feedback(int score) {
		if (score == 100)
			System.out.println("You're awesome");
		else if (score > 90)
			System.out.println("That's great");
		else if (score > 80)
			System.out.println("That's good ");
		else if (score > 70)
			System.out.println("That's alright");
		else if (score > 60)
			System.out.println("That's abysmal");
		else
			System.out.println("Well, what can I say?");
	}
	public static void main(String[] args) {
		TheMotivator tm = new TheMotivator();
		tm.feedback(70);
	}
}
