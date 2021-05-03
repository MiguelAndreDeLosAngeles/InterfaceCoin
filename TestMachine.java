public class TestMachine {
	public static void main(String[] args) {
		GumballMachine gumbalMachine = new GumballMachine();
		Person person = new Person(5);
		
		person.insertCoin(gumbalMachine,3);
		person.insertCoin(gumbalMachine,3);
		person.insertCoin(gumbalMachine,3);
		person.insertCoin(gumbalMachine,3);
		person.insertCoin(gumbalMachine,3);
		
	}
}
