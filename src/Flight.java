
public class Flight {

	int sum = 15;

	{
		sum = 150;
	}

	public Flight() {
		System.out.println("Constructor Flisht");
	}

	public Flight(int tm) {
		System.out.println("Pring" + tm);
	}

	public void printSum() {
		System.out.println(sum);
	}
}
