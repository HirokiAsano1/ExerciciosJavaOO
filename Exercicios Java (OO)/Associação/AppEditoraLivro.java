public class AppEditoraLivros {

	public static void main(String[] args) {
		
		Editora editora1 = new Editora(2,"Saraiva","Saraiva@gmail.com","81-982318");
		Editora editora2 = new Editora(3,"Cultura","Cultura@gmail.com","81-999123");
		
		Livro livroed1 = new Livro(1,"Aventureiros","123",editora1);
		Livro livro1ed1 = new Livro(2,"Lilis","1223",editora1);
		Livro livro2ed1 = new Livro(3,"KAJOS","728",editora1);
		
		Livro livroed2 = new Livro(4,"Ikos","999",editora2);
		Livro livro1ed2 = new Livro(5,"joao 2","932",editora2);
		Livro livro2ed2 = new Livro(6,"los","992",editora2);
		
		System.out.printf("\n Titulo do Livro: %s \n IBSN: %s \n Razão Social da editora: %s\n",

				livroed1.getTitulo(),
				livroed1.getISBN(),
				livroed1.getEditora().getRazaoSocial());
		
		System.out.printf("\n Titulo do Livro: %s \n IBSN: %s \n Razão Social da editora: %s\n",

				livro1ed1.getTitulo(),
				livro1ed1.getISBN(),
				livro1ed1.getEditora().getRazaoSocial());
		
		System.out.printf("\n Titulo do Livro: %s \n IBSN: %s \n Razão Social da editora: %s \n",

				livro2ed1.getTitulo(),
				livro2ed1.getISBN(),
				livro2ed1.getEditora().getRazaoSocial());
		
		System.out.printf("\n Titulo do Livro: %s \n IBSN: %s \n Razão Social da editora: %s\n",

				livroed2.getTitulo(),
				livroed2.getISBN(),
				livroed2.getEditora().getRazaoSocial());
		
		System.out.printf("\n Titulo do Livro: %s \n IBSN: %s \n Razão Social da editora: %s\n",

				livro1ed2.getTitulo(),
				livro1ed2.getISBN(),
				livro1ed2.getEditora().getRazaoSocial());
		
		System.out.printf("\n Titulo do Livro: %s \n IBSN: %s \n Razão Social da editora: %s\n",

				livro2ed2.getTitulo(),
				livro2ed2.getISBN(),
				livro2ed2.getEditora().getRazaoSocial());
		
		
	}

}