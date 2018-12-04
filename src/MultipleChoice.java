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
		String ques = "";
		ques += this.getNumber() + ".) " + "____ " + this.getText() + "\n";
		char choice = 'A';
		for(String ans : answerChoices)
		{
			ques += "\t" + choice + ". " + ans + "\n";
			choice++;
		}
		return ques;
	}
}
