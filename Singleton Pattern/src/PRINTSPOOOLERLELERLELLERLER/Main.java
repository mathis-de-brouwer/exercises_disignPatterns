package PRINTSPOOOLERLELERLELLERLER;

public class Main {
    public static void main(String[] args) {
        SpooleOfThePrint p = SpooleOfThePrint.getInstance();
        CanYouTellImLosingMyMind d1 = new CanYouTellImLosingMyMind("name","i really want to go eat me hungy");
        p.addDocu(d1);
        p.procesDocu();

    }
}
