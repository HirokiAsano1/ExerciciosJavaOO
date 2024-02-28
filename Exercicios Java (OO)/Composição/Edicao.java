package Exercicio;

import java.util.Date;

public class Edicao {

	private int numero;
	private Date data;
	private int tiragem;
	private int qtdeVendida;
	private boolean reciclou;

	public Edicao(int numero, int tiragem, int qtdeVendida) {

		this.numero = numero;
		this.data = new Date();
		this.tiragem = tiragem;
		this.qtdeVendida = qtdeVendida;
		this.reciclou = false;
	}

	public int getTiragem() {
		return tiragem;
	}

	public void setTiragem(int tiragem) {
		this.tiragem = tiragem;
	}

	public int getQtdeVendida() {
		return qtdeVendida;
	}

	public void setQtdeVendida(int qtdeVendida) {
		this.qtdeVendida = qtdeVendida;
	}

	public int getNumero() {
		return numero;
	}

	public Date getData() {
		return data;
	}

	public boolean getReciclou() {
		return reciclou;
	}

	public void reciclarExemplares() {
		this.reciclou = true;
	}

	public int obterQntdeReciclagem() {
		return this.tiragem - this.qtdeVendida;
	}

}