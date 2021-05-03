public class Person {
	private int coins;
	
	public Person(int coins){
		this.coins = 5;
	}
	
	public void insertCoin(Coinable coinable, int i) {
		
		System.out.println(" Coins inserted");
		coins--;
		if(!coinable.insertCoin()) {
			coins++;
			System.out.println("Coin refunded");
		}
		System.out.println("Coin count :" + coins);
	}

}