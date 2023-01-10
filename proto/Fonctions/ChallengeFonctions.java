package proto.Fonctions;

import proto.TousLesChallenges;

public class ChallengeFonctions {

    public void PrintDescriptionChallenge(){
        System.out.println(
        "voici le nom et la déscription d'un challenge :" +
        "\n" +
        "nom : " + TousLesChallenges.GetInstance().GetPontEnRuine().GetNom() +
        "\n" +
        "description : " + TousLesChallenges.GetInstance().GetPontEnRuine().GetDescription() +
        "\n" +
        "niveau : " + TousLesChallenges.GetInstance().GetPontEnRuine().GetNiveau()
        );

    }

}
