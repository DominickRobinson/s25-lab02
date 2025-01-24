package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Circle;
import edu.cmu.cs.cs214.lab02.shapes.Rectangle;
import edu.cmu.cs.cs214.lab02.shapes.Shape;
import edu.cmu.cs.cs214.lab02.shapes.Square;

public class Main {
    public static void main(String[] args) {

        Shape rectangle = new Rectangle(2, 3);
        Shape square = new Square(69);
        Shape circle = new Circle(5);

        Renderer rectangleRenderer = new Renderer(rectangle);
        rectangleRenderer.draw();

        Renderer squareRenderer = new Renderer(square);
        squareRenderer.draw();

        Renderer circleRenderer = new Renderer(circle);
        circleRenderer.draw();

    }
}
