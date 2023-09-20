package hw5;

public abstract class Hero {
	// 省略 getter/setter...
	
	private String name;
	private int level;
	private double exp;
	private Action act;
	
	public Hero() {
		this("David", 1, 0);
	}
	
	public Hero(String name, int level, double exp) {
		this.name = name;
		this.level = level;
		this.exp = exp;
	}
	
	public void setAction(Action act) {
		this.act = act;
	}
	
	public void playAction() {
		act.action();
	}
	
	public abstract void attack();
	
}
