package org.example;

public class RotateAdapter implements IRotatingObject{
    private UObject uObject;

    public RotateAdapter(UObject uObject) {
        this.uObject = uObject;
    }


    @Override
    public Double getAngle() {
        return 0.0;
    }

    @Override
    public Double getAngularVelocity() {
        return 0.0;
    }

    @Override
    public void setAngle(Double value) {

    }
}
