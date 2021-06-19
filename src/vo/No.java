package vo;

import java.util.ArrayList;

public class No {
	
	public String nome;
	public double valorUni;
	public int quantidade;
	public ArrayList<No> filhos = new ArrayList();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValorUni() {
		return valorUni;
	}

	public void setValorUni(double valorUni) {
		this.valorUni = valorUni;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public ArrayList<No> getFilhos() {
		return filhos;
	}

	public void setFilhos(ArrayList<No> filhos) {
		this.filhos = filhos;
	}


}
