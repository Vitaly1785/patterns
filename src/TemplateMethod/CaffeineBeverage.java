package TemplateMethod;

public abstract class CaffeineBeverage {

    public final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    protected abstract void brew();

    protected abstract void addCondiments();

    protected void boilWater(){
        System.out.println("Boiling Water");
    }

    protected void pourInCup(){
        System.out.println("Pour Into Cup");
    }

}
