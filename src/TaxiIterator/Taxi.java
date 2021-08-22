package TaxiIterator;

import java.util.Iterator;

public interface Taxi {
    Iterator<TaxiItem> createTaxiIterator();
}
