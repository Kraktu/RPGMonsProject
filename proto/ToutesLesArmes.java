package proto;

import proto.Stat.StatistiqueBonus;

/**
 * Arsenal Créé par David, base de donnée des armes.
 */
public final class ToutesLesArmes {

    private static ToutesLesArmes instance;

    // constructeur privé.
    private ToutesLesArmes() {

    }

    public static ToutesLesArmes GetInstance() {
        if (instance == null) {
            instance = new ToutesLesArmes();
        }
        return instance;
    }

    // Corps à corps.

    Arme dague = new Arme("dague",
            "c'est petit mais ca pique",
            "commun",
            50,
            new StatistiqueBonus(0),
            new StatistiqueBonus(0),
            new StatistiqueBonus(0),
            new StatistiqueBonus(0),
            new StatistiqueBonus(0),
            "DEX",
            1,
            3);

    Equipement dague2 = new Equipement(
            "dague2",
            "c'est petit mais ca pique",
            "commun",
            50,
            new StatistiqueBonus(0),
            new StatistiqueBonus(0),
            new StatistiqueBonus(0),
            new StatistiqueBonus(0),
            new StatistiqueBonus(0));

    Arme epee = new Arme("epee",
            "ca coupe",
            "commun",
            100,
            new StatistiqueBonus(1),
            new StatistiqueBonus(0),
            new StatistiqueBonus(0),
            new StatistiqueBonus(0),
            new StatistiqueBonus(0),
            "FOR",
            2,
            4);

    Arme hache = new Arme("hache",
            "fait mal",
            "commun",
            120,
            new StatistiqueBonus(2),
            new StatistiqueBonus(0),
            new StatistiqueBonus(0),
            new StatistiqueBonus(0),
            new StatistiqueBonus(0),
            "FOR",
            2,
            5);

    Arme lance = new Arme("lance",
            "c'est long et ca pique",
            "commun",
            80,
            new StatistiqueBonus(0),
            new StatistiqueBonus(0),
            new StatistiqueBonus(0),
            new StatistiqueBonus(0),
            new StatistiqueBonus(0),
            "FOR",
            2,
            3);

    Arme masse = new Arme("masse",
            "c'est lourd",
            "commun",
            100,
            new StatistiqueBonus(3),
            new StatistiqueBonus(0),
            new StatistiqueBonus(0),
            new StatistiqueBonus(0),
            new StatistiqueBonus(0),
            "FOR",
            3,
            5);

    // Combat à distance.

    Arme arc = new Arme("arc",
            "ca va loin",
            "commun",
            70,
            new StatistiqueBonus(1),
            new StatistiqueBonus(0),
            new StatistiqueBonus(0),
            new StatistiqueBonus(0),
            new StatistiqueBonus(0),
            "DEX",
            2,
            4);

    Arme arbalete = new Arme("arbalète ",
            "ca va pas si loin",
            "commun",
            80,
            new StatistiqueBonus(2),
            new StatistiqueBonus(0),
            new StatistiqueBonus(0),
            new StatistiqueBonus(0),
            new StatistiqueBonus(0),
            "DEX",
            3,
            5);
    // tableau de toutes les armes

    Arme[] tableauToutesLesArmes = { dague, epee, hache, lance, masse, arc, arbalete };

    // Getters :

    public Arme GetDague() {
        return dague;
    }

    public Arme GetEpee() {
        return epee;
    }

    public Arme GetHache() {
        return hache;
    }

    public Arme GetLance() {
        return lance;
    }

    public Arme GetMasse() {
        return masse;
    }

    public Arme GetArc() {
        return arc;
    }

    public Arme GetArbalete() {
        return arbalete;
    }

    public Arme[] TableauToutesLesArmes() {
        return tableauToutesLesArmes;
    }
    // Setters :

    public void SetDague(Arme _dague) {
        dague = _dague;
    }

    public void SetEpee(Arme _epee) {
        epee = _epee;
    }

    public void SetHache(Arme _hache) {
        hache = _hache;
    }

    public void SetLance(Arme _lance) {
        lance = _lance;
    }

    public void SetMasse(Arme _masse) {
        masse = _masse;
    }

    public void SetArc(Arme _arc) {
        arc = _arc;
    }

    public void SetArbalete(Arme _arbalete) {
        arbalete = _arbalete;
    }
}