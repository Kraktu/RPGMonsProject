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

    private Classe archer = new Classe("Archer",
            "Comme le dit son nom, l'archer utilise un arc. Il peut également utiliser une arbalète. Il a une vision très puissante pour viser de petites cibles. Sa force réside dans son agilité, mais sa constitution est plus faible.",
            new StatistiqueBonus(-2),
            new StatistiqueBonus(0),
            new StatistiqueBonus(3),
            new StatistiqueBonus(2),
            new StatistiqueBonus(1),
            new Sort(null, null, 0, 0, 0, 0, false));

    private Classe guerrier = new Classe("Guerrier",
            "Le guerrier est fort dans les attaques de mêlées. Il utilise le plus souvent une épée. Ses atouts sont principalement sa force pour soulever des armes lourdes et sa constitution pour encaisser les coups et porter de l'équipement.",
            new StatistiqueBonus(2),
            new StatistiqueBonus(0),
            new StatistiqueBonus(-2),
            new StatistiqueBonus(1),
            new StatistiqueBonus(3),
            new Sort(null, null, 0, 0, 0, 0, false));

    private Classe mage = new Classe("Mage",
            "Le mage utilise principalement la magie. Il peut néanmoins utiliser une dague ou un poignard si le mana est épuisé. Il lance ses sorts le plus souvent à distance, c'est pourquoi il aura de l'intelligence mais peu de force.",
            new StatistiqueBonus(-2),
            new StatistiqueBonus(3),
            new StatistiqueBonus(0),
            new StatistiqueBonus(1),
            new StatistiqueBonus(2),
            new Sort(null, null, 0, 0, 0, 0, false));

    private Classe voleur = new Classe("Voleur",
            "Le voleur est souvent utilisé pour sa furetivité. Il peut s'approcher très près de l'ennemi mais restera toujours dans l'ombre pour être le moins visible possible. Son arme de prédilection est le poignard mais il peut aussi utiliser une dague. Ils sont aussi doués pour détecter et désamorcer les pièges, sauf les pièges magiques, ils ont peur de finir en tas de cendres.",
            new StatistiqueBonus(-2),
            new StatistiqueBonus(1),
            new StatistiqueBonus(2),
            new StatistiqueBonus(3),
            new StatistiqueBonus(0),
            new Sort(null, null, 0, 0, 0, 0, false));

    // tableau de toutes les classes
    Classe[] tableauToutesLesClasses = { archer, guerrier, mage, voleur };

    // Getters :

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