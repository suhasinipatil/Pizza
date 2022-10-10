package ConstituentsOfPizza;

public class Cheese implements Pizza{
    Pizza pizza;

    public Cheese(Pizza anyPizza){
        pizza = anyPizza;
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 80;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "+ Cheese";
    }
}
