package org.Figures;

public class CircleFactory extends ShapeFactory {

    @Override
    protected Figure createFigures() {
        return new Circle();
    }
}
