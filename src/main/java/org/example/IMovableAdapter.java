package org.example;

import java.util.Vector;

public class IMovableAdapter implements Movable {
    UObject uObject;

    public IMovableAdapter(UObject uObject) {
        this.uObject = uObject;
    }

    @Override
    public Vector getPosition() {
        return (Vector) uObject.getProperty("Position");
    }

    @Override
    public Vector getVelocity() {
        return null;
    }

    @Override
    public void setPosition() {

    }
}
