package PRINTSPOOOLERLELERLELLERLER;

import java.util.LinkedList;
import java.util.Queue;

public class SpooleOfThePrint {
    private static SpooleOfThePrint instance;
    private Queue<CanYouTellImLosingMyMind> doculist;


    public static SpooleOfThePrint getInstance(){
        if(instance == null){
            synchronized (SpooleOfThePrint.class){ //so no multithread classing instancecs
                instance = new SpooleOfThePrint();
            }
        }
        return instance;
    }
    public SpooleOfThePrint() {
        this.doculist = new LinkedList<>();
    }
    public void addDocu(CanYouTellImLosingMyMind d){
        doculist.add(d);
    }
    public void removeDocu(CanYouTellImLosingMyMind d){
        doculist.remove(d);
    }
    public void procesDocu(){
        System.out.println("processed next doc: "+ doculist.toString());
        doculist.poll();
    }


}
