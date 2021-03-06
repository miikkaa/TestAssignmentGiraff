package se.giraff;

import static se.giraff.config.LabyrinthConfig.DEFAULT_END_COORDINATE;
import static se.giraff.config.LabyrinthConfig.DEFAULT_START_COORDINATE;
import static se.giraff.matrix.helpers.MatrixPrinter.DEFAULT_PRINT_STREAM;

import java.util.AbstractMap;
import java.util.Collection;

import se.giraff.app.LabyrinthApp;
import se.giraff.matrix.helpers.MatrixPrinter;
import se.giraff.matrix.primitives.MatrixTrace;
import se.giraff.matrix.primitives.Path;

public class Main {

    public static void main(String[] args) {
        LabyrinthApp app = new LabyrinthApp();
        MatrixTrace matrixTrace = app.findShortestPaths(DEFAULT_START_COORDINATE, DEFAULT_END_COORDINATE);

        MatrixPrinter.print(app.getMatrix(), matrixTrace, DEFAULT_PRINT_STREAM);
    }
}

