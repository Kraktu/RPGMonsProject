package proto;

public class Arsenal {

    // Corps à corps.

    Arme dague = new Arme("dague",
    "c'est petit mais ca pique",
    "commun",
    50,
    new Force(0),
    null,
    null,
    null,
    new Constitution(0),
    "DEX",
    1,
    3);

    Arme epee = new Arme("epee",
    "ca coupe",
    "commun",
    100,
    new Force(1),
    null,
    null,
    null,
    new Constitution(0),
    "FOR",
    2,
    4);

    Arme hache = new Arme("hache",
    "fait mal",
    "commun",
    120,
    new Force(2),
    null,
    null,
    null,
    new Constitution(0),
    "FOR",
    2,
    5);

    Arme lance = new Arme("lance",
    "c'est long et ca pique",
    "commun",
    80,
    new Force(0),
    null,
    null,
    null,
    new Constitution(0),
    "FOR",
    2,
    3);

    Arme masse = new Arme("masse",
    "c'est lourd",
    "commun",
    100,
    new Force(3),
    null,
    null,
    null,
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
    null,
    null,
    null,
    new Constitution(0),
    "DEX",
    2,
    4);

    // Armure.
    
}
