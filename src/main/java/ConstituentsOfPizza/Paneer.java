package ConstituentsOfPizza;

public class Paneer implements Pizza{
    Pizza pizza;

    public Paneer(Pizza anyPizza){
        pizza = anyPizza;
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 60;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "+ Paneer ";
    }
}
