public class TrueFalse extends Question
{

	private boolean answer;
	
	public TrueFalse(String text, boolean answer)
	{
		super(text);
		this.answer = answer;
	}
	
	public String getSolution()
	{
		return "" + answer;
	}
	
	public String toString()
	{
		return "" + getNumber() + ".) " + "True/False: " + getText();
	}
}
