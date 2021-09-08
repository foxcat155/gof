package main.java.gof.builder;



public class VegBurger extends Burger{
    @Override
    public String name() {
        return "VegBurger";
    }

    @Override
    public Double price() {
        return 10D;
    }
}
