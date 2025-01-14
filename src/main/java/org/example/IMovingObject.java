package org.example;

public interface IMovingObject {
    double[] getPosition(); //  (x+v cos(alpha),y+v sin(alpha)),
    double[] getVelocity();
    void setPosition(double[] vector);
}
