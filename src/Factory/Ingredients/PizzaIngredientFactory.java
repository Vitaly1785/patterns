package Factory.Ingredients;

public interface PizzaIngredientFactory {
    Cheese createCheese();
    Dough createDough();
    Sauce createSauce();
    Pepperoni createPepperoni();
    Veggies[] createVeggies();
    Clams createClams();
}
