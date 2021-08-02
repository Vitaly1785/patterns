package Factory.PizzaStore;

import Factory.Pizza.*;


public class NYStylePizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        switch(type){
            case("cheese"):
                pizza = new NYStyleCheesePizza();
                break;
            case("veggie"):
                pizza = new NYStyleVeggiePizza();
                break;
            case("pepperoni"):
                pizza = new NYStylePepperoniPizza();
                break;
            case("clam"):
                pizza = new NYStyleClamPizza();
                break;
            default:
                pizza = null;
                break;
        }
        return pizza;
    }
}
