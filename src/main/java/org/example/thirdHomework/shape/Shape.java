package org.example.thirdHomework.shape;

import org.example.thirdHomework.myInterface.Resizable;

abstract class Shape implements Resizable {
    private String type;
    private int dimensions;

    public Shape(String type, int dimensions) {
        this.type = type;
        this.dimensions = dimensions;
    }

    public abstract void numOfAngles();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDimensions() {
        return dimensions;
    }

    public void setDimensions(int dimensions) {
        this.dimensions = dimensions;
    }
}
