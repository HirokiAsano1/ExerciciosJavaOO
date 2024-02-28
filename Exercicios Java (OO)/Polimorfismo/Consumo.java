package Exercicio;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Consumo {
	private static int contadorId = 0;
	
	private int idConsumo;
	private Date Data;
	private char tipoConsumo;
	private char tipoCliente;
	private double valorConsumo;
	private double valorConta;
	
	
	public Consumo(double valorConsumo) {
		contadorId++;
		this.idConsumo = contadorId;
		Data = new Date();
		this.valorConsumo = valorConsumo;	
		this.fecharConta(valorConsumo);
	}
	
	
	public Consumo( double valorConsumo,char tipoCliente ) {
		contadorId++;
		this.idConsumo = contadorId;
		Data = new Date();
		this.tipoCliente = tipoCliente;
		this.valorConsumo = valorConsumo;
		this.fecharConta(valorConsumo, tipoCliente);
	}

	public Date getData() {
		return Data;
	}
	
	public void setData(Date data) {
		Data = data;
	}
	
	public char getTipoConsumo() {
		return tipoConsumo;
	}
	
	public void setTipoConsumo(char tipoConsumo) {
		this.tipoConsumo = tipoConsumo;
	}
	
	public char getTipoCliente() {
		return tipoCliente;
	}
	
	public void setTipoCliente(char tipoCliente) {
		this.tipoCliente = tipoCliente;
	}
	
	public int getIdConsumo() {
		return idConsumo;
	}
	
	public double getValorConsumno() {
		return valorConsumo;
	}
	
	public double getValorConta() {
		return valorConta;
	}
	
	public void fecharConta(double valorConsumo) 
	{
		this.valorConta = valorConsumo + (valorConsumo*0.1);
	}
	
	public void fecharConta(double valorConsumo, char tipoCliente) 
	{
		if(tipoCliente == 'F') 
		{
			this.valorConta = valorConsumo - 10;
		}
		
		else if(tipoCliente == 'A') 
		{
			if(valorConsumo<=30) 
			{
				this.valorConta = valorConsumo-3;
			}
			
			else 
			{
				this.valorConta = valorConsumo-5;
			}
		}
		
		else 
		{
			this.valorConta = valorConsumo;
		}
	}


	@Override
	public String toString() {
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		return "idConsumo = " + this.idConsumo + "\nData= " + formato.format(this.Data) + "\ntipoConsumo = " + this.tipoConsumo + "\ntipoCliente="
				+ this.tipoCliente + "\nvalorConsumno = " + this.valorConsumo + "\nvalorConta = " + valorConta +"\n";
		
	}
	
	
	
	
}