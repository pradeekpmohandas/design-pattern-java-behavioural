package pattern;

import pattern.command.Command;

public class RemoteController {

	Command command;
	
	public void setcommand (Command command) {
		this.command = command;
	}
	
	
	public void pressButton() {
		command.execute();
	}
}
