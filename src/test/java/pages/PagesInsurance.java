package pages;

import elementos.Elementos;
import metodos.Metodos;

public class PagesInsurance {

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();


	
	public void preencherDadosPessoais(String firstName, String lastName, String dateOfBirth, String gender,
			String streetAddress, String country, String zipCode, String city, String occupation, 
			String hobbies, String website) {
		metodos.preencher(el.firstName, firstName);
		metodos.preencher(el.lastName, lastName);
		metodos.preencher(el.dateOfBirth, dateOfBirth );
		// Selecionando gênero
				if (gender.equalsIgnoreCase("Male")) {
					metodos.clicar(el.genderMale);
				} else {
					metodos.clicar(el.genderFemale);
				}
		metodos.preencher(el.streetAddress, streetAddress);
		metodos.preencher(el.country, country);
		metodos.preencher(el.zipCode, zipCode);
		metodos.preencher(el.city, city);
		metodos.preencher(el.occupation, occupation);
		// Selecionando hobbies usando if-else com espera explícita para todos os elmentos
				if (hobbies.equalsIgnoreCase("speeding")) {
					metodos.aguardarElemento(el.speeding); 
					metodos.clicar(el.speeding);
				} else if (hobbies.equalsIgnoreCase("bungeejumping")) {
					metodos.aguardarElemento(el.bungeejumping); 
					metodos.clicar(el.bungeejumping);
				} else if (hobbies.equalsIgnoreCase("cliffdiving")) {
					metodos.aguardarElemento(el.cliffdiving); 
					metodos.clicar(el.cliffdiving);
				} else if (hobbies.equalsIgnoreCase("skydiving")) {
					metodos.aguardarElemento(el.skydiving); 
					metodos.clicar(el.skydiving);
				} else {
					metodos.aguardarElemento(el.other); 
					metodos.clicar(el.other);

				}
		metodos.preencher(el.website, website);
		metodos.clicar(el.btnNextInsuranceData);
		
	}

}
