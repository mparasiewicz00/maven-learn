package org.Figures;

public class CircleFactory extends ShapeFactory {
    @Override
    protected Figures createFigures(){
        return new Circle();
    }

}
