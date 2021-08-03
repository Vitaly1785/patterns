package Factory.Burger.BurgerStore;

import Factory.Burger.Burger;

public abstract class BurgerStore {
    public Burger orderBurger(String type){
        Burger burger;
        burger = createBurger(type);
        burger.prepare();
        burger.box();
        return burger;
    }

    public abstract Burger createBurger(String type);
}
