package Factory.Pizza;

import Factory.Ingredients.PizzaIngredientFactory;

public class CheesePizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        cheese = ingredientFactory.createCheese();
        sauce = ingredientFactory.createSauce();
        dough = ingredientFactory.createDough();
    }
}
