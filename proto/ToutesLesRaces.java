package proto;

/**
 * Arsenal Créé par David, base de donnée des races.
 */
public final class ToutesLesRaces {

        private static ToutesLesRaces instance;

        // constructeur privé.
        private ToutesLesRaces() {

        }

        public static ToutesLesRaces GetInstance() {
                if (instance == null) {
                        instance = new ToutesLesRaces();
                }
                return instance;
        }

        Race humain = new Race("humain",
                        "Un humain est un personnage classique, sans traits physiques particuliers. Ils se battent autant avec des armes blanches qu'avec des armes à distance ou encore avec la magie.",
                        new StatistiqueBonus(5),
                        new StatistiqueBonus(5),
                        new StatistiqueBonus(5),
                        new StatistiqueBonus(5),
                        new StatistiqueBonus(5));

        Race nain = new Race("Nain",
                        "Les nains sont de petite taille mais ils sont plus trapus que les gobelins. Leur atouts sont la force physique et leur intelligence. Ils combattent généralement à la hache ou au marteau.",
                        new StatistiqueBonus(5),
                        new StatistiqueBonus(5),
                        new StatistiqueBonus(5),
                        new StatistiqueBonus(5),
                        new StatistiqueBonus(5));

        Race troll = new Race("Troll",
                        "Le troll est de très grande taille. Grâce à sa constitution robuste, il peut encaisser de fortes attaques. Il n'a pas besoin d'armes pour se batre car il possède aussi de grandes griffes.",
                        new StatistiqueBonus(5),
                        new StatistiqueBonus(5),
                        new StatistiqueBonus(5),
                        new StatistiqueBonus(5),
                        new StatistiqueBonus(5));

        Race gobelin = new Race("Gobelin",
                        "Les gobelins sont de petite taille, similaire à celle des nains mais plus maigres. Ils sont vicieux et sebattent avec de petites armes comme le poignard.",
                        new StatistiqueBonus(5),
                        new StatistiqueBonus(5),
                        new StatistiqueBonus(5),
                        new StatistiqueBonus(5),
                        new StatistiqueBonus(5));

        Race elfe = new Race("elfe",
                        "L'elfe est longiligne avec des oreilles pointues. ses principals atous sont l'agilité et la furtivité. Il a une bonne capacité de visée qui permet une attaque à distance efficace.",
                        new StatistiqueBonus(5),
                        new StatistiqueBonus(5),
                        new StatistiqueBonus(5),
                        new StatistiqueBonus(5),
                        new StatistiqueBonus(5));

        // Getters
        /*
         * public Arme getDague(){
         * return dague;
         * }
         * 
         * // Setters
         * 
         * public void setDague(Arme _dague){
         * dague = _dague;
         * }
         */
}
