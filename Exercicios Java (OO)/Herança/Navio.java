package Exercio_Heranca;

public abstract class Navio {
	
	private int id;
	private String nome;
	private int quantidadePores;
	private double capacidadeCarga;
	private String disponibilidade;
	
	public Navio(int id, String nome, int quantidadePores, double capacidadeCarga) {
		super();
		this.id = id;
		this.nome = nome;
		this.quantidadePores = quantidadePores;
		this.capacidadeCarga = capacidadeCarga;
		this.disponibilidade = "Vazio";
	}
	
	
	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getQuantidadePores() {
		return quantidadePores;
	}



	public void setQuantidadePores(int quantidadePores) {
		this.quantidadePores = quantidadePores;
	}



	public double getCapacidadeCarga() {
		return capacidadeCarga;
	}



	public void setCapacidadeCarga(double capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}



	public String getDisponibilidade() {
		return disponibilidade;
	}


	public void inciarCarregamento() 
	{
		this.disponibilidade = "Carregando";
	}
	
	public void bloqueiaCarregamento() 
	{
		this.disponibilidade = "Lotado";
	}
	
	
}
