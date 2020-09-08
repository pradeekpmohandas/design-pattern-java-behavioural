package pattern.handler;

import pattern.command.Command;
import pattern.device.SetOfBox;

public class SetOfBoxOnCommand implements Command{

	SetOfBox setOfBox;
	
	public SetOfBoxOnCommand(SetOfBox setOfBox){
		this.setOfBox = setOfBox;
	}
	
	public void execute() {
		setOfBox.on();
		
	}

}
