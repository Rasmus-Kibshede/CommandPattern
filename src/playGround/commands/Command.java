package playGround.commands;

public interface Command {

  String getName();

  void execute();

  void undo();

}
