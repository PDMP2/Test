
public class Main {
	public static void main(String[] args){
		
		Flight f = new Flight(3);
		
		Fas f2 = new Fas();
		
		f2.printSum();
		
		if(test1() && test2()){
			System.out.println("Yes");
		}
		
		//add(1,2,3);
		//hh
		System.out.println("END");
		
	}
	
	public static boolean test1(){
		System.out.println("TEST 1");
		return true;
	}
	
	public static boolean test2(){
		System.out.println("TEST 2");
		return false;
	}
	
	public static void add(int... list){
		System.out.println(list.length);
	}
}
