package modell;

/**
 *
 * @author CsaládiAlexandra(SZF
 */
public class TomorHenger extends Henger {
    private double fajsuly;
    
    public TomorHenger(double sugar, double magassag) {
        super(sugar, magassag);
    }
    
    public TomorHenger(double sugar, double magassag, double fajsuly) {
        super(sugar, magassag);
        this.fajsuly = fajsuly;
    }

    public double getFajsuly() {
        return fajsuly;
    }
    
    public double suly(){
        double suly = fajsuly * getMagassag();
        return suly;
    }

    @Override
    public String toString() {
        return "TomorHenger{" + "fajsuly=" + fajsuly + '}';
    }    
}
