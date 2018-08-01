package myPackage;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//déclaration et initialisation d'une variable "montant"
		double montant = 50.00;
		
		//création d'une instance de CompteCourant "pierreAccount"
		CompteCourant pierreAccount = new CompteCourant();
		
		//initialisation des attributs de pierreAccount
		pierreAccount.setNom("Simplon");
		pierreAccount.setPrenom("Pierre");
		pierreAccount.setSolde(300.00);
		
		//création d'une instance de ComptePEL "aureliaAccount"
		ComptePEL aureliaAccount = new ComptePEL();
		//initialisation des attributs de "aureliaAccount"
		aureliaAccount.setNom("Simplon");
		aureliaAccount.setPrenom("Aurelia");
		aureliaAccount.setSolde(100.00);
		
		
		//mise en application des différents getters/setters
		System.out.println("Le compte au nom de : " + pierreAccount.getNom() + "  " + pierreAccount.getPrenom());
		System.out.println("**********");
		System.out.println("Possède actuellement : " + pierreAccount.getSolde() + " euros.");
		System.out.println("**********");
		
		
		System.out.println("--------------");
		System.out.println("--------------");
		
		System.out.println("Le compte PEL au nom de : " + aureliaAccount.getNom() + "  " + aureliaAccount.getPrenom());
		System.out.println("**********");
		System.out.println("Possède actuellement : " + aureliaAccount.getSolde() + " euros.");
		System.out.println("**********");
		
		
		System.out.println("--------------");
		System.out.println("--------------");
		
		
		
		//Appel de la method de "virement"
		pierreAccount.virement(aureliaAccount, montant);
		
		
		System.out.println("La transaction d'un montant de :" + montant + " a été envoyé depuis le compte de : " + pierreAccount.getPrenom());
		System.out.println("vers le compte de : " + aureliaAccount.getPrenom());
		
		System.out.println("Il reste :" + pierreAccount.getSolde() + " euros." + " sur le compte Pierre.");
		System.out.println("Le nouveau solde du compte d'aurelia est de : " + aureliaAccount.getSolde());
		
		
		
	
		
	}

}
