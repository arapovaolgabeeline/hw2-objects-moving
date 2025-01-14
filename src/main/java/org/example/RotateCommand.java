package org.example;

public class RotateCommand implements ICommand {
    private IRotatingObject object;

    public RotateCommand(IRotatingObject object) {
        this.object = object;
    }

    public void execute() {
        object.setAngle(object.getAngle() + object.getAngularVelocity());
    }

}
