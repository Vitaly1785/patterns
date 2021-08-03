package Factory.Burger.Ingredients;

import Factory.Burger.Ingredients.Bun.Wheat;
import Factory.Burger.Ingredients.Meat.Cow;
import Factory.Burger.Ingredients.Sauce.Cheese;
import Factory.Burger.Ingredients.Veggie.Cucumber;
import Factory.Burger.Ingredients.Veggie.Salad;
import Factory.Burger.Ingredients.Veggie.Tomato;

public class AmericanBurgerIngredientFactory implements BurgerIngredientFactory{
    @Override
    public Buns createBuns() {
        return new Wheat();
    }

    @Override
    public Meats createMeats() {
        return new Cow();
    }

    @Override
    public Sauces createSauces() {
        return new Cheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Tomato(), new Cucumber(), new Salad()};
    }
}
