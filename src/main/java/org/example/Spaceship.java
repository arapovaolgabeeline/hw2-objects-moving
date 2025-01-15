package org.example;

import java.util.HashMap;
import org.example.adaptors.MovingObjectAdapter;
import org.example.adaptors.RotatingObjectAdapter;
import org.example.models.IMovingObject;
import org.example.models.IRotatingObject;

public class Spaceship {
    private IMovingObject movingObject;
    private IRotatingObject rotatingObject;

    public Spaceship(IMovingObject movingObject, IRotatingObject rotatingObject) {

        this.movingObject = new MovingObjectAdapter();
        this.rotatingObject = new RotatingObjectAdapter();
    }

    public move() {

    }
}
