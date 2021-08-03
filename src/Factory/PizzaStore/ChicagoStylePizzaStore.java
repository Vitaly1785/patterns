package Factory.PizzaStore;

import Factory.Ingredients.ChicagoPizzaIngredientFactory;
import Factory.Ingredients.PizzaIngredientFactory;
import Factory.Pizza.*;

public class ChicagoStylePizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        switch (type){
            case("cheese"):
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("Chicago Style Cheese Pizza");
                break;
            case("veggie"):
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("Chicago Style Veggie Pizza");
                break;
            case("pepperoni"):
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("Chicago Style Pepperoni Pizza");
                break;
            case("clam"):
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("Chicago Style Clam Pizza");
                break;
            default:
                pizza = null;
                break;
        }
        return pizza;
    }
}
