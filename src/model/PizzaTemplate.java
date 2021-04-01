package model;

public abstract class PizzaTemplate {
	
	
	
	abstract void ajouterFromage();
	abstract void mettreIngredients(); 
	
	
	public void makePizza() {
		System.out.println("---------------------------------------------------");
		preparerPate();
		ajouterSauce();
		ajouterFromage();
		mettreIngredients();
		mettreFour();
		System.out.println("Pizza is ready!");
		System.out.println("---------------------------------------------------");
		
	}

	private void mettreFour() {
		System.out.println("je mets le pizza au four !");
		
	}

	private void ajouterSauce() {
		System.out.println("j'ajoute la sauce tomate ! ");
		
	}

	private void preparerPate() {
		
		System.out.println("je prépare la pâte! ");
	}

	

}
