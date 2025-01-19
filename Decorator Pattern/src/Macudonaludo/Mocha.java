package Macudonaludo;

public class Mocha extends condimenTing{
    public Mocha(Beverages b) {
        super(b);
    }

    @Override
    public String getDesription() {
        return b.getDesription() + ", Mocha";
    }

    @Override
    public double getPrice() {
        return b.getPrice()+ 1.4;
    }
}
