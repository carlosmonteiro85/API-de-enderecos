package br.com.api.findAdress;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.com.api.findAdress.buscar_endereco_pelo_cep.model.Adress;
import br.com.api.findAdress.buscar_endereco_pelo_cep.service.FindAdressService;

public class AppTest {

	private static String DDD_VERIFY = "61";
	private static String CITY_VERIFY = "Brasília";
	private static String UF_VERIFY = "DF";
	private static String SIAFI_VERIFY = "9701";
	
	@Test
	public void findCity() {
		Adress adress = FindAdressService.getInstance().getAdressForCep("72231-422");
		assertTrue(adress.getDdd().equals(DDD_VERIFY));
		assertTrue(adress.getLocalidade().equals(CITY_VERIFY));
		assertTrue(adress.getUf().equals(UF_VERIFY));
		assertTrue(adress.getSiafi().equals(SIAFI_VERIFY));
	}

}
