package oppgave_2; // oppgave 2
//gruppe 38: Louise Guren, Hamid Hamrah og Stian Ha

import static javax.swing.JOptionPane.*;

class Vare {
    private String navn;
    private int antall;
    private double pris;

    public Vare(String navn, int antall, double pris) {
        this.navn = navn;
        this.antall = antall;
        this.pris = pris;
    }

    public String getNavn() {
        return navn;
    }
    public int getAntall() {
        return antall;
    }
    public double getPris() {
        return pris;
    }
    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void setAntall(int antall){
        if (antall > 0) {
            this.antall = antall;
        }
        else {
            this.antall = Math.abs(antall);
        }
    }

    public void setPris(int pris) {
        if (pris > 0){
            this.pris = pris;
        }
        else {
            this.antall = Math.abs(antall);
        }
    }

    public double totalpris() {
        return pris*antall;
    }
}

public class oppgave_2 {
    public static void main(String[] args) {

        String navn1 = showInputDialog("Skriv inn navnet til vare nr. 1");
        String innAntall1 = showInputDialog("skriv inn antall til vare 1");
        int antall1;
        String innPris1 = showInputDialog("Skriv inn pris for vare 1");
        double pris1;

        String navn2 = showInputDialog("Skrive inn navnet til vare nr. 2");
        String innAntall2 = showInputDialog("Skriv inn antall til antall til vare 2");
        int antall2;
        String innPris2 = showInputDialog("Skriv inn pris for vare 2");
        double pris2;

        try {
            antall1 = Integer.parseInt(innAntall1);
            pris1 = Double.parseDouble(innPris1);
        }
        catch (Exception e) {
            antall1 = 0;
            pris1 = 0;
        }
        try {
            antall2 = Integer.parseInt(innAntall2);
            pris2 = Double.parseDouble(innPris2);
        }
        catch (Exception e) {
            antall2 = 0;
            pris2 = 0;
        }
        //Denne måten funker bare fordi vi ganger antall med pris. i.e. hvis en av dem er null så blir produktet null.


            Vare vare1 = new Vare(navn1, antall1, pris1);
            Vare vare2 = new Vare(navn2, antall2, pris2);

            double totalpris = vare1.totalpris() +vare2.totalpris();
            System.out.println("Totalprisen ble: " + totalpris);

        }
    }


