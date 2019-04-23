package afuentes.desing.patterns.behavioral.command;

public class MoveDownCommand extends PlayerMovementCommand {

	@Override
	public void execute() {
		this.player.move("down");		
	}

}
