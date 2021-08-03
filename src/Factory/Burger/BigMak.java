package Factory.Burger;

import Factory.Burger.Ingredients.BurgerIngredientFactory;

public class BigMak extends Burger{
    BurgerIngredientFactory ingredientFactory;

    public BigMak(BurgerIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Prepare " + name);
        buns = ingredientFactory.createBuns();
        sauces = ingredientFactory.createSauces();
        meats = ingredientFactory.createMeats();
        veggies = ingredientFactory.createVeggies();
    }
}
