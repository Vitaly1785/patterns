package TaxiIterator;

public class TaxiTestDrive {
    public static void main(String[] args) {
        BudgetTaxi budgetTaxi = new BudgetTaxi();
        PremiumTaxi premiumTaxi = new PremiumTaxi();

        TaxiService taxiService = new TaxiService(budgetTaxi, premiumTaxi);
        taxiService.printCheckTaxi();
    }
}
