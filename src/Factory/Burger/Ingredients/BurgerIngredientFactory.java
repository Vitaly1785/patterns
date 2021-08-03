package Factory.Burger.Ingredients;

public interface BurgerIngredientFactory {
    Buns createBuns();
    Meats createMeats();
    Sauces createSauces();
    Veggies[] createVeggies();
}
