package org.Figures;

public abstract class ShapeFactory {
    public Figure create() {
        Figure figure = createFigures();
        figure.build();
        return figure;
    }

    protected abstract Figure createFigures();
}
