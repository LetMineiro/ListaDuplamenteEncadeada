package duplamenteEncadeada;

import java.util.Scanner;

public class MainDuplamenteEncadeada {
	public static void main(String[] args) {
		ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
		Scanner scanner = new Scanner(System.in);
		int opcao;

		do {
			System.out.println("\nMenu:");
			System.out.println("1. Inserir no início");
			System.out.println("2. Inserir no fim");
			System.out.println("3. Inserir em posição específica");
			System.out.println("4. Remover do início");
			System.out.println("5. Remover do fim");
			System.out.println("6. Remover de posição específica");
			System.out.println("7. Pesquisar valor");
			System.out.println("8. Atualizar valor em posição específica");
			System.out.println("9. Percorrer do início ao fim");
			System.out.println("10. Percorrer do fim ao início");
			System.out.println("0. Sair");
			System.out.print("Escolha uma opção: ");

			opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				System.out.print("Digite o valor: ");
				lista.inserirNoInicio(scanner.nextInt());
				break;
			case 2:
				System.out.print("Digite o valor: ");
				lista.inserirNoFim(scanner.nextInt());
				break;
			case 3:
				System.out.print("Digite o valor: ");
				int valor = scanner.nextInt();
				System.out.print("Digite a posição: ");
				lista.inserirEmPosicao(valor, scanner.nextInt());
				break;
			case 4:
				lista.removerDoInicio();
				break;
			case 5:
				lista.removerDoFim();
				break;
			case 6:
				System.out.print("Digite a posição: ");
				lista.removerDePosicao(scanner.nextInt());
				break;
			case 7:
				System.out.print("Digite o valor: ");
				lista.pesquisar(scanner.nextInt());
				break;
			case 8:
				System.out.print("Digite a posição: ");
				int posicao = scanner.nextInt();
				System.out.print("Digite o novo valor: ");
				lista.atualizar(posicao, scanner.nextInt());
				break;
			case 9:
				lista.percorrerDoInicioAoFim();
				break;
			case 10:
				lista.percorrerDoFimAoInicio();
				break;
			case 0:
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Opção inválida.");
			}
		} while (opcao != 0);

		scanner.close();
	}

}
