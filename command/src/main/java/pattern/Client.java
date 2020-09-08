package pattern;

import pattern.device.SetOfBox;
import pattern.device.TV;
import pattern.handler.SetOfBoxOffCommand;
import pattern.handler.SetOfBoxOnCommand;
import pattern.handler.TVonCommand;

public class Client {

	public static void main(String[] args) {
		RemoteController remoteController = new RemoteController();
		
		
		
		
		SetOfBox setOfBox = new SetOfBox();
		TV tv = new TV();
		
		
//		remoteController.setcommand(new SetOfBoxOffCommand(setOfBox));
//		remoteController.pressButton();
		//remote controller regardless of tv or setoff box it can use it
		
		remoteController.setcommand(new TVonCommand(tv));
		remoteController.pressButton();
		

	}

}
