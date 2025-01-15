package Olympics;

public class EventWebsite implements Observer{
    private CentralizedSystem cs;

    public EventWebsite(CentralizedSystem cs){
        this.cs = cs;
    }

    @Override
    public void update(){
        double sdle = cs.getSdle();
        String result = cs.getResult();
        System.out.println("Event website: \nSdle: " + sdle + "\nResult: " + result );
    }
}
