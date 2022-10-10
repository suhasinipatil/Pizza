package ConstituentsOfPizza;

public class FarmHouse implements Pizza{
    @Override
    public int getCost() {
        return 150;
    }

    @Override
    public String getDescription() {
        return "FarmHouse ";
    }
}
