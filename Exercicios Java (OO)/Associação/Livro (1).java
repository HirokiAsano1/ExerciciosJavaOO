public class Livro {

	private int codigo;
	private String titulo;
	private String ISBN;
	private Editora editora;
	
	
	public Livro(int codigo , String titulo ,String ISBN , Editora editora ) 
	{
		this.codigo = codigo;
		this.titulo = titulo;
		this.ISBN = ISBN;
		this.editora = editora;
	}

	public Editora getEditora() 
	{
		return this.editora;
	}
	
	public void SetEditora(Editora editora) 
	{
		this.editora = editora;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String ISBN) {
		ISBN = ISBN;
	}

}