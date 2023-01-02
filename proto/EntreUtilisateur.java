package proto;
/**
 * EntreUtilisateur, Créer par Seb.
 */
import java.util.Scanner;

public class EntreUtilisateur {

    public String EntreeUtilisateur(String _question) {

        Scanner entree = new Scanner(System.in);

        System.out.println(_question);

        String reponse = entree.nextLine();
        
        entree.close();

        return reponse;
    }

public int ChoixClasse () {
        int choix=EntreeUtilisateur("Choisissez votre classe [tapez 1" pour guerrier, \n2" pour mage, \n3" pour voleur, \n4" pour archer")) {
switch (choix) {
    case "1" :
        System.out.println("Vous avez choisi guerrier.");
        break;
    case "2" :
        System.out.println("Vous avez choisi mage.");
        break;
    case "3" :
        System.out.println("Vous avez choisi voleur.");
        break;
    case "4" :
        System.out.println("Vous avez choisi archer.");
        break;
    default:
        System.out.println("Erreur, veuillez choisir un nombre compris entre 1 et 4.");
        ChoixClasse();
        break;
}
return choix;


}
}
