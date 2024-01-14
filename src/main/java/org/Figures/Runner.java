package org.Figures;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

        ShapeFactory circleFactory = new CircleFactory();
        ShapeFactory rectangleFactory = new RectangleFactory();
        ShapeFactory squareFactory = new SquareFactory();

        List<Figure> figures = new ArrayList<>();

        Figure circle = circleFactory.create();
        ((Circle) circle).setRadius(5);

        Figure rectangle = rectangleFactory.create();
        ((Rectangle) rectangle).setFirstSide(3);
        ((Rectangle) rectangle).setSecondSide(4);

        Figure square = squareFactory.create();
        ((Square) square).setSide(4);

        figures.add(circle);
        figures.add(rectangle);
        figures.add(square);

        FigureService figureService = new FigureService();
        Figure largestAreaFigure = figureService.findFigureWithLargestArea(figures);
        Figure largestCircuitFigure = figureService.findFigureWithLargestCircuit(figures);

        System.out.println("Figure with largest area:" + largestAreaFigure);
        System.out.println("Figure with largest circuit: " + largestCircuitFigure);

    }
}


