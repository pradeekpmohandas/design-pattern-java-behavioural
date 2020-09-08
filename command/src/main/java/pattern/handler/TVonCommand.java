package pattern.handler;

import pattern.command.Command;
import pattern.device.TV;

public class TVonCommand implements Command{
	TV tv;
	public TVonCommand(TV tv){
		this.tv = tv;
	}
	
	public void SetTvOn(TV tv){
		this.tv = tv;
	}
	
	public void execute() {
		tv.on();
		
	}


}
