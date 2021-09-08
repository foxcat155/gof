package main.java.gof.builder;

public class ChickenBurger extends Burger{
    @Override
    public String name() {
        return "ChickenBurger";
    }

    @Override
    public Double price() {
        return 20D;
    }
}
