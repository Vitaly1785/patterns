package TaxiIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class BudgetTaxi implements Taxi{
    ArrayList<TaxiItem> budgetTaxi;

    public BudgetTaxi() {
        budgetTaxi = new ArrayList<>();
        addBudgetTaxiItem(18, "Zhigul", "Gogik Mataladze");
        addBudgetTaxiItem(782, "Zaz", "Garik Dadonov");
        addBudgetTaxiItem(5345, "Vesta", "Anton Petrov");
        addBudgetTaxiItem(234, "Gaz", "Zhorik Vartanov");
    }

    public void addBudgetTaxiItem(int number, String model, String driver){
        TaxiItem taxiItem = new TaxiItem(number, model, driver);
        budgetTaxi.add(taxiItem);
    }

    @Override
    public Iterator<TaxiItem> createTaxiIterator() {
        return budgetTaxi.iterator();
    }
}
