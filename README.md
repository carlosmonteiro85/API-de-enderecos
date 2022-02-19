# Executando o projeto

Para  executar o projeto, é necessário executar o arquivo "App.java", como "Java application" e os testes unitários na execulção "AppTest.java".

## End-point usados:
* Utilizado a api do viacep que com o numero de recebe obtemos um json com o endereço
  link do via cep : http://viacep.com.br/ws/<CEP REQUERIDO>/json/

## Classe de serviço FindAdressService 

* Nome do Método: getAdressForCep
* Entrada no método: String cep
* Retorno do método: classe Adress

## Classe Model de recebimento

* Nome da classe: Adress

###Atributos da classe: 

#### Cep:
* Tipo: String

#### Logradouro :
* Tipo: String

#### Numero :
* Tipo: String
* obs: preenchido pelo usuário

#### Complemento :
* Tipo: String
* obs: preenchido pelo usuário

#### Bairro:
* Tipo: String

#### Localidade:
* Tipo: String

#### UF:
* Tipo: String

#### IBGE:
* Tipo: String

#### GIA:
* Tipo: String

#### DDD:
* Tipo: String

#### SIAFI:
* Tipo: String
