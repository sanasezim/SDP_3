package kz.aitu.bridge.implementor;

public class RasterRenderer implements Renderer {

    @Override
    public void renderCircle(double radius) {
        System.out.println(
                "Raster renderer: drawing circle with radius " + radius
        );
    }

    @Override
    public void renderSquare(double side) {
        System.out.println(
                "Raster renderer: drawing square with side " + side
        );
    }
}