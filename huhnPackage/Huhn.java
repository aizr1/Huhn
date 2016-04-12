package systems.aizr.huhnPackage;

/**
 * Created by theo on 12.04.16.
 * aizr.systems
 */
public class Huhn {

    private static String name;
    private static int fluegel = 2;
    private static double eier;
    private static double gewicht;
    private static char geschlecht;
    private static boolean suppenhuhn;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Huhn.name = name;
    }

    public static int getFluegel() {
        return fluegel;
    }

    public static void setFluegel(int fluegel) {
        Huhn.fluegel = fluegel;
    }

    public static double getEier() {
        return eier;
    }

    public static void setEier(double eier) {
        Huhn.eier = eier;
    }

    public static double getGewicht() {
        return gewicht;
    }

    public static void setGewicht(double gewicht) {
        Huhn.gewicht = gewicht;
    }

    public static char getGeschlecht() {
        return geschlecht;
    }

    public static void setGeschlecht(char geschlecht) {
        Huhn.geschlecht = geschlecht;
    }

    public static boolean isSuppenhuhn() {
        return suppenhuhn;
    }

    public static void setSuppenhuhn(boolean suppenhuhn) {
        Huhn.suppenhuhn = suppenhuhn;
    }

    public static void suppenmethode(double limit) {
        if (eier/gewicht < limit){
            suppenhuhn = true;
        } else {
            suppenhuhn = false;
        }
    }

}
