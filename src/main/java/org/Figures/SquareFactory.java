package org.Figures;

public class SquareFactory extends ShapeFactory{

    @Override
    protected Figures createFigures() {
        return new Square();
    }
}
