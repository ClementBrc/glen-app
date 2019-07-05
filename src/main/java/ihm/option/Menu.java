package ihm.option;

import java.util.HashMap;
import java.util.Map;

import ihm.option.CreerChocolatineOption;
import ihm.option.ListerChocolatineOption;
import ihm.option.OptionMenu;
import ihm.option.Sortir;
import ihm.util.IhmUtil;

import java.util.Scanner;

public class Menu {

	private Map<Integer, OptionMenu> options = new HashMap<>();

	private Scanner scanner = IhmUtil.scanner;

	public Menu() {
		init();
	}

	private void init() {
		options.put(1, new ListerChocolatineOption());
		options.put(2, new CreerChocolatineOption());
		options.put(3, new CreerCommandeOption());
		options.put(99, new Sortir());
	}

	public void demarrer() {

		boolean sortir = false;

		while (!sortir) {

			afficherMenu();

			int saisie = this.scanner.nextInt();

			OptionMenu optionChoisie = options.get(saisie);

			optionChoisie.executer();

			sortir = optionChoisie.isSortir();

		}

	}

	private void afficherMenu() {
		options.forEach((numero, option) -> {

			System.out.println(numero + ". " + option.getLibelle());

		});
	}

}
