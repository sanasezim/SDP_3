package kz.aitu.bridge.abstraction;

import kz.aitu.bridge.implementor.Renderer;

public class Square extends Shape {

    private final double side;

    public Square(double side, Renderer renderer) {
        super(renderer);

        if (side <= 0) {
            throw new IllegalArgumentException(
                    "Side must be greater than 0"
            );
        }

        this.side = side;
    }

    @Override
    public void draw() {
        renderer.renderSquare(side);
    }
}