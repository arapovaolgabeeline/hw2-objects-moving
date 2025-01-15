package org.example.commands;

import org.example.models.IMovingObject;

public class IMovingCommand implements ICommand {
    private final IMovingObject movingObject;

    public IMovingCommand(IMovingObject movingObject) {
        this.movingObject = movingObject;
    }

    public void execute() {
        movingObject.setPosition(new Number[] {movingObject.getPosition()[0], movingObject.getVelocity()[1]});
    }
}
