package Exercio_Heranca;

public class NavioContainer extends Navio {
	
	private int quantidaGuindastes;
	private int quantidadeCamadas;
	
	public NavioContainer(int id, String nome, int quantidadePores, double capacidadeCarga, int quantidaGuindastes,
			int quantidadeCamadas) 
	{
		super(id, nome, quantidadePores, capacidadeCarga);
		this.quantidaGuindastes = quantidaGuindastes;
		this.quantidadeCamadas = quantidadeCamadas;
	}

	public int getQuantidaGuindastes() {
		return quantidaGuindastes;
	}

	public void setQuantidaGuindastes(int quantidaGuindastes) {
		this.quantidaGuindastes = quantidaGuindastes;
	}

	public int getQuantidadeCamadas() {
		return quantidadeCamadas;
	}

	public void setQuantidadeCamadas(int quantidadeCamadas) {
		this.quantidadeCamadas = quantidadeCamadas;
	}
	
	

}
