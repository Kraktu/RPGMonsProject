import java.util.Scanner;

public class EntreUtilisateur {
    public Scanner entre = new Scanner(System.in);

public String EntreUtilisateur(String _question) {
    System.out.println(_question);
    return entre.nextLine();    
    }

}
