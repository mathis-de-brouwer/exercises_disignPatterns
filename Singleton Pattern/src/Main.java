import Printspooler.*;
public class Main {
    public static void main(String[] args) {

        PrintSpooler p = PrintSpooler.getInstance();

        Document d1 = new Document("doc1", 123, false);
        Document d2 = new Document("doc2", 9083, false);
        Document d3 = new Document("doc3", 1873834, true);
        Document d4 = new Document("doc4", 13784, true);

        p.addDocument(d1);
        p.addDocument(d2);
        p.addDocument(d3);
        p.addDocument(d4);

        p.processDocu();
        p.removeDocument(d2);
        p.printDocu();



    }
}