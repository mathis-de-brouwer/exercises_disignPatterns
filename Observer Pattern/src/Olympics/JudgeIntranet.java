package Olympics;

public class JudgeIntranet implements Observer{
    private CentralizedSystem cs;
    public JudgeIntranet(CentralizedSystem cs){
        this.cs = cs;
    }

    @Override
    public void update(){
        double sdle = cs.getSdle();
        String result = cs.getResult();
        System.out.println("Judge Intranet: \nSdle: " + sdle + "\nResult: " + result );
    }

}
