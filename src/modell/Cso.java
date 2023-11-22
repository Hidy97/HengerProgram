package modell;

/**
 *
 * @author CsaládiAlexandra(SZF
 */
public class Cso extends TomorHenger{
    private double falvastagsag;
    
    public Cso(double sugar, double magassag, double fajsuly) {
        super(sugar, magassag, fajsuly);
    }

    public Cso(double falvastagsag, double sugar, double magassag, double fajsuly) {
        super(sugar, magassag, fajsuly);
        this.falvastagsag = falvastagsag;
    }

    public double getFalvastagsag() {
        return falvastagsag;
    }
    
    @Override
    public double terfogat(){
        double terfogat = 0;
        return terfogat;
    }

    @Override
    public String toString() {
        return "Cso{" + "falvastagsag=" + falvastagsag + '}';
    }

}
