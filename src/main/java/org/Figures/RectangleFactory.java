package org.Figures;

public class RectangleFactory extends ShapeFactory {
    @Override
    protected Figure createFigures() {
        return new Square();
    }
}
