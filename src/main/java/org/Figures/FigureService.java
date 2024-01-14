package org.Figures;

import java.util.Comparator;
import java.util.List;

public class FigureService {
    public Figure checkFigureWithBiggestArea(List<Figure> figure) {
        return figure.stream()
                .max(Comparator.comparingDouble(Figure::getArea)).orElseThrow();
    }

    public Figure checkFigureWithBiggestCircuit(List<Figure> figure) {
        return figure.stream()
                .max(Comparator.comparingDouble(Figure::getCircuit)).orElseThrow();

    }

}
