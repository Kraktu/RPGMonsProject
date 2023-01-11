package proto.Race;

import proto.Stat.StatistiqueBonus;

/**
 * ToutesLesRaces Créé par David, base de donnée des races.
 */

// Humain, Elfe, Nain, Troll, Gobelin
// Force, Intelligence, Agilité, Dextérité, Constitution

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

        private Race humain = new Race("humain",
                        "Un humain est un personnage classique, sans traits physiques particuliers. Ils se battent autant avec des armes blanches qu'avec des armes à distance ou encore avec la magie.",
                        new StatistiqueBonus(0),
                        new StatistiqueBonus(0),
                        new StatistiqueBonus(0),
                        new StatistiqueBonus(0),
                        new StatistiqueBonus(0));

        private Race elfe = new Race("elfe",
                        "L'elfe est longiligne avec des oreilles pointues. ses principals atouts sont l'agilité et la furtivité. Il a une bonne capacité de visée qui permet une attaque à distance efficace.",
                        new StatistiqueBonus(-2),
                        new StatistiqueBonus(0),
                        new StatistiqueBonus(1),
                        new StatistiqueBonus(2),
                        new StatistiqueBonus(-1));

        private Race nain = new Race("Nain",
                        "Les nains sont de petite taille mais ils sont plus trapus que les gobelins. Leur atouts sont la force physique et leur intelligence. Ils combattent généralement à la hache ou au marteau.",
                        new StatistiqueBonus(2),
                        new StatistiqueBonus(1),
                        new StatistiqueBonus(-2),
                        new StatistiqueBonus(-1),
                        new StatistiqueBonus(0));

        private Race troll = new Race("Troll",
                        "Le troll est de très grande taille. Grâce à sa constitution robuste, il peut encaisser de fortes attaques. Il n'a pas besoin d'armes pour se battre car il possède aussi de grandes griffes.",
                        new StatistiqueBonus(1),
                        new StatistiqueBonus(-2),
                        new StatistiqueBonus(-1),
                        new StatistiqueBonus(-0),
                        new StatistiqueBonus(2));

        private Race gobelin = new Race("Gobelin",
                        "Les gobelins sont de petite taille, similaire à celle des nains mais plus maigres. Ils sont vicieux et se battent avec de petites armes comme le poignard.",
                        new StatistiqueBonus(-2),
                        new StatistiqueBonus(0),
                        new StatistiqueBonus(2),
                        new StatistiqueBonus(2),
                        new StatistiqueBonus(-2));
        // tableau de toutes les races
        Race[] tableauToutesLesRaces = { humain, elfe, nain, troll, gobelin };

        // Getters :

        public Race GetHumain() {
                return humain;
        }

        public Race GetElfe() {
                return elfe;
        }

        public Race GetNain() {
                return nain;
        }

        public Race GetTroll() {
                return troll;
        }

        public Race GetGobelin() {
                return gobelin;
        }

        // Setters :

        public static void setInstance(proto.Race.ToutesLesRaces _instance) {
                ToutesLesRaces.instance = _instance;
        }

        public void SetHumain(Race _humain) {
                humain = _humain;
        }

        public void SetElfe(Race _elfe) {
                elfe = _elfe;
        }

        public void SetNain(Race _nain) {
                nain = _nain;
        }

        public void SetTroll(Race _troll) {
                troll = _troll;
        }

        public void SetGobelin(Race _gobelin) {
                gobelin = _gobelin;
        }
}