package ConstituentsOfPizza;

public class Olive implements Pizza{
    Pizza pizza;

    public Olive(Pizza anyPizza){
        pizza = anyPizza;
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 20;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "+ Olive ";
    }
}
