package _01_ShapeLandscape;

import org.w3c.dom.css.Rect;

public class Rectangle {
    private double width;
    private double height;
    private Color fillColor;

    // Constructors - überladener Konstruktor (overloading)
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public Rectangle(double length){
      this(length, length);
    }
    public Rectangle(Color c){
        this(1.0);
        fillColor = c;
    }
    // Copy Constructor
    public Rectangle(Rectangle other){
        this(other.width, other.height);
        fillColor = other.fillColor;
    }
    public Rectangle(){};

    public double getArea(){
        return width * height;
    }
    public void setWidth(double width){ // setter Methode
        //width = width; // Parameter
        this.width = width;
    }
    public double getWidth(){
        return width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setFillColor(Color c){
        fillColor = c;
    }
    public Color getFillColor(){
        return fillColor;
    }
}
