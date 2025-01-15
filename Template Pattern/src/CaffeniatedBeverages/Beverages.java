package CaffeniatedBeverages;

public abstract class Beverages {
    public final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    public void boilWater(){
        System.out.println("Boil water");
    }
    public void pourInCup(){
        System.out.println("pour in cup");
    }
    public abstract void brew();
    public abstract void addCondiments();
}
