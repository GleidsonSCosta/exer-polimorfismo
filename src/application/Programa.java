package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import classes.Funcionario;
import classes.Terceirizado;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> list = new ArrayList<>();
		
		
		System.out.println("Digite a quantidade de funcionarios: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Dados do funcionario: #" + i);
			System.out.print("O funcionario é terceirizado?(s/n)");
			char resp = sc.next().charAt(0);
			System.out.print("Nome:");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Quantidade de horas trabalhadas: ");
			Integer qtdHoras = sc.nextInt();
			System.out.print("valor da hora: ");
			Double valorHora = sc.nextDouble();
			if(resp == 's' || resp == 'S') {
				System.out.print("Valor do custo adicional: ");
				Double custoAdicional = sc.nextDouble();
				list.add(new Terceirizado(nome, qtdHoras, valorHora, custoAdicional));
			}else if (resp == 'n' || resp == 'N' ) {
				list.add(new Funcionario(nome, qtdHoras, valorHora));
			}else {
				System.out.println("Resposta inválida");
			}
		}
		System.out.println();
		for(Funcionario fc : list ) {
			System.out.print("Nome: " + fc.getNome() + "\n");
			System.out.printf("Pagamento: %.2f%n", fc.pagamento());
		}
		
		
		sc.close();
	}

}
