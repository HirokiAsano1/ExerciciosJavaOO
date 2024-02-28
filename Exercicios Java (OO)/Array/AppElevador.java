package Atvfor;
import java.util.Scanner;
public class AppElevador {
	
	static Elevador elevador[]  = new Elevador[3];
	static Scanner sc = new Scanner(System.in);
	static int contaElevador = 0;
	
	public static void main(String[] args) {
		int opcao = 0;
		do {
			System.out.println("\n*** Seletor de Opções ***");
			System.out.println();
			System.out.println("1 - Cadastrar Elevador");
			System.out.println("2 - Consultar Elevador");
			System.out.println("3 - Alterar Elevador");
			System.out.println("4 - Listar Exames");
			System.out.println("0 - Finalizar");

			System.out.print("\nOpção: ");
			opcao = sc.nextInt();
			
			switch (opcao) {
			case 1:
				cadastraElevador();
				break;
			case 2:
				consultaElevador();
				break;
			case 3:
				alteraElevador();
				break;
			case 4:
				listaElevador();
				break;
			case 0:
				System.out.println("\n--- PROGRAMA FINALIZADO");
				break;
			default:
				System.out.println("\nOpção incorreta");
				
			}
			
		} while (opcao !=0);
		sc.close();
	}
	public static Elevador pesquisaElevadoPorCodigo(int codigoElevador) 
	{
		for (int i = 0; i < elevador.length; i++) {
			if(elevador[i] !=null && codigoElevador == elevador[i].getCodigo()) 
			{
				return elevador[i];
			}
		}
		return null;
	}
	
	public static void consultaElevador() {
		System.out.println("\n*** Consulta de Elevador ***\n");
		
		if(contaElevador == 0) {
			System.out.println(">> Vetor Vazio <<\n");
			return;
		}
		
		System.out.print("Codigo..........: ");
		int codigoElevador = sc.nextInt();
		
		Elevador elevadorPesquisado = pesquisaElevadoPorCodigo(codigoElevador);
		
		if(elevadorPesquisado == null) {
			System.out.println(">> Codigo não cadastrado <<");
			return;
		}
		
		System.out.printf("Pessoas no Elevador:.. %s\n", elevadorPesquisado.getPessoasTransportadas());
		System.out.printf("Limite de Pessoas:...: %d\n",elevadorPesquisado.getLimitePessoas());
		System.out.printf("Status..............: %s\n", elevadorPesquisado.getStatus());

		System.out.println(">> Consulta realizada <<\n");
	}
	
	public static void alteraElevador() 
	{
		System.out.println("\n*** Alteração Cadastro do Elevador ***\n");
		
		if(contaElevador == 0) {
			System.out.println(">> Vetor Vazio <<\n");
			return;
		}
		
		System.out.print("Codigo..........: ");
		int codigoElevador = sc.nextInt();
		
		Elevador elevadorPesquisado = pesquisaElevadoPorCodigo(codigoElevador);
		
		if(elevadorPesquisado == null) {
			System.out.println(">> Codigo não cadastrado <<");
			return;
		}
		
		System.out.printf("Pessoas no Elevador: %s\n", elevadorPesquisado.getPessoasTransportadas());
		System.out.printf("Limite de Pessoas:...: %d\n",elevadorPesquisado.getLimitePessoas());
		System.out.printf("Status..............: %s\n", elevadorPesquisado.getStatus());

		System.out.println("Pessoas no Elevador: ");
		int pessoasTransportadas = sc.nextInt();
		System.out.println("Limite de Pessoas: ");
		int limitePessoas = sc.nextInt();
		sc.next();
		System.out.println("Status: ");
		String status = sc.next();
		
		elevadorPesquisado.setPessoasTransportadas(pessoasTransportadas);
		elevadorPesquisado.setLimitePessoas(limitePessoas);
		elevadorPesquisado.setStatus(status);
		
		System.out.println(">> Alteração realizada <<\n");
	}
	
	public static void cadastraElevador() {
		System.out.println("\n*** Cadastro de Elevador ***\n");
		
		if(contaElevador == elevador.length) {
			System.out.println(">> Vetor cheio <<\n");
			return;
		}
		
		System.out.print("Codigo..........: ");
		int codigoElevador = sc.nextInt();
		
		if(pesquisaElevadoPorCodigo(codigoElevador) !=null) {
			System.out.println(">> Codigo já cadastrado <<");
			return;
		}
		
		System.out.println("Pessoas no Elevador: ");
		int pessoasTransportadas = sc.nextInt();
		System.out.println("Limite de Pessoas: ");
		int limitePessoas = sc.nextInt();
		System.out.println("Status: ");
		String status = sc.next();
		
		elevador[contaElevador] = new Elevador(codigoElevador,pessoasTransportadas,limitePessoas,status);
		
		contaElevador++;
		System.out.println(">> Cadastro Realizado <<\n");
	}
	
	public static void listaElevador() 
	{
		System.out.println("\n*** Lista de elevadores ***\n");
		
		if(contaElevador == 0) {
			System.out.println(">> Vetor vazio <<\n");
			return;
		}
		
		System.out.println("--------------------------------------------------------");
		System.out.println("Codigo - pessoasTransportadas                   - limitePessoas  -  status");
		System.out.println("--------------------------------------------------------");
		
		for(int i = 0 ; i < elevador.length; i++) 
		{
			if(elevador[i] != null) {
				System.out.printf("%2d - %-3d   - %3d      - %s\n", 
						elevador[i].getCodigo(),
						elevador[i].getPessoasTransportadas(),
						elevador[i].getLimitePessoas(),
						elevador[i].getStatus());
						
		}
	}
		System.out.println("--------------------------------------------------------");

}
}
