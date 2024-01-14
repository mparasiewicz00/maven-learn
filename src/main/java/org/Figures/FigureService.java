package org.Figures;

import java.util.Comparator;
import java.util.List;

public class FigureService {
    public Figure findFigureWithLargestArea(List<Figure> figures) {
        return figures.stream()
                .max(Comparator.comparingDouble(Figure::getArea))
                .orElseThrow(() -> new RuntimeException("List is empty"));
    }

    public Figure findFigureWithLargestCircuit(List<Figure> figures) {
        return figures.stream()
                .max(Comparator.comparingDouble(Figure::getCircuit))
                .orElseThrow(() -> new RuntimeException("List is empty"));
    }
}
