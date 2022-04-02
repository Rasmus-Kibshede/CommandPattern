package tutorial.invoker;
// This is known as the tutorial.invoker
// It has a method press() that when executed
// causes the execute method to be called
// The execute method for the tutorial.commands.Command interface then calls
// the method assigned in the class that implements the
// tutorial.commands.Command interface

//Invoker

import tutorial.commands.Command;

public class DeviceButton {

  Command theCommand;

  public DeviceButton(Command command) {
    theCommand = command;
  }

  public void press() {
    theCommand.execute();
  }

  public void pressUndo() {
    theCommand.undo();
  }


}
