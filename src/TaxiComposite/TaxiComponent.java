package TaxiComposite;

public abstract class TaxiComponent {
    public void add(TaxiComponent taxiComponent){
        throw new UnsupportedOperationException();
    }
    public void remove(TaxiComponent taxiComponent){
        throw new UnsupportedOperationException();
    }
    public TaxiComponent getChild(int i){
        throw new UnsupportedOperationException();
    }
    public int getNumber(){
        throw new UnsupportedOperationException();
    }

    public String getModel(){
        throw new UnsupportedOperationException();
    }
    public String getDriver(){
        throw new UnsupportedOperationException();
    }
    public void print(){
        throw new UnsupportedOperationException();
    }
}
