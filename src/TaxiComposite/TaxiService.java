package TaxiComposite;

public class TaxiService {
    private TaxiComponent allTaxi;

    public TaxiService(TaxiComponent allTaxi) {
        this.allTaxi = allTaxi;
    }

    public void print(){
        allTaxi.print();
    }
}
