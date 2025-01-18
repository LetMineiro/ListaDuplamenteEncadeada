package duplamenteEncadeada;

public class ListaDuplamenteEncadeada {
	private No inicio;
	private No fim;
	private int tamanho;

	public ListaDuplamenteEncadeada() {
		this.inicio = null;
		this.fim = null;
		this.tamanho = 0;
	}

	// Checar lista
	public boolean estaVazia() {
		return tamanho == 0;
	}
    
    // Inserção no início
	public void inserirNoInicio(int valor) {
		No novoNo = new No(valor);
		if (estaVazia()) {
			inicio = fim = novoNo;
		} else {
			novoNo.proximo = inicio;
			inicio.anterior = novoNo;
			inicio = novoNo;
		}
		tamanho++;
	}

    // Inserção no final
	public void inserirNoFim(int valor) {
		No novoNo = new No(valor);
		if (estaVazia()) {
			inicio = fim = novoNo;
		} else {
			fim.proximo = novoNo;
			novoNo.anterior = fim;
			fim = novoNo;
		}
		tamanho++;
	}

	// Inserção em uma posição específica
	public void inserirEmPosicao(int valor, int posicao) {
		if (posicao < 0 || posicao > tamanho) {
			System.out.println("Posição inválida.");
			return;
		}
		if (posicao == 0) {
			inserirNoInicio(valor);
		} else if (posicao == tamanho) {
			inserirNoFim(valor);
		} else {
			No novoNo = new No(valor);
			No atual = inicio;
			for (int i = 0; i < posicao - 1; i++) {
				atual = atual.proximo;
			}
			novoNo.proximo = atual.proximo;
			novoNo.anterior = atual;
			atual.proximo.anterior = novoNo;
			atual.proximo = novoNo;
			tamanho++;
		}
	}

	// Remoção do início
	public void removerDoInicio() {
		if (estaVazia()) {
			System.out.println("Lista vazia.");
			return;
		}
		if (inicio == fim) {
			inicio = fim = null;
		} else {
			inicio = inicio.proximo;
			inicio.anterior = null;
		}
		tamanho--;
	}

	// Remoção do final
	public void removerDoFim() {
		if (estaVazia()) {
			System.out.println("Lista vazia.");
			return;
		}
		if (inicio == fim) {
			inicio = fim = null;
		} else {
			fim = fim.anterior;
			fim.proximo = null;
		}
		tamanho--;
	}

	// Remoção em uma posição específica
	public void removerDePosicao(int posicao) {
		if (estaVazia()) {
			System.out.println("Lista vazia.");
			return;
		}
		if (posicao < 0 || posicao >= tamanho) {
			System.out.println("Posição inválida.");
			return;
		}
		if (posicao == 0) {
			removerDoInicio();
		} else if (posicao == tamanho - 1) {
			removerDoFim();
		} else {
			No atual = inicio;
			for (int i = 0; i < posicao; i++) {
				atual = atual.proximo;
			}
			atual.anterior.proximo = atual.proximo;
			atual.proximo.anterior = atual.anterior;
			tamanho--;
		}
	}

	// Pesquisa de um valor
	public void pesquisar(int valor) {
		No atual = inicio;
		int posicao = 0;
		while (atual != null) {
			if (atual.valor == valor) {
				System.out.println("Valor encontrado na posição: " + posicao);
				return;
			}
			atual = atual.proximo;
			posicao++;
		}
		System.out.println("Valor não encontrado.");
	}

	// Atualização de valor em uma posição específica
	public void atualizar(int posicao, int novoValor) {
		if (posicao < 0 || posicao >= tamanho) {
			System.out.println("Posição inválida.");
			return;
		}
		No atual = inicio;
		for (int i = 0; i < posicao; i++) {
			atual = atual.proximo;
		}
		atual.valor = novoValor;
	}
    
	//Percorrer do inicio ao fim
	public void percorrerDoInicioAoFim() {
		No atual = inicio;
		while (atual != null) {
			System.out.print(atual.valor + " ");
			atual = atual.proximo;
		}
		System.out.println();
	}
	
	//Percorrer do fim ao inicil
	public void percorrerDoFimAoInicio() {
		No atual = fim;
		while (atual != null) {
			System.out.print(atual.valor + " ");
			atual = atual.anterior;
		}
		System.out.println();
	}
}
