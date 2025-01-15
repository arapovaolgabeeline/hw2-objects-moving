package org.example.models;

public interface IMovingObject {

    Number[] getPosition(); //  (x+v cos(alpha),y+v sin(alpha)),
    Number[] getVelocity();
    void setPosition(Number[] vector);

}
