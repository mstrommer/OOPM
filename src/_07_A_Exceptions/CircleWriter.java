package _07_A_Exceptions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class CircleWriter {
    public static void saveCirclesToCSVFile(List<Circle> circles, String filename) {
        // try with resources
        try (BufferedWriter out = new BufferedWriter(new FileWriter(filename))) { // write the header
            out.write("x,y,radius\n");
            // write each list element
            for (Circle c : circles) {
                out.write(String.format(Locale.ROOT, "%f,%f,%f%n", c.getCenter().getX(), c.getCenter().getY(),c.getRadius()));
            }
        } catch (IOException e) {
            // required handling of possible IOExceptions
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(new Position(1.,1.),1.);
        Circle c2 = new Circle(new Position(2.,2.),2.);
        Circle c3 = new Circle(new Position(3.,3.),3.);
        Circle c4 = new Circle(new Position(4.,4.),4.);
        List<Circle> circles = new ArrayList<>(Arrays.asList(c1, c2, c3, c4));
        saveCirclesToCSVFile(circles,"circles.csv");
    }
}