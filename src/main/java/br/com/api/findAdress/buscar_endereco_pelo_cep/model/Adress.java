package br.com.api.findAdress.buscar_endereco_pelo_cep.model;

public class Adress {

	private String cep;
	private String logradouro;
	private String numero;
	private String complemento;
	private String bairro;
	private String localidade;
	private String uf;
	private String ibge;
	private String gia;
	private String ddd;
	private String siafi;

	public Adress(String numeroCEP, String logradouro, String bairro, String localidade, String uf, String ibge,
			String gia, String ddd, String siafi) {
		this.cep = numeroCEP;
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.localidade = localidade;
		this.uf = uf;
		this.ibge = ibge;
		this.gia = gia;
		this.ddd = ddd;
		this.siafi = siafi;

	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getIbge() {
		return ibge;
	}

	public void setIbge(String ibge) {
		this.ibge = ibge;
	}

	public String getGia() {
		return gia;
	}

	public void setGia(String gia) {
		this.gia = gia;
	}

	public String getDdd() {
		return ddd;
	}
	
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	
	public String getSiafi() {
		return siafi;
	}
	
	public void setSiafi(String siafi) {
		this.siafi = siafi;
	}

	@Override
	public String toString() {
		return "Endereço : cep = " + cep + ", \nLogradouro = " + logradouro + ", \nNúmero = " + numero + ", \nComplemento = "
				+ complemento + ", \nBairro = " + bairro + ", \nLocalidade = " + localidade + ", \nUF = " + uf + ", \nIBGE = " + ibge
				+ ", \nGIA = " + gia + ", \nDDD = " + ddd + ", \nSIAFI = " + siafi + " ";
	}
	
	
}
