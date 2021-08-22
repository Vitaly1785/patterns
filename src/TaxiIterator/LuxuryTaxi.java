package TaxiIterator;

import java.util.HashMap;
import java.util.Iterator;

public class LuxuryTaxi implements Taxi{
    private HashMap<Integer, TaxiItem> taxiItems = new HashMap<>();

    public LuxuryTaxi() {
        addLuxuryTaxi(111, "Bugatti", "Alonso");
        addLuxuryTaxi(222, "Ferrari", "Schumacher");
        addLuxuryTaxi(333, "Williams", "Senna");
        addLuxuryTaxi(444, "McLaren", "Hamilton");
    }

    public void addLuxuryTaxi(int number, String model, String driver){
        TaxiItem taxiItem = new TaxiItem(number, model, driver);
        taxiItems.put(taxiItem.getNumber(), taxiItem);
    }

    @Override
    public Iterator<TaxiItem> createTaxiIterator() {
        return taxiItems.values().iterator();
    }
}
