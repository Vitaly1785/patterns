package Factory.PizzaStore;

import Factory.Ingredients.NYPizzaIngredientFactory;
import Factory.Ingredients.PizzaIngredientFactory;
import Factory.Pizza.*;


public class NYStylePizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        switch(type){
            case("cheese"):
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("New York Style Cheese Pizza");
                break;
            case("veggie"):
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("New York Style Veggie Pizza");
                break;
            case("pepperoni"):
                pizza =new PepperoniPizza(ingredientFactory);
                pizza.setName("New York Style Pepperoni Pizza");
                break;
            case("clam"):
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("New York Style Clam Pizza");
                break;
            default:
                pizza = null;
                break;
        }
        return pizza;
    }
}
