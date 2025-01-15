package Olympics;

public class AthleteIntranet implements Observer{
    private CentralizedSystem cs;
    public AthleteIntranet(CentralizedSystem cs){
        this.cs = cs;
    }

    @Override
    public void update(){
        double sdle = cs.getSdle();
        String profile = cs.getProfile();
        String result = cs.getResult();
        System.out.println("Athlete Intranet: \nSdle: " + sdle + "\nProfile: " + profile + "\nResult: " + result );
    }
}
