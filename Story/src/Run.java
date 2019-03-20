import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		//instantiate objects
		Scanner scanner = new Scanner(System.in);
		Character user = new Character();
		Tutorial tutorial = new Tutorial();
		ChapterOne chapterOne = new ChapterOne();
		ChapterTwo chapterTwo = new ChapterTwo();
		
		//tutorial
		tutorial.printTutorialMessage();
		
		//chapter one
		chapterOne.printNameQuestion();
		String nameInput = scanner.nextLine();
		chapterOne.processNameInput(nameInput, user);
		
		//chapter two
		chapterTwo.printPuppyQuestion();
		String puppyAnswerChoice = scanner.nextLine();
		chapterTwo.processPuppyAnswer(puppyAnswerChoice, user);
		
		//more chapters
		System.out.println();
		System.out.println("...");
		System.out.println("We ask more questions and update the match score here...");
		System.out.println("...");
		System.out.println();
		
		//display output
		System.out.println(user.name + " is a " + user.matchScore +  "% match with you.");
		scanner.close();
	}
}