package systems.aizr.huhnPackage;

/**
 * Created by theo on 12.04.16.
 * aizr.systems
 */
public class Perlhuhn extends Huhn{

    public Perlhuhn (String name, double eier, char geschlecht){
        setName(name);
        setEier(eier);
        setGeschlecht(geschlecht);

        if (geschlecht == 'm') {
            setGewicht(1.4);
        } else if (geschlecht == 'w') {
            setGewicht(1.2);
        }
    }


}
