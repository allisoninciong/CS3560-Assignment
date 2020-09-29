// Allison Inciong
// Professor Sun
// CS3560
// September 29, 2020

import java.util.Random;

public class VotingService extends AbstractVotingService
{
	// declare integers
	private int numCorrect1;
	private int numCorrect2;
	private int numCorrect3;
	private int numCorrect4;
	private int numCorrect5;
	
	// declare arrays 
	private int[][] studentSingleAnswers;
	private int[] studentMultipleAnswers;
	
	// create Question object
	private Question question = new Question();
	
	// create random students
	public void printAnswers()
	{
		// create title 
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("                               STUDENTS' ANSWERS");
		System.out.println("----------------------------------------------------------------------------------");

		// declare variables
		studentSingleAnswers = new int[10][5];
		studentMultipleAnswers = new int[10];
		Random rand = new Random();
		
		// print each student's ID
		for(int i = 0; i < SimulationDriver.NUM_STUDENTS; i++)
		{
			Student student = new Student();
			student.generateID();
			System.out.print("Student: " + student.getID());
			
			// print answers from each student
			for(int j = 0; j < SimulationDriver.NUM_QUESTIONS; j++)
			{
				// for single selection questions
				student.setSingleAnswer(rand.nextInt(4) + 1); 									// +1 to exclude 0
				studentSingleAnswers[i][j] = student.getSingleAnswer();
				System.out.print("\nQuestion " + (j + 1) + ": " + studentSingleAnswers[i][j]);

				// for multiple selection question
				if(j == 4)
				{
					student.setSecondAnswer(rand.nextInt(4) + 1); 								// +1 to exclude 0
					studentMultipleAnswers[i] = student.getSecondAnswer();
					System.out.println(", " + studentMultipleAnswers[i]);
				}
			}
			System.out.println();
		}
	}
	
	// calculate results
	public void calculateResults()
	{		
		// initialize variables
		numCorrect1 = 0;
		numCorrect2 = 0;
		numCorrect3 = 0;
		numCorrect4 = 0;
		numCorrect5 = 0;
		
		// tally up correct answers for results 
		for(int i = 0; i < SimulationDriver.NUM_STUDENTS; i++)
		{
			// calculate for single selection questions
			if(studentSingleAnswers[i][0] == SimulationDriver.answerArray[0][0])
				numCorrect1++;
			if(studentSingleAnswers[i][1] == SimulationDriver.answerArray[1][0])
				numCorrect2++;
			if(studentSingleAnswers[i][2] == SimulationDriver.answerArray[2][0])
				numCorrect3++;
			if(studentSingleAnswers[i][3] == SimulationDriver.answerArray[3][0])
				numCorrect4++;
			
			// calculate for multiple selection question
			if((studentSingleAnswers[i][4] == SimulationDriver.answerArray[4][0]) 
					&& (studentMultipleAnswers[i] == SimulationDriver.answerArray[4][1]))
				numCorrect5++;
			if((studentSingleAnswers[i][4] == SimulationDriver.answerArray[4][1]) 				// if answers are correct, but alternated
					&& (studentMultipleAnswers[i] == SimulationDriver.answerArray[4][0]))
				numCorrect5++;
		}
	}	
	
	public void printResults()
	{
		// create title 
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("                                 CLASS RESULTS");
		System.out.println("----------------------------------------------------------------------------------");
		
		// print results for question 1 to console
		System.out.println("Question 1: ");
		question.formatResults(numCorrect1);
		System.out.println();
		
		// print results for question 2 to console
		System.out.println("Question 2: ");
		question.formatResults(numCorrect2);
		System.out.println();
		
		// print results for question 3 to console
		System.out.println("Question 3: ");
		question.formatResults(numCorrect3);
		System.out.println();
		
		// print results for question 4 to console
		System.out.println("Question 4: ");
		question.formatResults(numCorrect4);
		System.out.println();
		
		// print results for question 5 to console
		System.out.println("Question 5: ");
		question.formatResults(numCorrect5);
		System.out.println();
	}
}
