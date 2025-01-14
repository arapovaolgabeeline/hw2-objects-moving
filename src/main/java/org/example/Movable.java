package org.example;

import java.util.Vector;

public interface Movable {
    Vector getPosition(); //  (x+v cos(alpha),y+v sin(alpha)),
    Vector getVelocity();
    void setPosition();
}
