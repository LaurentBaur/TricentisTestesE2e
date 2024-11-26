package pages;

import elementos.Elementos;
import metodos.Metodos;

public class PagesPriceOption {

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();

	
	public void clicarDadosPriceOptiond() {
		
		metodos.forcarClick(el.selectOptionUltimate);
		metodos.aguardarElemento(el.btnNextPriceOption);
		metodos.clicar(el.btnNextPriceOption);
		
		
	}
	
}