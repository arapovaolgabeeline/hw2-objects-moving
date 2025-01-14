package org.example;

public class Rotate {
    private Rotatable rotatable;

    public Rotate(Rotatable rotatable) {
        this.rotatable = rotatable;
    }

    public void execute() {
        rotatable.setDirection(rotatable.getDirection() + rotatable.getAngularVelocity() % rotatable.getDirectionsNumber());
    }
}
