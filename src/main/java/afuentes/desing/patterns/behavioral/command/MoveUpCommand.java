package afuentes.desing.patterns.behavioral.command;

public class MoveUpCommand extends PlayerMovementCommand {

	@Override
	public void execute() {
		this.player.move("up");		
	}


}
