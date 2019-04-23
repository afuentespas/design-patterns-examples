package afuentes.desing.patterns.behavioral.command;

public class Player {
	
	private String name;
	
	public Player(String name) {
		this.name = name;
	}
	
	public void move(String move) {
		System.out.println(this.name + " is moving " + move);
	}
	
}
