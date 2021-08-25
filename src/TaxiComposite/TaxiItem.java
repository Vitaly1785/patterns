package TaxiComposite;

public class TaxiItem extends TaxiComponent{
    private int number;
    private String model;
    private String driver;

    public TaxiItem(int number, String model, String driver) {
        this.number = number;
        this.model = model;
        this.driver = driver;
    }

    public int getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public String getDriver() {
        return driver;
    }

    @Override
    public void print() {
        System.out.print("   " + getNumber());
        System.out.print(",  " + getModel());
        System.out.println(",  " + getDriver());
    }
}
