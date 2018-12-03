/**
 * 
 * @author jeremy
 * Period 6
 * Question Class
 *
 */
public abstract class Question
{
	
	private int number;
	private String text;
	private String solution;
	
	public Question(String text)
	{
		this.text = text;
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
