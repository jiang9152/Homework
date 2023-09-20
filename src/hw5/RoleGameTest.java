package hw5;

public class RoleGameTest {

	public static void main(String[] args) {
		Hero saber = new SwordMan("亞拉岡", 1, 0);
		Hero archer = new ArrowMan("勒苟拉斯", 1, 0);
		
		saber.attack();
		saber.setAction(new Move());
		saber.playAction();
		
		saber.setAction(new Defend());
		saber.playAction();
		
		System.out.println("==============");
		
		archer.attack();
		archer.setAction(new Move());
		archer.playAction();
		
		archer.setAction(new Defend());
		archer.playAction();
	}

}
