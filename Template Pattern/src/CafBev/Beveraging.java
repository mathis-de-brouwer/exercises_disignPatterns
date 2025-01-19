package CafBev;

public abstract class Beveraging {

    public final void prepareRecipe(){
        boilWotah();
        brew();
        pourBev();
        addCondmen();
    }

    public void boilWotah(){
        System.out.println("Boil tha who ah");
    }
    public void pourBev(){
        System.out.println("POUR INTO CUP");
    }
    protected abstract void brew();
    protected abstract void addCondmen();
}
