package proto;

/**
 * ToutesLesClasses Créé par David, base de donnée des classes.
 */

public final class ToutesLesClasses {

    private static ToutesLesClasses instance;

    // constructeur privé.
    private ToutesLesClasses() {

    }

    public static ToutesLesClasses GetInstance() {
        if (instance == null) {
            instance = new ToutesLesClasses();
        }
        return instance;
    }

    Classe guerrier = new Classe("Guerrier",
    "c'est un guerrier.",
    new StatistiqueBonus(0),
    new StatistiqueBonus(0),
    new StatistiqueBonus(0),
    new StatistiqueBonus(0),
    new StatistiqueBonus(0),
    new Sort(null, null, 0, 0, 0, 0, false));

    // Getters

    public Classe getGuerrier() {
        return guerrier;
    }

    // Setters

    public void setGuerrier(Classe _guerrier) {
        guerrier = _guerrier;
    }

}
