# Shape Rendering Example with Bridge Design Pattern

## Overview
This program demonstrates the use of the Bridge Design Pattern to render different shapes (Circle and Rectangle) using two rendering techniques (Raster and Vector). 
The Bridge Design Pattern is used to decouple an abstraction from its implementation so that the two can vary independently.

## Bridge Design Pattern
Bridge is a structural design pattern that splits a large class or a set of closely related classes into two separate hierarchies—abstraction and implementation—which can be developed independently of each other.

## Why this is Structural Design Pattern
It is categorized as a structural design pattern because it helps to organize and manage class structures, particularly in scenarios where you want to decouple an abstraction from its implementation.

## Implementation
- Abstraction: The Shape class and its subclasses (Circle and Rectangle).
- Implementation: The Renderer interface and its concrete implementations (RasterRenderer and VectorRenderer).
- Bridge: The Shape class contains a reference to a Renderer object, and the concrete shapes call the rendering methods defined by the Renderer.

## Shape Rendering Example
In this program, the Shape class (abstraction) is decoupled from the Renderer implementations. 
Each Shape object contains a reference to a Renderer object, which it uses to render itself. 
This allows for flexibility, as you can change the rendering method independently of the shape and vice versa.

- Shape Class: The Shape class represents a geometric shape and maintains a reference to a renderer object for rendering.
- Circle Class: The Circle class extends Shape and specifies the rendering details for a circle shape.
- Rectangle Class: The Rectangle class extends Shape and specifies the rendering details for a rectangle shape.
- Renderer Interface: The Renderer interface defines methods for rendering shapes and common rendering attributes.
- RasterRenderer Class: The RasterRenderer class implements the Renderer interface for rendering shapes in raster format.
- VectorRenderer Class: The VectorRenderer class implements the Renderer interface for rendering shapes in vector format.

The Main class initiates the program by creating instances of shapes, such as circles and rectangles, and specifying the rendering technique for each. 
It then invokes the draw method on each shape, which triggers the rendering process. This process involves calling the appropriate rendering method on the associated renderer object, printing details like position, dimensions, and rendering attributes. 
Finally, the program outputs the rendered shapes along with their attributes, demonstrating the Bridge Design Pattern's separation of abstraction and implementation.

## Output
![output](https://github.com/Grs-6/Design_Patterns/assets/128204314/ea73fa89-5cbd-451d-8287-0c848d55a629)











