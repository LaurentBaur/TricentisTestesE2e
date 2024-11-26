package pages;

import elementos.Elementos;
import metodos.Metodos;

public class PagesVehicleData {

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();

	public void clicarAutomobile() {
		metodos.clicar(el.automobile);
	}

	public void preencherDadosDoVehicule(String vehicule, String enginePerformance, String dataOfManifacture,
			String numberOfSeats, String fuelType, String listPrice, String licensePlateNumber,
			String annualMileage) {
		metodos.preencher(el.make, vehicule);
		metodos.preencher(el.enginePerformance, enginePerformance);
		metodos.preencher(el.dataOfManifacture, dataOfManifacture);
		metodos.preencher(el.numberOfSeats, numberOfSeats);
		metodos.preencher(el.fuelType, fuelType);
		metodos.preencher(el.listPrice, listPrice);
		metodos.preencher(el.licensePlateNumber, licensePlateNumber);
		metodos.preencher(el.annualMileage, annualMileage);
		metodos.clicar(el.btnNextVehiculeData);
	}

}
