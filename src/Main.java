
public class Main {
	public static void main(String[] args) {
		
		Object obj = new Fas();
		
		((Fas)obj).FS();
		((Fas)obj).printSum();
		((Flight)obj).printSum();
		
		/*
		 * Flight f3 = new Fas();
		 * 
		 * ((Fas) f3).FS();
		 * 
		 * f3.printSum();
		 * 
		 * 
		 * Flight f = new Flight(3);
		 * 
		 * Fas f2 = new Fas();
		 * 
		 * ((Flight)f2).printSum();
		 * 
		 * if(test1() && test2()){ System.out.println("Yes"); }
		 * 
		 * //add(1,2,3); //hh //test!!! System.out.println("END");
		 */

	}

	public static boolean test1() {
		System.out.println("TEST 1");
		return true;
	}

	public static boolean test2() {
		System.out.println("TEST 2");
		return false;
	}

	public static void add(int... list) {
		System.out.println(list.length);
	}
}
