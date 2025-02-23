public class CompteEpargne<T> extends Compte<T> {
    protected double taux;

    public CompteEpargne(int numeroCompte, double solde, T devise, double taux) {
        super(numeroCompte, solde, devise);
        this.taux = taux;
    }
    public void CalculerInteret(){
        solde=solde+solde*taux;
    }
    public void afficheSolde(){
        System.out.println("CompteEpargne - Solde:"+solde+" "+devise);
    }
    

}
