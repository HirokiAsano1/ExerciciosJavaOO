package Exercicio;

import java.util.List;
import java.util.ArrayList;
public class Revista {
				
	private int codigo;
	private String titulo;
	private int reciclagemProduzida;
	private List <Edicao>edicoes;
	
	public Revista(int codigo, String titulo) {
		
		this.codigo = codigo;
		this.titulo = titulo;
		this.reciclagemProduzida =0;
		this.edicoes = new ArrayList <Edicao>();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getCodigo() {
		return codigo;
	}

	public int getReciclagemProduzida() {
		return reciclagemProduzida;
	}

	public List<Edicao> getEdicoes() {
		return edicoes;
	}
	
	public void adicionarEdicao(int nr, int trg,int qv) 
	{
		edicoes.add(new Edicao(nr,trg,qv));
	}
	
	public void removerEdicao(Edicao edicao) 
	{
		edicoes.remove(edicao);
	}
	
	public String reciclarEdicao(int nr) 
	{
		for (Edicao edicao : edicoes) 
		{
			if(nr == edicao.getNumero()) 
			{
				 if(edicao.getTiragem()==edicao.getQtdeVendida()) 
				 {
					 return " Não houve exemplrares para reciclar";
				 }
				 
				 else if(edicao.getReciclou()) 
				 {
					 return "Edicão já reciclada";
				 }
				 
				 else 
				 {
					 this.reciclagemProduzida += edicao.obterQntdeReciclagem();
					 edicao.reciclarExemplares();
					 return "Reciclagem Realizada";
				 }
			}
			
			
		}
		
		return "Edicao não Encontrada";
	}
	
	
}