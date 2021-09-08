package main.java.gof.builder;

public class Coke extends ColdDrink{
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public Double price() {
        return 1D;
    }
}
