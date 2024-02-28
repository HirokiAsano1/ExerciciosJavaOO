package Atvfor;

public class Elevador {

	private int codigo;
	private String status;
	private int limitePessoas;
	private int pessoasTransportadas;

	
	
	public Elevador(int codigoElevador, int pessoasTransportadas, int limitePessoas, String status) {
		this.codigo = codigoElevador;
		this.pessoasTransportadas = pessoasTransportadas;
		this.limitePessoas = limitePessoas;
		this.status = status;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) 
	{
		this.status = status;
	}

	public int getLimitePessoas() {
		return limitePessoas;
	}

	public void setLimitePessoas(int limitePessoas) {
		this.limitePessoas = limitePessoas;
	}

	public int getPessoasTransportadas() {
		return pessoasTransportadas;
	}

	public void setPessoasTransportadas(int pessoasTransportadas) {
		this.pessoasTransportadas = pessoasTransportadas;
	}





	public void registrarEntrada(int qtdeEntrada) {
		this.pessoasTransportadas += qtdeEntrada;
		if (this.pessoasTransportadas > this.limitePessoas) {
			this.status = "Bloqueado";
		}
	}

	void registrarSaida(int qtdeSaida) {
		this.pessoasTransportadas -= qtdeSaida;
		if (this.pessoasTransportadas <= this.limitePessoas) {
			this.status = "Em operação";
		}
	}

}
