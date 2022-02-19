package br.com.api.findAdress.buscar_endereco_pelo_cep.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONObject;

import br.com.api.findAdress.buscar_endereco_pelo_cep.model.Adress;

public class FindAdressService {

	private static FindAdressService instance;

	/**
	 * inatanciando um objeto
	 */
	public static FindAdressService getInstance() {
		if (instance == null) {
			instance = new FindAdressService();
		}
		return instance;
	}

	/**
	 * Obtendo o endereço pelo cep
	 */
	public Adress getAdressForCep(String cep) {
		
		String cepFormat = cep.replace("-", "");
		
		String url = "http://viacep.com.br/ws/" + cepFormat + "/json/";
		JSONObject objReturnJson = null; 
		
		try {
			objReturnJson = new JSONObject(getHttpGET(url));			
		} catch (Exception e) {
			throw new IllegalStateException(String.format("Foi gerado o seguinte erro ao consultar o Endereço com CEP: "+ cep, e.getMessage()));
		}
		
		return new Adress(cep , objReturnJson.getString("logradouro"),
				objReturnJson.getString("bairro"), objReturnJson.getString("localidade"),
				objReturnJson.getString("uf"), objReturnJson.getString("ibge"), objReturnJson.getString("gia"),
				objReturnJson.getString("ddd"), objReturnJson.getString("siafi"));
	}

	private String getHttpGET(String urlToRead) {
		StringBuilder result = new StringBuilder();
		try {
			URL url = new URL(urlToRead);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
			String line;
			while ((line = rd.readLine()) != null) {
				result.append(line);
			}
		} catch (Exception ex) {
			throw new IllegalStateException(ex.getMessage(), ex);
		}

		return result.toString();

	}

}
