package hw9;

public class Hw1 {

	public static void main(String[] args) {
		
		Player p1 = new Player("饅頭人");
		Player p2 = new Player("詹姆士");
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);
		
		System.out.println("-----大胃王快時比賽開始!-----");
		
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("-----大胃王快時比賽結束!-----");
	}

}

class Player implements Runnable {
	String name;

	Player(String name) {
		this.name = name;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(name + "吃第" + i + "碗飯");

			try {
				Thread.sleep((int) (Math.random() * 2501 + 500));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(name + "吃完了!");

	}
}