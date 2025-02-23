 class AccesInterditException extends Exception{}
public class CompteCourantSecurise <T> extends CompteCourant<T> implements Securisable {
    private String identifiant;

    public CompteCourantSecurise(int numeroCompte, double solde, T devise, double limite, String identifiant) {
        super(numeroCompte, solde, devise, limite);
        this.identifiant = identifiant;
    }
    public boolean VerifierIdentite(String identifiant) {
        return this.identifiant.equals(identifiant);
    }
    public void verifException()throws AccesInterditException{
        try {
            if (!VerifierIdentite(identifiant))
            throw new AccesInterditException();
        } catch (Exception e) {
            System.out.println("barra rassam");
        }
    }
}
