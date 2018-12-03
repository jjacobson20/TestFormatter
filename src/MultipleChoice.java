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
	
	public MultipleChoice(String inText, String[] choices, char correct)
	{
		super(inText);
		answerChoices = choices;
		correctAnswer = correct;
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
