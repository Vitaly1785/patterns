package Factory.Burger.BurgerStore;

import Factory.Burger.BigMak;
import Factory.Burger.BigTesty;
import Factory.Burger.Burger;
import Factory.Burger.Ingredients.AmericanBurgerIngredientFactory;
import Factory.Burger.Ingredients.BurgerIngredientFactory;

public class AmericanBurgerStore extends BurgerStore{
    @Override
    public Burger createBurger(String type) {
        Burger burger;
        BurgerIngredientFactory ingredientFactory = new AmericanBurgerIngredientFactory();

        switch (type){
            case("BigMak"):
                burger = new BigMak(ingredientFactory);
                burger.setName("BigMak");
                break;
            case("BigTesty"):
                burger = new BigTesty(ingredientFactory);
                burger.setName("BigTesty");
                break;
            default:
                burger = null;
                break;
        }
        return burger;
    }
}
