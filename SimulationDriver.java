// Allison Inciong
// Professor Sun
// CS3560
// September 29, 2020

public class SimulationDriver 
{
	// declare final integers
	public static final int NUM_STUDENTS = 10;
	public static final int NUM_QUESTIONS = 5;
	public static final int NUM_OPTIONS = 4;
	
	// declare arrays
	public static String[] questionArray = {"What is my major?",
											"Where am I from?",
											"What is my favorite hobby?",
											"How many siblings do I have?",
											"What are my favorite colors? (Mark all that apply)"};

	public static String[][] optionArray = { {"Architecture", "Biology", "Computer Science", "Electrical Engineering"},
												{"San Jose", "Mission Viejo", "Montclair", "Riverside"}, 
												{"Shopping", "playing sports", "dancing", "watching movies"},
												{"0", "1", "2", "3"},
												{"Blue", "Pink", "Green", "Yellow"} };

	public static int[][] answerArray = { {3}, 
											{2}, 
											{1}, 
											{3}, 
											{1, 3} };
	
	public static void main(String args[])
	{		
		VotingService vote = new VotingService();
		Question ask = new Question();

		ask.printQuestions();
		vote.printAnswers();
		vote.calculateResults();
		vote.printResults();
	}
}

