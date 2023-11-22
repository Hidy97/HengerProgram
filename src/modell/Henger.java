package modell;

/**
 *
 * @author CsaládiAlexandra(SZF
 */
public class Henger {
    private static int hengerDarab;
    private double sugar, magassag;

    public Henger(double sugar, double magassag) {
        this.sugar = sugar;
        this.magassag = magassag;
    }

    public static int getHengerDarab() {
        return hengerDarab;
    }

    public double getSugar() {
        return sugar;
    }

    public double getMagassag() {
        return magassag;
    }
    
    public double terfogat(){
        double terfogat = sugar*magassag;
        return terfogat;
    }

    @Override
    public String toString() {
        return "Henger{" + "hengerDarab=" + hengerDarab + ", sugar=" + sugar + ", magassag=" + magassag + '}';
    }    
}
