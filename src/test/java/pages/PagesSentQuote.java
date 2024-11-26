package pages;

import elementos.Elementos;
import metodos.Metodos;

public class PagesSentQuote {

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();

	public void clicarAutomobile() {
		metodos.clicar(el.automobile);
}
	
	public void preencherDadosSentQuote(String email, String phone, String username, String password, 
			String confirmPassword) {
		metodos.preencher(el.email,email);
		metodos.preencher(el.phone,phone);
		metodos.preencher(el.username,username);
		metodos.preencher(el.password,password);
		metodos.preencher(el.confirmPassword,confirmPassword);
		metodos.clicar(el.btnSendQuote);
	}
		
	public void aguardarValidacaoMensagem(String mensagemConfirmacao)	{
		metodos.aguardarElemento(el.mensagemConfirmacao);
		metodos.validarTexto(el.mensagemConfirmacao, mensagemConfirmacao);
		metodos.clicar(el.btnOkSentQuote);
	}
	
		
	
}