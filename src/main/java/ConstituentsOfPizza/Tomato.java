package ConstituentsOfPizza;

public class Tomato implements Pizza{
    Pizza pizza;

    public Tomato(Pizza anyPizza){
        pizza = anyPizza;
    }
    @Override
    public int getCost() {
        return pizza.getCost() + 30;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "+ Tomato ";
    }
}
