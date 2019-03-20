public class ChapterOne {
	public void printNameQuestion() {
		System.out.println("What's your name?");
	}
	
	public void processNameInput(String nameInput, Character character) {
		character.name = nameInput;
		System.out.println("Welcome, " + character.name);
		System.out.println();
	}
}
