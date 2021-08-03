package Factory.Ingredients;

import Factory.Ingredients.Cheeses.ReggianoCheese;
import Factory.Ingredients.Clam.FreshClams;
import Factory.Ingredients.Doughs.ThinCrustDough;
import Factory.Ingredients.Pepperonies.SlicedPepperoni;
import Factory.Ingredients.Sauces.MarinaraSauce;
import Factory.Ingredients.Veggie.Garlic;
import Factory.Ingredients.Veggie.Mushroom;
import Factory.Ingredients.Veggie.Onion;
import Factory.Ingredients.Veggie.RedPepper;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Onion(), new Garlic(), new Mushroom(), new RedPepper()};
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
