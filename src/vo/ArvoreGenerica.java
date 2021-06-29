package vo;

import java.util.Scanner;

public class ArvoreGenerica {
	
	Scanner scanner = new Scanner(System.in);
	No produto;

	public No getProduto() {
		return produto;
	}

	public void setProduto(No produto) {
		this.produto = produto;
	}

	public No criarProduto(String nome) {
		double startValor = 0;
		final int quantProduto = 1;

		produto = criarSubArvore(nome, startValor, quantProduto);

		return produto;

	}

	public No criarSubArvore(String nome, Double valorUni, int quantidade) {

		No pai = criarNo(nome, valorUni, quantidade);

		return pai;

	}

	public No criarNo(String nome, Double valorUni, int quantidade) {

		No no = new No();

		no.setNome(nome);

		no.setValorUni(valorUni);

		no.setQuantidade(quantidade);

		return no;

	}

	public void addList(No peça, No no) {

		peça.getFilhos().add(no);

	}

	public void imprimeNosFolha(No no) {
		
		if (isFolha(no)) {
			System.out.print(no.getNome()+", ");
		}
		for (int i = 0; i < no.getFilhos().size(); i++) {
			imprimeNosFolha(no.getFilhos().get(i));
		}
	}

	public boolean isFolha(No no) {
		if (no.getFilhos().size() == 0) {
			return true;
		}

		return false;
	}

	public void soma(No name, int quant) {
		double soma = 0.0;
		for (int i=0; i<quant; i++) {
				soma += name.getValorUni();
		}
		
		System.out.println("Nome do Produto: " + name.getNome() 
			+ ", Preço Total R$" + String.format("%.2f", soma) 
			+ ", Preço Unidade R$" + String.format("%.2f", name.getValorUni())
			+ "\n");
	}

}
