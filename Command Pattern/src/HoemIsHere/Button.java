package HoemIsHere;

public class Button{
    private Command cd;

    public Button(Command cd) {
        this.cd = cd;
    }
    public void pressButton(){
        cd.execute();
    }
}
