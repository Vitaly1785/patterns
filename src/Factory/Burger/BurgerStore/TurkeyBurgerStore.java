package Factory.Burger.BurgerStore;

import Factory.Burger.BigMak;
import Factory.Burger.BigTesty;
import Factory.Burger.Burger;
import Factory.Burger.Ingredients.BurgerIngredientFactory;
import Factory.Burger.Ingredients.TurkeyBurgerIngredientFactory;

public class TurkeyBurgerStore extends BurgerStore{
    @Override
    public Burger createBurger(String type) {
        Burger burger;
        BurgerIngredientFactory ingredientFactory = new TurkeyBurgerIngredientFactory();

        switch (type){
            case("BgMak"):
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
