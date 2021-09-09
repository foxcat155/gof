package src.main.java.gof.decorator;

public abstract class ShapeDecorator implements Shape{

    protected Shape decoratedShape;

    protected ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
