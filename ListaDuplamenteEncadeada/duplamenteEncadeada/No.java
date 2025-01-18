package duplamenteEncadeada;

public class No {
	int valor;
	No proximo;
	No anterior;

	No(int valor) {
		this.valor = valor;
		this.proximo = null;
		this.anterior = null;
	}
}
