package OLimpIcsclindoeuil;

public class PressIntranet implements Oserve{
    private CentralisedSystem cs;
    public PressIntranet(CentralisedSystem cs){
        this.cs = cs;
    }

    public void updating(){
        String prof = cs.getProfile();
        int res = cs.getResult();
        String sdle = cs.getSchedule();

        System.out.println("Press is allmighty: " + prof + ", "+ res + ", "+ sdle);
    }
}
