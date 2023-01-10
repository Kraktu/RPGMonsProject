package proto.Fonctions;

import proto.TousLesChallenges;

public class ChallengeFonctions {

    public void PrintDescriptionChallenge(){
        System.out.println("voici le nom et la déscription d'un challenge :");

        System.out.println(
            TousLesChallenges.GetInstance().GetPontEnRuine().GetNom() +
            "\n" +
            TousLesChallenges.GetInstance().GetPontEnRuine().GetDescription());
    }

}
