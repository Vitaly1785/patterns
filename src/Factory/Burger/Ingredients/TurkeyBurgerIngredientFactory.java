package Factory.Burger.Ingredients;

import Factory.Burger.Ingredients.Bun.RyeWheat;
import Factory.Burger.Ingredients.Meat.Chicken;
import Factory.Burger.Ingredients.Sauce.Carry;
import Factory.Burger.Ingredients.Veggie.Onion;
import Factory.Burger.Ingredients.Veggie.Tomato;

public class TurkeyBurgerIngredientFactory implements BurgerIngredientFactory{
    @Override
    public Buns createBuns() {
        return new RyeWheat();
    }

    @Override
    public Meats createMeats() {
        return new Chicken();
    }

    @Override
    public Sauces createSauces() {
        return new Carry();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Tomato(), new Onion()};
    }
}
