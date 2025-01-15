package Printspooler;

public class Document {
    String name;
    int numberBytes;
    boolean isColor;

    public Document(String name, int numberBytes, boolean isColor) {
        this.name = name;
        this.numberBytes = numberBytes;
        this.isColor = isColor;
    }

    public String getName() {
        return name;
    }

    public int getNumberBytes() {
        return numberBytes;
    }

    public boolean isColor() {
        return isColor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberBytes(int numberBytes) {
        this.numberBytes = numberBytes;
    }

    @Override
    public String toString() {
        return "Document: " +
                "\nname: " + name +
                "\nnumberBytes: " + numberBytes +
                "\nisColor: " + isColor;
    }
}
