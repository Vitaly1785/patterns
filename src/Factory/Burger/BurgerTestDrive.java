package Factory.Burger;

import Factory.Burger.BurgerStore.AmericanBurgerStore;
import Factory.Burger.BurgerStore.BurgerStore;
import Factory.Burger.BurgerStore.TurkeyBurgerStore;

public class BurgerTestDrive {
    public static void main(String[] args) {
        BurgerStore usStore = new AmericanBurgerStore();
        BurgerStore turStore = new TurkeyBurgerStore();
        Burger burger = usStore.orderBurger("BigMak");
        System.out.println("John ordered " + burger + "\n");
        burger = turStore.orderBurger("BigTesty");
        System.out.println("Ali ordered " + burger + "\n");
    }
}
