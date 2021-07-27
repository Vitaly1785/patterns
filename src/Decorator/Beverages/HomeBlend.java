package Decorator.Beverages;

public class HomeBlend extends Beverage{

    public HomeBlend() {
        description = "Home Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
