package tricentis.steps;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PagesInsurance;
import pages.PagesPriceOption;
import pages.PagesProductData;
import pages.PagesSentQuote;
import pages.PagesVehicleData;
import runner.Executa;

public class Testes {
	
	PagesVehicleData pvd = new PagesVehicleData();
	PagesInsurance pi = new PagesInsurance();
	PagesProductData ppd = new PagesProductData();
	PagesPriceOption ppo = new PagesPriceOption();
	PagesSentQuote psq = new PagesSentQuote();

	
	//@After
	public void depoisDoTest() {
		Executa.finalizarTeste();
	}

	@Given("que esteja na tela principal do site {string}")
	public void queEstejaNaTelaPrincipalDoSite(String url) {
	  Executa.iniciarTeste(url);  
	}
	@When("clicar no menu automobile")
	public void clicarNoMenuAutomobile() {
	 pvd.clicarAutomobile();
	}
	@When("preencher todos os campos obrigatorios do formulario Enter Vehicle Data clicar em next para avancar")
	public void preencherTodosOsCamposObrigatoriosDoFormularioEnterVehicleDataClicarEmNextParaAvancar() {
	 pvd.preencherDadosDoVehicule("Audi", "250", "07/15/2024", "5", "Petrol", "25555", "ADE1972GER", "250");
	}
	@When("preencher todos os campos obrigatorios do formulario Insurance Data e clicar em Next para avancar")
	public void preencherTodosOsCamposObrigatoriosDoFormularioInsuranceDataEClicarEmNextParaAvancar() {
    pi.preencherDadosPessoais("Laurent", "Baur", "06/07/1972", "Male", "Hauptstr.189", "Germany", "59513", "Adenau", "Employee", "Other", "https://sampleapp.tricentis.com/101/app.php");
	}
	
	@When("preencher todos os campos obrigatorios do formulario Product Data e clicar em Next para avancar")
	public void preencherTodosOsCamposObrigatoriosDoFormularioProductDataEClicarEmNextParaAvancar() {
	ppd.preencherDadosProduto("01/01/2025", "3.000.000,00", "Bonus 9", "Full Coverage", "Euro Protection", "No");
	}

	@When("preencher todos os campos obrigatorios na tela Price Option e clicar em Next para avancar")
	public void preencherTodosOsCamposObrigatoriosNaTelaPriceOptionEClicarEmNextParaAvancar() {
	  ppo.clicarDadosPriceOptiond();
	}
	@When("preencher os campos obrigatorios na tela Send Quote e clicar em Send para enviar a cotacao")
	public void preencherOsCamposObrigatoriosNaTelaSendQuoteEClicarEmSendParaEnviarACotacao() {
	    psq.preencherDadosSentQuote("baurdhainaut@gmail.com", "5511976883639", "Laurent", "Adenau72", "Adenau72");
	}
	@Then("deve aparecer uma mensagem de confirmacao dizendo que o email foi enviado com sucesso e clicar no botao OK")
	public void deveAparecerUmaMensagemDeConfirmacaoDizendoQueOEmailFoiEnviadoComSucessoEclicarNoBotaoOk() {
		psq.aguardarValidacaoMensagem("Sending e-mail success!");
	}
	
}
