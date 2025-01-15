package Olympics;

public class PressIntranet implements Observer{
    private CentralizedSystem cs;

    public PressIntranet(CentralizedSystem cs){
        this.cs = cs;
    }

    @Override
    public void update(){
        double sdle = cs.getSdle();
        System.out.println("Press Intranet: \nSdle: " + sdle);
    }
}
