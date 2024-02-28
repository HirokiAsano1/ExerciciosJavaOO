package Exercio_Heranca;

public class navioGraneleiro extends Navio {
	
	private int quantidadeEscotilhas;

	public navioGraneleiro(int id, String nome, int quantidadePores, double capacidadeCarga, int quantidadeEscotilhas) {
		super(id, nome, quantidadePores, capacidadeCarga);
		
		this.quantidadeEscotilhas = quantidadeEscotilhas;
	}

	public int getQuantidadeEscotilhas() {
		return quantidadeEscotilhas;
	}

	public void setQuantidadeEscotilhas(int quantidadeEscotilhas) {
		this.quantidadeEscotilhas = quantidadeEscotilhas;
	}
	
	
}
