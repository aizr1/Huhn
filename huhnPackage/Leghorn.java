package systems.aizr.huhnPackage;

/**
 * Created by theo on 12.04.16.
 * aizr.systems
 */
public class Leghorn extends Huhn {

    public Leghorn(String name, double eier, double gewicht, char geschlecht){
        setName(name);
        setEier(eier);
        setGewicht(gewicht);
        setGeschlecht(geschlecht);

        if (geschlecht == 'm' && gewicht < 1.3) {
            setGewicht(1.5);
            System.out.println("Dein Huhn names " + name + " ist leider ein zu leichter Hahn. ");
        }

        if (geschlecht == 'm' && eier != 0) {
            setEier(0.0);
            System.out.println("Dein Hahn names " + name + " kann keine Eier legen, da das Vieh männlich ist.");
        }

        if (name == "Leo  "){ //Der Hahn LEO hat nur einen Flügel.
            setFluegel(1);
        } else {
            setFluegel(2);
        }

    }
}
