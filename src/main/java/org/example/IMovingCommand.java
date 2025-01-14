package org.example;

public class IMovingCommand implements ICommand {
    IMovingObject IMovingObject;

    public IMovingCommand(IMovingObject IMovingObject) {
        this.IMovingObject = IMovingObject;
    }

    public void execute() {
        IMovingObject.setPosition(new double[] {IMovingObject.getPosition(), IMovingObject.getVelocity()});
    }
}
