
import java.util.HashMap;

public class Banque {
    private HashMap<Integer, Compte<?>> comptes;


    public Banque() {
        comptes = new HashMap<>();
    }

    
    public void ajouterCompte(Compte<?> compte) {
        comptes.put(compte.numeroCompte, compte);
    }

    
    public Compte<?> getCompte(int numeroCompte) {
        return comptes.get(numeroCompte);
    }


    public void supprimerCompte(int numeroCompte) {
        comptes.remove(numeroCompte);
    }

    
    public void afficherTousLesComptes() {
        for (Compte<?> compte : comptes.values()) {
            compte.afficherSolde();
        }
    }
}
