package Decorator;

import Decorator.Beverages.*;
import Decorator.decorators.Mocha;
import Decorator.decorators.Soy;
import Decorator.decorators.Whip;

public class StarBuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage newBeverage = new DarkRoast();
        newBeverage.setSize(Beverage.Size.GRANDE);
        newBeverage = new Whip(newBeverage);
        newBeverage = new Soy(newBeverage);
        newBeverage = new Mocha(newBeverage);
        System.out.println(newBeverage.getDescription() + " $" + newBeverage.cost());

        Beverage beverage2 = new HomeBlend();
        beverage2.setSize(Beverage.Size.GRANDE);
        beverage2 = new Soy(beverage2);
        beverage2 = new Whip(beverage2);
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new Decaf();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());

        Beverage beverage1 = new DarkRoast();
        beverage1.setSize(Beverage.Size.TALL);
        beverage1 = new Soy(beverage1);
        beverage1 = new Soy(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
    }
}
