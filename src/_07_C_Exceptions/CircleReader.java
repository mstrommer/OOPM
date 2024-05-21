package _07_C_Exceptions;

import _07_A_Exceptions.Circle;
import _07_B_Exceptions.CircleCSVParser;
import _07_B_Exceptions.IllegalElementFormatException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CircleReader {
    public static List<Circle> loadCirclesFromCSVFile(String filename) {
        // implement this
        List<Circle> circles = new LinkedList<Circle>();
        try (BufferedReader in = new BufferedReader(new FileReader(filename))) {
            CircleCSVParser parser = new CircleCSVParser();
            String line = in.readLine();
            if (line != null) {
                parser.parseHeader(line);
                while ((line = in.readLine()) != null) {
                    Circle c = parser.parse(line);
                    circles.add(c);
                }
            }
        } catch (IOException | IllegalElementFormatException e) {
            e.printStackTrace();
        }
        return circles;
    }
}
