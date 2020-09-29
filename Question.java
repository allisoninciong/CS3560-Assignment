// Allison Inciong
// Professor Sun
// CS3560
// September 29, 2020

public class Question extends AbstractQuestion
{		
	// format results to tally correct and incorrect
	public void formatResults(int numCorrect)
	{
		int numIncorrect = 10 - numCorrect;
		System.out.println("Correct: " + numCorrect + ", Incorrect: " + numIncorrect);
	}
	
	// print questions to console
	public void printQuestions() 
	{
		// create title
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("                                    TEST");
		System.out.println("----------------------------------------------------------------------------------");

		// loop through question array to print questions
		for(int i = 0; i < SimulationDriver.NUM_QUESTIONS; i++)
		{
			System.out.println("Question " + (i + 1) + ": " + SimulationDriver.questionArray[i]);
			
			// loop through options array to print options
			for(int j = 0; j < SimulationDriver.NUM_OPTIONS; j++)
			{
				System.out.print((j + 1) + ") " + SimulationDriver.optionArray[i][j] + "  ");
			}
			System.out.println("\n");
		}
	}
}
