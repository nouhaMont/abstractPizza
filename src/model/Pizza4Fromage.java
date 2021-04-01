package model;

public class Pizza4Fromage extends PizzaTemplate{

	@Override
	void ajouterFromage() {
		System.out.println("j'ajoute le fromage :Mozzarella + Emmental+ Mimolette+ Goda !");
		
	}

	@Override
	void mettreIngredients() {
		System.out.println("j'ajoute l'olive ");
		
	}

}
