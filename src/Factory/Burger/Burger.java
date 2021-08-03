package Factory.Burger;

import Factory.Burger.Ingredients.Buns;
import Factory.Burger.Ingredients.Meats;
import Factory.Burger.Ingredients.Sauces;
import Factory.Burger.Ingredients.Veggies;

import java.util.Arrays;


public abstract class Burger {
    String name;
    Buns buns;
    Meats meats;
    Sauces sauces;
    Veggies[] veggies;

    public abstract void prepare();

    public void box(){
        System.out.println("put Burger to box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "name='" + name + '\'' +
                ", buns=" + buns +
                ", meats=" + meats +
                ", sauces=" + sauces +
                ", veggies=" + Arrays.toString(veggies) +
                '}';
    }
}
