package org.Figures;

public class SquareFactory extends ShapeFactory{

    @Override
    protected Figure createFigures() {
        return new Square();
    }
}
