package kz.aitu.bridge.abstraction;

import kz.aitu.bridge.implementor.Renderer;

public class Circle extends Shape {

    private final double radius;

    public Circle(double radius, Renderer renderer) {
        super(renderer);

        if (radius <= 0) {
            throw new IllegalArgumentException(
                    "Radius must be greater than 0"
            );
        }

        this.radius = radius;
    }

    @Override
    public void draw() {
        renderer.renderCircle(radius);
    }
}