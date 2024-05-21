package _07_B_Exceptions;

import _07_A_Exceptions.Circle;
import _07_A_Exceptions.Position;

public class CircleCSVParser {
    // For parsing the first line of the CSV containing
    // the attribute names. In our case, an empty implementation is fine.
    public void parseHeader(String headerLine){
        // Nothing to do here.
    }

    // For parsing a text line containing three comma-separated double
    // values defining a single circle: center x, center y, and
    // radius (all doubles). It creates and returns a new Circle
    // initialized with these values. If one of the three components
    // cannot be parsed into a double value, it throws an
    // IllegalElementFormatException.
    public Circle parse(String line) throws IllegalElementFormatException {
        Circle c = null;
        String[] values = line.split(",");
        try {
            double x = Double.parseDouble(values[0]);
            double y = Double.parseDouble(values[1]);
            double radius = Double.parseDouble(values[2]);
            c = new Circle(new Position(x,y),radius);
        } catch (NumberFormatException e) {
            throw new IllegalElementFormatException(e.getMessage() + "in line " + line, e);
        }

        return c;
    }
}
