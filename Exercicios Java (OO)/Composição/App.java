package Exercicio;

public class App {

	public static void main(String[] args) {
		
			Revista revista = new Revista(1,"Veja");
			
			revista.adicionarEdicao(52, 1000, 800);
			revista.adicionarEdicao(53, 900, 900);
			revista.adicionarEdicao(54, 1200, 1000);
			
			System.out.print(revista.reciclarEdicao(53));
			exibirDados(revista,0);
			System.out.print(revista.reciclarEdicao(54));
			exibirDados(revista,1);
			System.out.print(revista.reciclarEdicao(54));
			exibirDados(revista,2);
			System.out.print(revista.reciclarEdicao(99));
			
	}
	
	public static void exibirDados(Revista revista , int numero) 
	{
		System.out.printf("\n Reciclagem Produzida: %d \n ",revista.getReciclagemProduzida());
		System.out.printf(" Status Reciclou: %s \n",revista.getEdicoes().get(numero).getReciclou());
		System.out.println();
	}

}
