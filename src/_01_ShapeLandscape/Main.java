package _01_ShapeLandscape;

import org.w3c.dom.css.Rect;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5.5,10.0); // () -> Default Konstruktor
        Rectangle[] rectangles = {
                new Rectangle(5.5,10.0),
                new Rectangle(4.4,2.2),
                new Rectangle(),
                new Rectangle(10.0)
        };
        for (int i = 0; i < rectangles.length; i++) {
            System.out.println((i+1)+". rectangle: " + rectangles[i].getArea());
        }
        int count = 0;
        // enhanced for loop - foreach
        for (Rectangle r : rectangles) {
            System.out.println(r.getArea());
            count++;
        }
        // Nicht länger möglich!
        //r1.height = 10.0;
        //r1.width = 5.5;
        System.out.println(r1.getWidth());
        System.out.println(r1.getHeight());
        System.out.println(r1.getArea());
    }
}
