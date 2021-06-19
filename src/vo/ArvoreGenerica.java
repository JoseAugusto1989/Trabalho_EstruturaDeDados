package vo;

public class ArvoreGenerica {
	
	No produto;

	public No criarProduto(String nome) {
		double startValor = 0f;
		final int quantProduto = 1;

		produto = criarSubArvore(nome, startValor, quantProduto);

		return produto;

	}

	public No criarSubArvore(String nome, double valorUni, int quantidade) {

		No pai = criarNo(nome, valorUni, quantidade);

		return pai;

	}

	public No criarNo(String nome, double valorUni, int quantidade) {

		No no = new No();

		no.nome = nome;

		no.valorUni = valorUni;

		no.quantidade = quantidade;

		return no;

	}

	public float calculaPreco() {

		return 0f;

	}

}
