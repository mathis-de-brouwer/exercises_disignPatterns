package Menue;

public abstract class AbstractComp implements MenuComponent{
    protected String name1;
    protected String descri;

    public AbstractComp(String name1, String descri) {
        this.name1 = name1;
        this.descri = descri;
    }

    public void addd(MenuComponent m){
        throw new UnsupportedOperationException("Pas possible la");
    }
    public void remove(MenuComponent m){
        throw new UnsupportedOperationException("pas possible la");
    }
    public MenuComponent getChild(int index){
        throw new UnsupportedOperationException("pas possible la");
    }

    public abstract void operation();
}
