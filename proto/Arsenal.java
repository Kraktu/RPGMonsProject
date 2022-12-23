package proto;
/**
 * Arsenal Créé par David, base de donnée des armes.
 */
public final class Arsenal {

    private static Arsenal instance;

    // constructeur privé.
    private Arsenal(){

    }

    public static Arsenal GetInstance(){
        if (instance == null) {
            instance = new Arsenal();
        }
        return instance;
    }



    // Corps à corps.

    Arme dague = new Arme("dague",
    "c'est petit mais ca pique",
    "commun",
    50,
    new Force(0),
    new Intelligence(0),
    new Agilite(0),
    new Dexterite(0),
    new Constitution(0),
    "DEX",
    1,
    3);

    Arme epee = new Arme("epee",
    "ca coupe",
    "commun",
    100,
    new Force(1),
    new Intelligence(0),
    new Agilite(0),
    new Dexterite(0),
    new Constitution(0),
    "FOR",
    2,
    4);

    Arme hache = new Arme("hache",
    "fait mal",
    "commun",
    120,
    new Force(2),
    new Intelligence(0),
    new Agilite(0),
    new Dexterite(0),
    new Constitution(0),
    "FOR",
    2,
    5);

    Arme lance = new Arme("lance",
    "c'est long et ca pique",
    "commun",
    80,
    new Force(0),
    new Intelligence(0),
    new Agilite(0),
    new Dexterite(0),
    new Constitution(0),
    "FOR",
    2,
    3);

    Arme masse = new Arme("masse",
    "c'est lourd",
    "commun",
    100,
    new Force(3),
    new Intelligence(0),
    new Agilite(0),
    new Dexterite(0),
    new Constitution(0),
    "FOR",
    3,
    5);

    // Combat à distance.

    Arme arc = new Arme("arc",
    "ca va loin",
    "commun",
    70,
    new Force(1),
    new Intelligence(0),
    new Agilite(0),
    new Dexterite(0),
    new Constitution(0),
    "DEX",
    2,
    4);

    Arme arbalete  = new Arme("arbalète ",
    "ca va pas si loin",
    "commun",
    80,
    new Force(2),
    new Intelligence(0),
    new Agilite(0),
    new Dexterite(0),
    new Constitution(0),
    "DEX",
    3,
    5);



    // Armure.
    



    // Getters

    public Arme getDague(){
        return dague;
    }

    // Setters

    public void setDague(Arme _dague){
        dague = _dague;
    }

}
