package afuentes.desing.patterns.behavioral.command;

import java.util.HashMap;
import java.util.Map;

public class Movement {

	private Map<String, PlayerMovementCommand> commands;
	
	public Movement() {
		this.commands = new HashMap<>();
		this.addDefaultCommands();
	}
	
	private void addDefaultCommands() {
		this.putCommands("up", new MoveUpCommand());
		this.putCommands("down", new MoveDownCommand());
	}
	
	public void putCommands(String commandName, PlayerMovementCommand command) {
		this.commands.put(commandName, command);
	}
	
	public void execute(Player player, String commandName) {
		PlayerMovementCommand command = this.commands.get(commandName);
		if(command != null) {
			command.setPlayer(player);
			command.execute();
		}
	}
	
}
