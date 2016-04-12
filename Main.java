package systems.aizr;

import systems.aizr.huhnPackage.Huhn;
import systems.aizr.huhnPackage.Leghorn;
import systems.aizr.huhnPackage.Perlhuhn;

import static java.lang.System.lineSeparator;
import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
        Leghorn leo = new Leghorn("Leo  ",0.9,1.9,'m');
        out.println("NAME: " + leo.getName() + " "
                + "EIER: " +  leo.getEier() + " "
                + "GEWICHT: " + leo.getGewicht() + " "
                + "GESCHLECHT: " + leo.getGeschlecht());

        Leghorn lisa = new Leghorn("Lisa ",0.7,1.8,'w');
        out.println("NAME: " + lisa.getName() + " "
                + "EIER: " +  lisa.getEier() + " "
                + "GEWICHT: " + lisa.getGewicht() + " "
                + "GESCHLECHT: " + lisa.getGeschlecht());

        Leghorn lola = new Leghorn("Lola ",0.9,1.4,'w');
        out.println("NAME: " + lola.getName() + " "
                + "EIER: " +  lola.getEier() + " "
                + "GEWICHT: " + lola.getGewicht() + " "
                + "GESCHLECHT: " + lola.getGeschlecht());

        Perlhuhn pia = new Perlhuhn("Pia  ",1.2, 'w');
        out.println("NAME: " + pia.getName() + " "
                + "EIER: " +  pia.getEier() + " "
                + "GEWICHT: " + pia.getGewicht() + " "
                + "GESCHLECHT: " + pia.getGeschlecht());


        Perlhuhn paula = new Perlhuhn("Paula",0.3, 'w');
        out.println("NAME: " + paula.getName() + " "
                + "EIER: " +  paula.getEier() + " "
                + "GEWICHT: " + paula.getGewicht() + " "
                + "GESCHLECHT: " + paula.getGeschlecht());

        Perlhuhn paul = new Perlhuhn("Paul ",0.0, 'm');
        out.println("NAME: " + paul.getName() + " "
                + "EIER: " +  paul.getEier() + " "
                + "GEWICHT: " + paul.getGewicht() + " "
                + "GESCHLECHT: " + paul.getGeschlecht());

    }
}
