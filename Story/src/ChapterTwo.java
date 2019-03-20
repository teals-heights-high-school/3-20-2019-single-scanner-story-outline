public class ChapterTwo {
	public void printPuppyQuestion() {
		System.out.println("Puppies are my life!");
		System.out.println("Do you love dogs too?");
		System.out.println();
		System.out.println("A.) I do!");
		System.out.println("B.) I like dogs a lot.");
		System.out.println("C.) I could tolerate a dog...");
		System.out.println("D.) Dogs aren't for me.");
		System.out.println();
	}
	
	public void processPuppyAnswer(String puppyAnswerChoice, Character character) {
		if(puppyAnswerChoice.equals("A")) {
			character.matchScore += 20;
		}
		else if(puppyAnswerChoice.equals("B")) {
			character.matchScore += 15;
		}
		else if(puppyAnswerChoice.equals("C")) {
			character.matchScore += 5;
		}
		else if(puppyAnswerChoice.equals("D")) {
			character.matchScore += -10;
		}
		else {
			System.out.println("Hmmm... I couldn't understand what your answer was. Let's move on!");
		}
	}
}
