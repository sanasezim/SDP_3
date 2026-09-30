package kz.aitu.bridge.abstraction;

import kz.aitu.bridge.implementor.Renderer;

import java.util.Objects;

public abstract class Shape {

    protected Renderer renderer;

    protected Shape(Renderer renderer) {
        this.renderer = Objects.requireNonNull(
                renderer,
                "Renderer cannot be null"
        );
    }

    public void setRenderer(Renderer renderer) {
        this.renderer = Objects.requireNonNull(
                renderer,
                "Renderer cannot be null"
        );
    }

    public abstract void draw();
}