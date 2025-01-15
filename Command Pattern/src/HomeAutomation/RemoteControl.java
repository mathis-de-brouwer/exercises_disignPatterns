package HomeAutomation;

public class RemoteControl {
    private Command cd;
    public void setCd(Command cd){
        this.cd = cd;
    }
    public void pressbuttonOn(){
        cd.execute();
    }
    public void pressbuttonOff(){
        cd.executeOff();
    }
}
