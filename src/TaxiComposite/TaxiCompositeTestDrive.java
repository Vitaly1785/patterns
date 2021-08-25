package TaxiComposite;

public class TaxiCompositeTestDrive {
    public static void main(String[] args) {
        TaxiComponent budgetTaxi = new Taxi("Budget Taxi");
        TaxiComponent premiumTaxi = new Taxi("Premium taxi");
        TaxiComponent luxuryTaxi = new Taxi("Luxury Taxi");
        TaxiComponent biCycle = new Taxi("BiCycle Items");

        TaxiComponent allTaxi = new Taxi("All Taxi");
        allTaxi.add(budgetTaxi);
        allTaxi.add(premiumTaxi);
        allTaxi.add(luxuryTaxi);

        budgetTaxi.add(new TaxiItem(18, "Zhigul", "Gogik Mataladze"));
        budgetTaxi.add(new TaxiItem(782, "Zaz", "Garik Dadonov"));
        budgetTaxi.add(new TaxiItem(5345, "Vesta", "Anton Petrov"));
        budgetTaxi.add(new TaxiItem(234, "Gaz", "Zhorik Vartanov"));

        budgetTaxi.add(biCycle);

        biCycle.add(new TaxiItem(2323, "Honda", "Driver Free"));
        biCycle.add(new TaxiItem(1212, "Yamaha", "Driver Free"));
        biCycle.add(new TaxiItem(4545, "Suzuki", "Driver Free"));
        biCycle.add(new TaxiItem(5656, "Kawasaki", "Driver Free"));

        premiumTaxi.add(new TaxiItem(1, "BMW", "Lukas Podolsky"));
        premiumTaxi.add(new TaxiItem(2, "AUDI", "German Frog"));
        premiumTaxi.add(new TaxiItem(3, "Mercedes", "Fritz Shultz"));
        premiumTaxi.add(new TaxiItem(4, "Porsche", "Brayan Gut"));

        luxuryTaxi.add(new TaxiItem(111, "Bugatti", "Alonso"));
        luxuryTaxi.add(new TaxiItem(222, "Ferrari", "Schumacher"));
        luxuryTaxi.add(new TaxiItem(333, "Williams", "Senna"));
        luxuryTaxi.add(new TaxiItem(444, "McLaren", "Hamilton"));

        TaxiService taxiService = new TaxiService(allTaxi);
        taxiService.print();
    }
}
