package kz.aitu.bridge.implementor;

public class VectorRenderer implements Renderer {

    @Override
    public void renderCircle(double radius) {
        System.out.println(
                "Vector renderer: drawing circle with radius " + radius
        );
    }

    @Override
    public void renderSquare(double side) {
        System.out.println(
                "Vector renderer: drawing square with side " + side
        );
    }
}
