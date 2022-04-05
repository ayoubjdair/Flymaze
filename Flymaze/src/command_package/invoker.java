package command_package;

public class invoker {

	commandInterface command;
	
	public invoker () {
		
	}
	
	public void setCommand(commandInterface command) {
		this.command = command;
	}
	
	public void commandInvoked() {
		command.execute();
	}
	
}
