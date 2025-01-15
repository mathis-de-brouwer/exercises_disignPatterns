package PhotoLibrary;

public class Photo implements PhotoComponents {
    private String name;

    public Photo(String name){
        this.name = name;
    }
    public void print(){
        System.out.println(name);
    }
}
