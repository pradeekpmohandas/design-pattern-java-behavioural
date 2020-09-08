package pattern.handler;

import pattern.command.Command;
import pattern.device.SetOfBox;

public class SetOfBoxOffCommand implements Command{
	SetOfBox setOfBox;
	
	public SetOfBoxOffCommand(SetOfBox setOfBox){
		this.setOfBox = setOfBox;
	}

	public void execute() {
		setOfBox.off();
		
	}
	


}
