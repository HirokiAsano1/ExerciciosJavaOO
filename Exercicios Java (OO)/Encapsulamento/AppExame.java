package br.com.unit.aula04;

import java.util.Scanner;

public class AppExame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Identificador...: ");
		int idExame = input.nextInt();
		System.out.print("Nome do paciente: ");
		String nomePaciente = input.next();
		System.out.print("Nível de glicose: ");
		int nivelGlicose = input.nextInt();
		
		Exame exame = new Exame(idExame, nomePaciente, nivelGlicose);
			
		System.out.printf("Diagnostico.......: %s\n", exame.obterDiagnostico());
		input.close();
	}
}
