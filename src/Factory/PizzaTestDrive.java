package Factory;

import Factory.Pizza.Pizza;
import Factory.PizzaStore.ChicagoStylePizzaStore;
import Factory.PizzaStore.NYStylePizzaStore;
import Factory.PizzaStore.PizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chiStore = new ChicagoStylePizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Eaten ordered " + pizza.getName() + "\n");
        pizza = chiStore.orderPizza("pepperoni");
        System.out.println("Joel ordered " + pizza.getName() + "\n");
    }
}
