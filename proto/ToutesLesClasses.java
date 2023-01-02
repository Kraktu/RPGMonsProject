package proto;

/**
 * ToutesLesClasses Créé par David, base de donnée des classes.
 */

// Archer, Guerrier, Mage, Voleur
// Force, Intelligence, Agilité, Dextérité, Constitution

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

    Classe archer = new Classe("Archer",
    "c'est un archer",
    new StatistiqueBonus(-2),
    new StatistiqueBonus(0),
    new StatistiqueBonus(3),
    new StatistiqueBonus(2),
    new StatistiqueBonus(1),
    new Sort(null, null, 0, 0, 0, 0, false)
    );

    Classe guerrier = new Classe("Guerrier",
    "c'est un guerrier.",
    new StatistiqueBonus(2),
    new StatistiqueBonus(0),
    new StatistiqueBonus(-2),
    new StatistiqueBonus(1),
    new StatistiqueBonus(3),
    new Sort(null, null, 0, 0, 0, 0, false)
    );

    Classe mage = new Classe("Mage",
    "c'est un mage.",
    new StatistiqueBonus(-2),
    new StatistiqueBonus(3),
    new StatistiqueBonus(0),
    new StatistiqueBonus(1),
    new StatistiqueBonus(2),
    new Sort(null, null, 0, 0, 0, 0, false)
    );

    Classe voleur = new Classe("Voleur",
    "c'est un voleur.",
    new StatistiqueBonus(-2),
    new StatistiqueBonus(1),
    new StatistiqueBonus(2),
    new StatistiqueBonus(3),
    new StatistiqueBonus(0),
    new Sort(null, null, 0, 0, 0, 0, false)
    );

    // Getters

    public Classe getGuerrier() {
        return guerrier;
    }

    // Setters

    public void setGuerrier(Classe _guerrier) {
        guerrier = _guerrier;
    }

}
