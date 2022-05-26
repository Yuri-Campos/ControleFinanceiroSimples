package mainPackage;

import java.util.Scanner;

public class Controle {
	
	private Conta conta;
	private int escolha;
	private Scanner scanner;
	
	public Controle()
	{
		conta = new Conta();
		this.escolha = 0;
		scanner = new Scanner(System.in);
	}
	
	public void menu()
	{
		do 
		{
			System.out.println();
			System.out.println("--------------------------");
			System.out.println("Selecione a opcao:");
			System.out.println("1. Adicionar Saldo.");
			System.out.println("2. Adicionar Salario.");
			System.out.println("3. Consultar valores.");
			System.out.println("4. Simular capital em X meses");
			System.out.println("0. Fim.");
			System.out.print("Escolha: ");
			escolha = scanner.nextInt();
			switch(escolha)
			{
			case 1:
				System.out.println("Insira o valor a ser adicionado: ");
				if(!conta.valorEmConta(scanner.nextDouble()))
				{
					System.out.println("Valor precisa ser maior que 0!");
					break;
				}
				System.out.println("Valor adicionado a conta");
				break;
				
			case 2:
				System.out.println("Insira o valor do Salario a ser adicionado: ");
				if(!conta.valorSalario(scanner.nextDouble()))
				{
					System.out.println("Valor precisa ser maior que 0!");
					break;
				}
				break;
			case 3:
				System.out.println("--------------------------");
				System.out.println("Saldo: " + conta.getSaldo());
				System.out.println("Salario: " + conta.getSalario());
				System.out.println("Utilizavel: " + (conta.getSalario()/2));
				System.out.println("investido: " + conta.getInvestido());
				System.out.println("Invesimento mes: " + (conta.getSalario()/2));
				System.out.println("--------------------------");
				break;
				
			case 4:
				System.out.println("--------------------------");
				System.out.println("Deseja simular o capital em quantos meses?");
				int meses = scanner.nextInt();
				System.out.println("Salario: " + conta.salarioXMeses(meses));
				System.out.println("Quanto sera guardado por mês: ");
				System.out.println("Guardado: " + conta.guardado(meses, scanner.nextDouble()));
				break;
		}
		}while(escolha != 0);
	}
}
