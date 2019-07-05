package ihm.option;

import java.util.List;

import service.Chocolatine;
import service.ChocolatineService;
import service.util.ServiceUtil;

public class ListerChocolatineOption implements OptionMenu {
	
	private ChocolatineService chocolatineService = ServiceUtil.chocolatineService;

	@Override
	public String getLibelle() {
		return "Lister Chocolatine";
	}

	@Override
	public void executer() {
		
		List<Chocolatine> lister = chocolatineService.lister();
		
	}

}
