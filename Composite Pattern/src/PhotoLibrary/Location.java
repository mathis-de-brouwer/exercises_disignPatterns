package PhotoLibrary;

import java.util.ArrayList;
import java.util.List;

public class Location implements PhotoComponents {
    private String name;
    List<PhotoComponents> c = new ArrayList<>();

    public Location(String name){
        this.name = name;

    }
    public void add(PhotoComponents p){
        c.add(p);
    }

    public void print(){
        System.out.println("\n" + name);
        for (PhotoComponents p : c){
            p.print();
        }
    }
}
