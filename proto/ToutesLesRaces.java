package proto;
/**
 * Arsenal Créé par David, base de donnée des races.
 */
public final class ToutesLesRaces {

    private static ToutesLesRaces instance;

    // constructeur privé.
    private ToutesLesRaces(){

    }

    public static ToutesLesRaces GetInstance(){
        if (instance == null) {
            instance = new ToutesLesRaces();
        }
        return instance;
    }

    Race humain = new Race("humain",
    "c'est un humain",
    new StatistiqueBonus(5),
    new StatistiqueBonus(5),
    new StatistiqueBonus(5),
    new StatistiqueBonus(5),
    new StatistiqueBonus(5));


    // Getters
/*
    public Arme getDague(){
        return dague;
    }

    // Setters

    public void setDague(Arme _dague){
        dague = _dague;
    }
*/
}
