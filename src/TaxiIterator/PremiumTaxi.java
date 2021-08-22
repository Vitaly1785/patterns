package TaxiIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PremiumTaxi implements Taxi{
    private ArrayList<TaxiItem> premiumTaxi;

    public PremiumTaxi() {
        premiumTaxi = new ArrayList<>();
        addTaxiItem(1, "BMW", "Lukas Podolsky");
        addTaxiItem(2, "AUDI", "German Frog");
        addTaxiItem(3, "Mercedes", "Fritz Shultz");
        addTaxiItem(4, "Porsche", "Brayan Gut");
    }

    public void addTaxiItem(int number, String model, String driver) {
        TaxiItem taxiItem = new TaxiItem(number, model, driver);
        premiumTaxi.add(taxiItem);
    }

    @Override
    public Iterator<TaxiItem> createTaxiIterator() {
        return premiumTaxi.iterator();
    }
}
