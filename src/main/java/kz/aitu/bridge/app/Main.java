package kz.aitu.bridge.app;

import kz.aitu.bridge.abstraction.Circle;
import kz.aitu.bridge.abstraction.Shape;
import kz.aitu.bridge.abstraction.Square;
import kz.aitu.bridge.implementor.RasterRenderer;
import kz.aitu.bridge.implementor.Renderer;
import kz.aitu.bridge.implementor.VectorRenderer;

public class Main {

    public static void main(String[] args) {

        Renderer vectorRenderer = new VectorRenderer();
        Renderer rasterRenderer = new RasterRenderer();

        Shape circle = new Circle(
                10.0,
                vectorRenderer
        );

        Shape square = new Square(
                8.0,
                rasterRenderer
        );

        System.out.println("=== INITIAL RENDERING ===");

        circle.draw();
        square.draw();


        System.out.println();
        System.out.println("=== SWITCHING RENDERERS AT RUNTIME ===");

        circle.setRenderer(rasterRenderer);
        square.setRenderer(vectorRenderer);

        circle.draw();
        square.draw();
    }
}