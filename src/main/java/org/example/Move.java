package org.example;

import java.util.Vector;

public class Move {
    Movable movable;

    public Move(Movable movable) {
        this.movable = movable;
    }

    public void execute() {
        movable.setPosition(movable.getPosition() + movable.getVelocity());
    }
}
