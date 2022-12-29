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

}
