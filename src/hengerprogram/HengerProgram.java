package hengerprogram;

import java.util.List;

public class HengerProgram {

    private List[] hengerek;

    public static void main(String[] args) {
        HengerProgram hp = new HengerProgram();
        hp.run();
    }

    public void run() {
        atlagTerfogat();
        csovekSulya();
    }

    public HengerProgram() {

    }

    public double atlagTerfogat() {
        //Átlag térfogat kiszámítása
        return 0;
    }

    public double csovekSulya() {
        //Összes cső(!) súlya

        return 0;
    }

    private List[] lista() {
        hengerek = new List[4];
        return hengerek;
    }

}
