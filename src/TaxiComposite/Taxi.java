package TaxiComposite;

import java.util.ArrayList;
import java.util.List;

public class Taxi extends TaxiComponent{
    private List<TaxiComponent> taxiComponents = new ArrayList<>();
    private String model;

    public Taxi(String model) {
        this.model = model;
    }

    @Override
    public void add(TaxiComponent taxiComponent) {
        taxiComponents.add(taxiComponent);
    }

    @Override
    public void remove(TaxiComponent taxiComponent) {
        taxiComponents.remove(taxiComponent);
    }

    @Override
    public TaxiComponent getChild(int i) {
        return taxiComponents.get(i);
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public void print() {
        System.out.println("\n   "  + getModel());
        System.out.println("-----------");

        for (TaxiComponent taxiComponent : taxiComponents) {
            taxiComponent.print();
        }
    }
}
