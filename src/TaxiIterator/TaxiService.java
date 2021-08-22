package TaxiIterator;

import java.util.Iterator;
import java.util.List;

public class TaxiService {
   private List<Taxi> taxis;

    public TaxiService(List<Taxi> taxis) {
        this.taxis = taxis;
    }

    public void printCheckTaxi(){
        for (Taxi taxi : taxis) {
            print(taxi.createTaxiIterator());
        }
    }

    public void print(Iterator<TaxiItem> taxiItemIterator){
        while (taxiItemIterator.hasNext()){
            TaxiItem taxiItem = taxiItemIterator.next();
            System.out.print("Number of car " + taxiItem.getNumber() + " ");
            System.out.print("Model is " + taxiItem.getModel() + " ");
            System.out.println("Driver name: " + taxiItem.getDriver());
        }
    }
}
