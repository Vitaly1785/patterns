package TaxiIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaxiTestDrive {
    public static void main(String[] args) {
        List<Taxi> taxiList = new ArrayList<>(Arrays.asList(new BudgetTaxi(), new PremiumTaxi(), new LuxuryTaxi()));

        TaxiService taxiService = new TaxiService(taxiList);
        taxiService.printCheckTaxi();
    }
}
