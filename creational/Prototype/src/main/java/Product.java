package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Product implements Cloneable{

    private List<String> items;

    public Product(List<String> items){
        this.items=items;
    }

    public void add(String item){
        this.items.add(item);
    }

    @Override
    public Product clone(){
        List<String> support = new ArrayList<>();
        for(String s : items){
            support.add(s);
        }
        return new Product(support);
    }

    @Override
    public String toString(){
        return items.stream().map(item->" "+item).collect(Collectors.joining());
    }
}
