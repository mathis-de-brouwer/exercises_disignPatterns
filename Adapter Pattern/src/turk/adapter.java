package turk;

public class adapter implements notTurk {
    private turk t;

    public adapter(turk t) {
        this.t = t;
    }

    @Override
    public void livingInGermany() {
        t.livingInGermany();
    }

    @Override
    public void eatdurum() {
        t.durum();
    }
}
