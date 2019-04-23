package afuentes.desing.patterns.behavioral.command;

public class MoveLeftCommand extends PlayerMovementCommand {

	@Override
	public void execute() {
		this.player.move("left");
	}

}
