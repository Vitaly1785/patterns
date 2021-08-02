package Factory.PizzaStore;

import Factory.Pizza.*;

public class ChicagoStylePizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        switch (type){
            case("cheese"):
                pizza = new ChicagoStyleCheesePizza();
                break;
            case("veggie"):
                pizza = new ChicagoStyleVeggiePizza();
                break;
            case("pepperoni"):
                pizza = new ChicagoStylePepperoniPizza();
                break;
            case("clam"):
                pizza = new ChicagoStyleClamPizza();
                break;
            default:
                pizza = null;
                break;
        }
        return pizza;
    }
}
