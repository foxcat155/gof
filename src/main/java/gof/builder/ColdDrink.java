package main.java.gof.builder;

public abstract class ColdDrink implements Item{
    @Override
    public abstract Double price();

    @Override
    public Packing packing() {
        return new Wrapper();
    }
}
