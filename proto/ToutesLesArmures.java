package proto;

import proto.Stat.StatistiqueBonus;

/**
 * ToutesLesArmures crée par Seb
 */
public final class ToutesLesArmures {
    private static ToutesLesArmures instance;

    // Constructeur
    private ToutesLesArmures() {

    }

    public static ToutesLesArmures GetInstance() {
        if (instance == null) {
            instance = new ToutesLesArmures();
        }
        return instance;
    }

    Armure casque = new Armure("casque", "fortement conseillé si vous n'avez pas la tête dure !", "commun", 40,
            new StatistiqueBonus(0), new StatistiqueBonus(0), new StatistiqueBonus(0), new StatistiqueBonus(0),
            new StatistiqueBonus(0), "DEf", 1);

    Armure plastron = new Armure("plastron", "Efficace contre les coups portés à bout portant", "commun", 45,
            new StatistiqueBonus(0), new StatistiqueBonus(0), new StatistiqueBonus(0), new StatistiqueBonus(0),
            new StatistiqueBonus(0), "def", 2);

    Armure gants = new Armure("gants", "si vous avez trop froid en hiver sur le champ de bataille",
            "Les gants en cuir sont très recherchés.", 50, new StatistiqueBonus(0), new StatistiqueBonus(0),
            new StatistiqueBonus(0), new StatistiqueBonus(0), new StatistiqueBonus(0), "def", 2);

    Armure jambiere = new Armure("jambières", "Elles peuvent être utiles pour les chuttes.", "assez rare", 60,
            new StatistiqueBonus(0), new StatistiqueBonus(0), new StatistiqueBonus(0), new StatistiqueBonus(0),
            new StatistiqueBonus(0), "def", 4);

    Armure bottes = new Armure("bottes", "Elles ne sont pas confortables mais elles protègent bien.", "rare", 70,
            new StatistiqueBonus(0), new StatistiqueBonus(0), new StatistiqueBonus(0), new StatistiqueBonus(0),
            new StatistiqueBonus(0), "def", 5);

    // tableau de toutes les armures

    Armure[] tableauToutesLesArmures = { casque, plastron, gants, jambiere, bottes };

    // getters
    public Armure GetCasque() {
        return casque;
    }

    public Armure GetPlastron() {
        return plastron;

    }

    public Armure GetGants() {
        return gants;
    }

    public Armure GetJambiere() {
        return jambiere;
    }

    public Armure GetBottes() {
        return bottes;
    }

    public Armure[] GetTableauToutesLesArmures() {
        return tableauToutesLesArmures;
    }
    // setters

    public void SetCasque(Armure _casque) {
        casque = _casque;
    }

    public void SetPlastron(Armure _plastron) {
        plastron = _plastron;
    }

    public void SetGants(Armure _gants) {
        gants = _gants;
    }

    public void SetJambiere(Armure _jambiere) {
        jambiere = _jambiere;
    }

    public void SetBottes(Armure _bottes) {
        bottes = _bottes;
    }

}