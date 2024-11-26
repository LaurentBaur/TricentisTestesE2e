package pages;

import elementos.Elementos;
import metodos.Metodos;

public class PagesProductData {

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();

	public void clicarAutomobile() {
		metodos.clicar(el.automobile);

	}

	public void preencherDadosProduto(String startDate, String insuranceSum, String meritRating,
			String damageInsurance, String optionalProducts, String courtesyCar) {
		metodos.preencher(el.startData, startDate);
		metodos.preencher(el.insuranceSum, insuranceSum);
		metodos.preencher(el.meritRating, meritRating);
		metodos.preencher(el.damageInsurance, damageInsurance);
		metodos.preencher(el.optionalProducts, optionalProducts);
		metodos.preencher(el.courtesyCar, courtesyCar);
		metodos.clicar(el.btnNextProductData);
	}

}
