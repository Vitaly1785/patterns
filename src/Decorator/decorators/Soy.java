package Decorator.decorators;

import Decorator.Beverages.Beverage;

public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return changeCoast(beverage.getSize()) + beverage.cost();
    }

    public double changeCoast(Size size){
        double price = 0;
        switch (size){
            case TALL:
                price = 0.10;
                break;
            case GRANDE:
                price = 0.15;
                break;
            case VENTI:
                price = 0.20;
                break;
            default:
                break;
        }
        return price;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
