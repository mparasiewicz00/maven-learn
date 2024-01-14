package org.Figures;

public abstract class ShapeFactory {
    public Figures create() {
        Figures figure = createFigures();
        figure.build();
        return  figure;
    }
    protected abstract Figures createFigures();
}
