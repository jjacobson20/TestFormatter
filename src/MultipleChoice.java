/**
 * 
 * @author jeremy
 * Period 6
 * Multiple Choice
 *
 */
public class MultipleChoice extends Question
{
	
	private String[] answerChoices;
	private char correctAnswer;
	
	public MultipleChoice(String text, String[] answerChoices, char correctAnswer)
	{
		super(text);
		this.answerChoices = answerChoices;
		this.correctAnswer = correctAnswer;
	}
	
	public String getSolution()
	{
		return "" + correctAnswer;
	}
	
	public String toString()
	{
		return "The correct answer is: " + correctAnswer;
	}
}
