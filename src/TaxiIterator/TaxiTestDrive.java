package TaxiIterator;

public class TaxiTestDrive {
    public static void main(String[] args) {
        BudgetTaxi budgetTaxi = new BudgetTaxi();
        PremiumTaxi premiumTaxi = new PremiumTaxi();
        LuxuryTaxi luxuryTaxi = new LuxuryTaxi();

        TaxiService taxiService = new TaxiService(budgetTaxi, premiumTaxi, luxuryTaxi);
        taxiService.printCheckTaxi();
    }
}
