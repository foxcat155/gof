package main.java.gof.builder;


/**
 * 食物条目
 */
public interface Item {
    String name();
    Double price();
    Packing packing();
}
