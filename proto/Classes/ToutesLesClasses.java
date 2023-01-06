package proto.Classes;

import proto.Sort;
import proto.Stat.StatistiqueBonus;

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

    public Classe archer = new Classe("Archer",
    "c'est un archer",
    new StatistiqueBonus(-2),
    new StatistiqueBonus(0),
    new StatistiqueBonus(3),
    new StatistiqueBonus(2),
    new StatistiqueBonus(1),
    new Sort(null, null, 0, 0, 0, 0, false)
    );

    public Classe guerrier = new Classe("Guerrier",
    "c'est un guerrier.",
    new StatistiqueBonus(2),
    new StatistiqueBonus(0),
    new StatistiqueBonus(-2),
    new StatistiqueBonus(1),
    new StatistiqueBonus(3),
    new Sort(null, null, 0, 0, 0, 0, false)
    );

    public Classe mage = new Classe("Mage",
    "c'est un mage.",
    new StatistiqueBonus(-2),
    new StatistiqueBonus(3),
    new StatistiqueBonus(0),
    new StatistiqueBonus(1),
    new StatistiqueBonus(2),
    new Sort(null, null, 0, 0, 0, 0, false)
    );

    public Classe voleur = new Classe("Voleur",
    "c'est un voleur.",
    new StatistiqueBonus(-2),
    new StatistiqueBonus(1),
    new StatistiqueBonus(2),
    new StatistiqueBonus(3),
    new StatistiqueBonus(0),
    new Sort(null, null, 0, 0, 0, 0, false)
    );

    // Getters :

    public static proto.Classes.ToutesLesClasses getInstance() {
        return instance;
    }

    public Classe GetArcher() {
        return archer;
    }

    public Classe GetGuerrier() {
        return guerrier;
    }

    public Classe GetMage() {
        return mage;
    }

    public Classe GetVoleur() {
        return voleur;
    }


    // Setters :


    public static void SetInstance(proto.Classes.ToutesLesClasses _instance) {
        ToutesLesClasses.instance = _instance;
    }

    public void SetArcher(Classe _archer) {
        archer = _archer;
    }

    public void SetGuerrier(Classe _guerrier) {
        guerrier = _guerrier;
    }

    public void SetMage(Classe _mage) {
        mage = _mage;
    }

    public void SetVoleur(Classe _voleur) {
        voleur = _voleur;
    }
}