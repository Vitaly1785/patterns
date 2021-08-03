package Factory.Ingredients;

import Factory.Ingredients.Cheeses.MozzarellaCheese;
import Factory.Ingredients.Clam.FrozenClams;
import Factory.Ingredients.Doughs.ThickCrustDough;
import Factory.Ingredients.Pepperonies.SlicedPepperoni;
import Factory.Ingredients.Sauces.PlanTomatoSauce;
import Factory.Ingredients.Veggie.BlackOlives;
import Factory.Ingredients.Veggie.EggPlant;
import Factory.Ingredients.Veggie.Spinach;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlanTomatoSauce();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new BlackOlives(), new EggPlant(), new Spinach()};
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }
}
