package afuentes.desing.patterns.behavioral.command;

public abstract class PlayerMovementCommand {
	
	protected Player player;
	
	public void setPlayer(Player player) {
		this.player = player;
	}

	public abstract void execute();
	
}
