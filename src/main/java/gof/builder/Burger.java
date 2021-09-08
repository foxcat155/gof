package main.java.gof.builder;

/**
 * 汉堡抽象类
 */
public abstract class Burger implements Item{

    @Override
    public abstract Double price();

    @Override
    public Packing packing() {
        return new Bottle();
    }
}
