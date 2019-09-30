package com.me.ui.sample.library.pattern.behavior.command;

/**
 * @author tangqi on 17-5-24.
 */
public class DownCommand implements Command {

    private GameMachine gameMachine;

    public DownCommand(GameMachine gameMachine) {
        this.gameMachine = gameMachine;
    }

    @Override
    public void execute() {
        gameMachine.toDown();
    }
}
