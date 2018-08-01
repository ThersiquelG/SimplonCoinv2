package myPackage;
//création d'une première sous classe

public class CompteCourant extends Comptes {
	
	
	//création de la method de virement avec comme argument une variable de type ComptePEL et une variable de type double "montant"
public void virement(ComptePEL receveur, double montant) {
	
	//Variable "solde" héritée de la classe "Comptes" ainsi que la method getSolde()
	solde = getSolde() - montant ; 
	
	receveur.solde = receveur.getSolde() + montant ;
	
}
	
	
}

