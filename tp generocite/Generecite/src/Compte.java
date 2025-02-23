public class Compte <T> {
    protected int  numeroCompte;
    protected double solde;
    protected T devise;
    public Compte(int numeroCompte, double solde, T devise) {
        this.numeroCompte = numeroCompte;
        this.solde = solde;
        this.devise = devise;
    }
public void deposer(double montant){
    solde+=montant;

}
public void retirer(double montant){
    solde-=montant;
    
}
public void afficherSolde(){
    System.out.println(solde);
}
public static <T> void transfert (double montant,Compte e1,Compte e2){
    e1.solde-=montant;
    e2.solde+=montant;
}    


}
