package main.java.gof.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 套餐类
 */
public class Meal {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    public Double getCost(){
        return items.stream().mapToDouble(Item::price).sum();
    }

    public void showItems(){
        items.forEach(item -> {
            System.out.print("item:" + item.name());
            System.out.print(",packing:" + item.packing().pack());
            System.out.print(",price:" + item.price());
            System.out.println();
        });
    }
}
