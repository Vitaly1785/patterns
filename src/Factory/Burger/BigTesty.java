package Factory.Burger;

import Factory.Burger.Ingredients.BurgerIngredientFactory;

public class BigTesty extends Burger{
    BurgerIngredientFactory ingredientFactory;

    public BigTesty(BurgerIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        buns = ingredientFactory.createBuns();
        meats = ingredientFactory.createMeats();
        sauces = ingredientFactory.createSauces();
        veggies = ingredientFactory.createVeggies();
    }
}
