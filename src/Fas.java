
public class Fas extends Flight {
	
	int sum = 30;
	@Override
	public void printSum()
	{
		System.out.println(sum+10);
		super.printSum();
	}
}
