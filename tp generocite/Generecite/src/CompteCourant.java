public class CompteCourant<T> extends Compte<T> {
    protected double limite;

    public CompteCourant(int numeroCompte, double solde, T devise, double limite) {
        super(numeroCompte, solde, devise);
        this.limite = limite;
    }
    
public void retirer(double montant){
    if(limite>limite){
        solde-= montant;
    }
    else{
        System.out.println("votre montant est inferieur a la limite");
    }
}
public void afficheSolde(){
    System.out.println("CompteCourant - Solde:"+solde+" "+devise);
}

}
