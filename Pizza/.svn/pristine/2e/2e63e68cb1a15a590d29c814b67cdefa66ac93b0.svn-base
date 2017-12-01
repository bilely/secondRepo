import java.util.ArrayList;

import business.Fromage;
import business.Legume;
import business.Pizza;
import business.Poisson;
import business.Viande;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Fromage gruyere = new Fromage();
		gruyere.setNom("Gruyere");
		gruyere.setType("cuit");
		
		Fromage mozza = new Fromage("Mozarella","frais");
		Fromage emmental = new Fromage("Emmental", "cuit");
		Fromage cheddar = new Fromage("Cheddar");

		
		Viande viandeHachee = new Viande();
		viandeHachee.setNom("Viande Hachée");
		viandeHachee.setAnimal("Boeuf");
		
		Object merguez = new Viande("Merguez");
		
		Viande poulet = new Viande("poulet","Poulet","Label Rouge");
		Poisson thon = new Poisson("thon", "océan pacifique");
		
		Legume tomate = new Legume();
		tomate.setNom("sauce tomate");
		
		Legume poivron = new Legume();
		poivron.setNom("poivron");
		poivron.setType("vert");
		
		Pizza pizza1 = new Pizza();
		pizza1.setNom("Pizza à la viande hachée");
		pizza1.setFromage(gruyere);
		pizza1.setLegume(tomate);
		pizza1.setProteine(viandeHachee);
		
		Pizza pizzaThon = new Pizza("Pizza au thon", emmental, tomate, thon);
		Pizza pizzaPoulet = new Pizza("Pizza au poulet", gruyere, tomate, poulet);
		ArrayList<Fromage> listFromage = new ArrayList<Fromage>();
		listFromage.add(emmental);
		listFromage.add(cheddar);
		listFromage.add(gruyere);
		listFromage.add(mozza);
		//Pizza pizza4fromage = new Pizza("Pizza 4 fromages", listFromage, tomate);
		
		
		
		ArrayList<Pizza> menu = new ArrayList<Pizza>();
		menu.add(pizza1);							// Pizza viande hachée
		menu.add(pizzaThon);
		menu.add(pizzaPoulet);
		
		ArrayList<Pizza> menujunior = new ArrayList<Pizza>();
		menujunior.add(pizzaThon);
		menujunior.add(pizzaPoulet);

		System.out.println("- " + pizza1);
		
		System.out.println("- " + menujunior);
	}

}
