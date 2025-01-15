package HomeAutomation;

public class StereoCommand implements Command {
    private Stereo st;

    public StereoCommand(Stereo st){
        this.st = st;
    }

    public void execute(){
        st.on();
        st.selectCD();
        st.setVolume(11);
    }

    public void executeOff(){
        st.off();
    }

}
