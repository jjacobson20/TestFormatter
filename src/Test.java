
public class Test
{
	public static void main(String[] args)
	{
		String[] ans = {"choice 1", "choice 2", "choice 3", "choice 4"};
		String[] ans2 = {"choice 1", "choice 2"};
		MultipleChoice question = new MultipleChoice("Which one is correct", ans, 'c');
		System.out.println(question);
		
		TrueFalse tfquestion = new TrueFalse("Mr Ellis is cool", true);
		System.out.println(tfquestion);
	}
}
