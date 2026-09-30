# Bridge Pattern — Shape Renderer

Assignment #3 for the Software Design Patterns course.

## About

This project demonstrates the Bridge structural design pattern using two independently varying hierarchies:

- Shapes: `Circle`, `Square`
- Renderers: `VectorRenderer`, `RasterRenderer`

`Shape` stores a reference to the `Renderer` interface, connecting the two hierarchies through composition.

## Bridge Participants

- **Abstraction:** `Shape`
- **Refined Abstractions:** `Circle`, `Square`
- **Implementor:** `Renderer`
- **Concrete Implementors:** `VectorRenderer`, `RasterRenderer`
- **Client:** `Main`

## Main Feature

The renderer can be changed at runtime without modifying the Shape:

```java
circle.setRenderer(new RasterRenderer());
