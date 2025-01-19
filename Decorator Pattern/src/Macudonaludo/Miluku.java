package Macudonaludo;

public class Miluku extends condimenTing{


    public Miluku(Beverages b) {
        super(b);
    }

    @Override
    public String getDesription() {
        return b.getDesription() + ", Miluku";
    }

    @Override
    public double getPrice() {
        return b.getPrice()+0.6;
    }
}
