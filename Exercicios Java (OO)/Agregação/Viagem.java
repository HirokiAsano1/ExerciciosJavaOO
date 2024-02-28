package triangle;
import java.util.Date;

public class Viagem {
	
	private int idViagem;
	private String destino;
	private Date dataInicial; 
	private Date dataFinal;
	private int kmPecorrido;
	private Veiculo veiculo;
	
	public Viagem(int idViagem, String destino, Date dataInicial, Date dataFinal) {
		
		this.idViagem = idViagem;
		this.destino = destino;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
		this.kmPecorrido = 0;

	}
	
	
	public String getDestino() {
		return destino;
	}


	public void setDestino(String destino) {
		this.destino = destino;
	}


	public int getIdViagem() {
		return idViagem;
	}


	public Date getDataInicial() {
		return dataInicial;
	}


	public Date getDataFinal() {
		return dataFinal;
	}


	public int getKmPecorrido() {
		return kmPecorrido;
	}


	public Veiculo getVeiculo() {
		return veiculo;
	}


	public boolean iniciarViagem(Veiculo veiculo) 
	{
		this.veiculo = veiculo;
		this.dataInicial = new Date();
		
		if(this.veiculo.getStatus() == 'V') 
		{
			return false;
		}
		else 
		{
			this.veiculo.registrarViagem();
			return true;
		}	
	}
	
	public void finalizarViagem(int kmOdometro) {
		this.kmPecorrido = calcularKmPercorrido(kmOdometro);
		this.veiculo.registrarRetorno(kmOdometro);
		this.dataFinal = new Date();
	}
	
	public int calcularKmPercorrido(int kmOdometro) 
	{
		
			return kmOdometro - this.veiculo.getKmOdometro();			
		

	}
}
