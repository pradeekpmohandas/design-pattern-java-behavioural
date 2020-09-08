package pattern.handler;

import pattern.command.Command;
import pattern.device.TV;

public class TVoffCommand implements Command{
	TV tv;
	
	TVoffCommand(TV tv){
		this.tv = tv;
	}
	public void SetTvOff(TV tv){
		this.tv = tv;
	}
	
	public void execute() {
		tv.off();
		
	}


}
