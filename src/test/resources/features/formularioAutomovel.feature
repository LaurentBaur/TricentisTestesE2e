
@regressivo
Feature: Preencher formulario seguro automovel

  Como usuario do site Tricentis
  Quero preencher o formulario de seguro do automovel
  Para contratar o seguro
  
  Background: Acesso ao site
  Given que esteja na tela principal do site "https://sampleapp.tricentis.com/101/index.php"

  @positivo 
  Scenario: Preencher com sucesso o formulario de seguro automovel
     
    When clicar no menu automobile
    And preencher todos os campos obrigatorios do formulario Enter Vehicle Data clicar em next para avancar
    And preencher todos os campos obrigatorios do formulario Insurance Data e clicar em Next para avancar
    And preencher todos os campos obrigatorios do formulario Product Data e clicar em Next para avancar
    And preencher todos os campos obrigatorios na tela Price Option e clicar em Next para avancar
    And preencher os campos obrigatorios na tela Send Quote e clicar em Send para enviar a cotacao
    Then deve aparecer uma mensagem de confirmacao dizendo que o email foi enviado com sucesso e clicar no botao OK
    
    
  
  @negativo
  Scenario: Nao preencher os campos obrigatorios o formulario de seguro automovel
  
  	When clicar no menu automobile
  	And nao prencher os campos obrigatorios do formulario Enter Vehicle Data clicar em Next 
  	And nao preencher os campos obrigatorios do formulario Insurance Data e clicar em Next 
  	And nao preencher os campos obrigatorios do formulario Enter Product Data e clicar em Next
  	Then deve aparecer a mensagem 'Please, complete the first three steps to see the price table.'
  	
  	
  	