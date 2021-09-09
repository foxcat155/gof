package src.main.java.gof.facade;

public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
