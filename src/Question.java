/**
 * 
 * @author jeremy
 * Period 6
 * Question Class
 *
 */
public abstract class Question
{
	private static int nextNumber = 1;
	private int number;
	private String text;
	private String solution;
	
	public Question(String text)
	{
		this.text = text;
		number = nextNumber;
		nextNumber++;
	}
	
	public int getNumber()
	{
		return number;
	}
	
	public String getText()
	{
		return text;
	}
	
	public abstract String getSolution();
	
}
