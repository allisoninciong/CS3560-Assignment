// Allison Inciong
// Professor Sun
// CS3560
// September 29, 2020

import java.util.Random;


public class Student extends AbstractStudent
{
	// declare variables
	private String ID;
	private int answer;
	
	// generate random student ID
	public String generateID()
	{
		Random rand = new Random();
		ID = "#" + (rand.nextInt(100) + 1); 		// number from 1 - 100
		return ID;
	}
	
	// getter for ID
	public String getID()
	{
		return ID;
	}
	
	// setter for single selection answer
	public void setSingleAnswer(int answer)
	{
		this.answer = answer;
	}
	
	// getter for single selection answer
	public int getSingleAnswer()
	{
		return answer;
	}
	
	// setter for multiple selection answer
	public void setSecondAnswer(int answer)
	{
		this.answer = answer;
	}
	
	// getter for multiple selection answer
	public int getSecondAnswer()
	{
		return answer;
	}
}
