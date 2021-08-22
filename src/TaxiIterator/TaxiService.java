package TaxiIterator;

import java.util.Iterator;

public class TaxiService {
    private Taxi budgetTaxi;
    private Taxi premiumTaxi;
    private Taxi luxuryTaxi;

    public TaxiService(BudgetTaxi budgetTaxi, PremiumTaxi premiumTaxi, LuxuryTaxi luxuryTaxi) {
        this.budgetTaxi = budgetTaxi;
        this.premiumTaxi = premiumTaxi;
        this.luxuryTaxi = luxuryTaxi;
    }

    public void printCheckTaxi(){
        Iterator<TaxiItem> budgetIterator = budgetTaxi.createTaxiIterator();
        Iterator<TaxiItem> premiumIterator = premiumTaxi.createTaxiIterator();
        Iterator<TaxiItem> luxuryIterator = luxuryTaxi.createTaxiIterator();
        System.out.println("Budget Taxi Cars");
        print(budgetIterator);
        System.out.println("Premium Taxi Cars");
        print(premiumIterator);
        System.out.println("Luxury Taxi Cars \\n----\\");
        print(luxuryIterator);
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
