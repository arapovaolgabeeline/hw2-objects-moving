package org.example;

public class MovingObjectAdapter implements IMovingObject {
    UObject uObject;

    public MovingObjectAdapter(UObject uObject) {
        this.uObject = uObject;
    }

    @Override
    public double[] getPosition() {
        return (double[]) uObject.getProperty("Position");
    }

    @Override
    public double[] getVelocity() {
        Integer direction = (Integer) uObject.getProperty("Direction");
        Integer velocity = (Integer) uObject.getProperty("Velocity");
        Integer directionNumbers = (Integer) uObject.getProperty("DirectionNumbers");
        return new double[]{velocity * Math.cos(direction / (360 * directionNumbers)),
                velocity * Math.sin(direction / (360 * directionNumbers))};
    }

    @Override
    public void setPosition(double[] vector) {
        uObject.setProperty("Position", vector);
    }
}
