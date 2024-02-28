package triangle;
import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Application {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		List<Veiculo>veiculo = new ArrayList();
		
		for(int i = 0 ; i<3 ; i++ ) 
		{	System.out.print("Digite o ID Do carro: ");
			int idVeiculo = sc.nextInt();
			sc.nextLine();
			System.out.print("Digite a placa do Carro: ");
			String placa = sc.nextLine();
			System.out.print("Digite o Odometro do Carro: ");
			int KmOdometro = sc.nextInt();
			veiculo.add(new Veiculo(idVeiculo,placa,KmOdometro));
			System.out.println();
		}
		
		for (Veiculo veiculos : veiculo) {
			System.out.printf("\n Id Veiculo:%d \n Placa : %s \n KmOdometro :%d \n Status:%s \n",veiculos.getIdVeiculo() 
																			,veiculos.getPlaca()
																			,veiculos.getKmOdometro()
																			,veiculos.getStatus());
		}
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Date dataInicio = formato.parse("15/03/2023");
		Date dataFinal = formato.parse("16/03/2023");

		Viagem viagem = new Viagem (1,"Manaus",dataInicio,dataFinal);
		
		System.out.printf("\n Id Viagem:%d \n Destino : %s \n Data inicio :%s \n Data Final:%s \n",viagem.getIdViagem()
																								  ,viagem.getDestino()
																								  ,formato.format(viagem.getDataInicial())
																								  ,formato.format(viagem.getDataFinal()));
		System.out.println();
			
		while (true) {
		    System.out.print("Digite o Id do carro Desejado para viagem:");
		    int idEscolhido = sc.nextInt();

		    boolean idEncontrado = false;
		    for (Veiculo veiculos : veiculo) {
		        if (idEscolhido == veiculos.getIdVeiculo()) {
		            viagem.iniciarViagem(veiculos);
		            idEncontrado = true;
		            break;
		        }
		    }

		    if (idEncontrado) {
		        break;
		    } else {
		        System.out.println("Digite um Id Valido");
		    }
		}

		System.out.println("Viagem Registrada");
		System.out.printf("\n Id Viagem:%d \n Destino : %s \n Data inicio :%s \n Data Final:%s \n Id do Veiculo Registrado: %d \n Status do Veiculo:%s \n"
																								,viagem.getIdViagem()
																								 ,viagem.getDestino()
																								 ,formato.format(viagem.getDataInicial())
																								 ,formato.format(viagem.getDataFinal())
																								 ,viagem.getVeiculo().getIdVeiculo()
																								 ,viagem.getVeiculo().getStatus());
		System.out.println();
		System.out.println("Quanto o odometro esta marcando ao final da viagem? ");
		int OdometroFinal = sc.nextInt();
		viagem.finalizarViagem(OdometroFinal);
		System.out.println("Viagem Finalizada");
		System.out.printf("\n Id Viagem: %d \n Destino : %s \n Data inicio :%s \n Data Final:%s \n Km Pecorridos na viagem: %d \n"
							,viagem.getIdViagem()
							,viagem.getDestino()
							,formato.format(viagem.getDataInicial())
							,formato.format(viagem.getDataFinal())
							,viagem.getKmPecorrido());
		
		System.out.println("Informações sobre o veiculo alocado Finalizada");
		System.out.printf("\n Id Veiculo: %d \n Status: %s \n Odometro no carro: %d \n"
																					,viagem.getVeiculo().getIdVeiculo()
																					,viagem.getVeiculo().getStatus()
																					,viagem.getVeiculo().getKmOdometro());
		
		while (true) {
		    System.out.print("Digite o Id do carro para manutencao :");
		    int idEscolhido = sc.nextInt();

		    boolean idEncontrado = false;
		    for (Veiculo veiculos : veiculo) {
		        if (idEscolhido == veiculos.getIdVeiculo()) {
		            veiculos.revisar();
		            idEncontrado = true;
		            break;
		        }
		    }

		    if (idEncontrado) {
		        break;
		    } else {
		        System.out.println("Digite um Id Valido");
		    }
		}
		for (Veiculo veiculos : veiculo) {
			System.out.printf("\n Id Veiculo:%d \n Placa : %s \n KmOdometro :%d \n Status:%s \n",veiculos.getIdVeiculo() 
																			,veiculos.getPlaca()
																			,veiculos.getKmOdometro()
																			,veiculos.getStatus());
		}
		
	}

}