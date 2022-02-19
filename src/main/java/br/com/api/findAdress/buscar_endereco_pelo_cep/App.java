package br.com.api.findAdress.buscar_endereco_pelo_cep;

import br.com.api.findAdress.buscar_endereco_pelo_cep.model.Adress;
import br.com.api.findAdress.buscar_endereco_pelo_cep.service.FindAdressService;

public class App {

  public static void main(String[] args) {
	  
	  Adress adress = FindAdressService.getInstance().getAdressForCep("72231-804");
	  adress.setComplemento("< Adicionar o Complemento >");
	  adress.setNumero("< Numero do endereço >");
	  System.out.println(adress.toString());
  }

}
