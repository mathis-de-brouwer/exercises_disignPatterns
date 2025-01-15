package Printspooler;

import java.util.LinkedList;
import java.util.Queue;

public class PrintSpooler {
    private static PrintSpooler instance;
    private Queue<Document> docu;

    private PrintSpooler(){
        docu = new LinkedList<>();
    }

    public static PrintSpooler getInstance(){
        if (instance == null){
            instance = new PrintSpooler();
        }
        return instance;
    }


    public void addDocument(Document d){
        docu.add(d);
    }

    public void removeDocument(Document d){
        docu.remove(d);
    }

    public void processDocu(){
        if (docu.isEmpty()){
            System.out.println("nothing to process");
        }else {
            Document d = docu.poll();
            System.out.println("Printing: "+ d.getName());
        }
    }

    public void printDocu(){
        if (docu.isEmpty()){
            System.out.println("nothing to print");
        } else {
            System.out.println("Queue:\n");
            for (Document d : docu){
                System.out.println(d);
            }
        }
    }
}
