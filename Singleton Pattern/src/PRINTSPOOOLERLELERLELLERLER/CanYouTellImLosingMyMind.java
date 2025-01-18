package PRINTSPOOOLERLELERLELLERLER;

public class CanYouTellImLosingMyMind {
    private String name;
    private String descr;

    public CanYouTellImLosingMyMind(String name, String descr) {
        this.name = name;
        this.descr = descr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    @Override
    public String toString() {
        return "CanYouTellImLosingMyMind =" +
                "\nname: '" + name + ", descr: '" + descr;
    }
}
