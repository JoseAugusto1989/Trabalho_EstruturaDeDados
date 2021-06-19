package main;

import vo.ArvoreGenerica;
import vo.No;
import java.util.ArrayList;
import java.util.List;

public class StartApp {
	
	public static void main(String[] args) {

		StartApp app = new StartApp();
		app.initialize();

	}

	public void initialize() {

		ArvoreGenerica arvore = new ArvoreGenerica();
		cadastrarArvore(arvore);

		
	}

	public void cadastrarArvore(ArvoreGenerica arvore) {

		double soma1, soma2, soma3, soma4;
		// raiz nivel 0

		No computador = arvore.criarProduto("COMPUTADOR");
		
		// nivel 1 filhos do computador

		No monitor = arvore.criarNo("MONITOR", 1000, 1);
		computador.filhos.add(monitor);

		No mouse = arvore.criarNo("MOUSE", 200, 1);
		computador.filhos.add(mouse);

		No teclado = arvore.criarNo("TECLADO", 200, 1);
		computador.filhos.add(teclado);

		No gab = arvore.criarSubArvore("GABINETE", 300, 1);
		computador.filhos.add(gab);

		// nivel 2 filhos do gabinete

		No fonte = arvore.criarNo("FONTE", 400, 1);
		gab.filhos.add(fonte);

		No pMae = arvore.criarSubArvore("PLACA MÃE", 400, 1);
		gab.filhos.add(pMae);

		// nivel 3 filhos da placa mae

		No ssd = arvore.criarNo("SSD", 400, 1);
		pMae.filhos.add(ssd);

		No ram = arvore.criarNo("RAM", 300, 2);
		pMae.filhos.add(ram);

		No placa = arvore.criarNo("PLACA DE VÍDEO", 1500, 1);
		pMae.filhos.add(ssd);

		No proc = arvore.criarSubArvore("PROCESSADOR", 1000, 1);
		pMae.filhos.add(proc);

		// nivel 4 filho do processador

		No wat = arvore.criarNo("WATER COOLER", 200, 1);
		proc.filhos.add(wat);

		soma1 = (proc.getValorUni() + wat.getValorUni());
		soma2 = (pMae.getValorUni() + ssd.getValorUni() + (ram.getValorUni()*2) + placa.getValorUni() + soma1);
		soma3 = (gab.getValorUni() + fonte.getValorUni() + soma2);
		soma4 = (monitor.getValorUni() + mouse.getValorUni() + teclado.getValorUni() + soma3);
		
		//IMPRIMIR
		/*
		 * nivel0
		 */
		
		System.out.println(computador.getNome() + ", Preço R$ " + soma4 + ", Quantidade: " + computador.getQuantidade() + "\n");
		
		/*
		 * nivel1
		 */
		System.out.println(monitor.getNome() + ", Preço R$ " + monitor.getValorUni() + ", Quantidade: " + monitor.getQuantidade());
		System.out.println(mouse.getNome() + ", Preço R$ " + mouse.getValorUni() + ", Quantidade: " + mouse.getQuantidade());
		System.out.println(teclado.getNome() + ", Preço R$ " + teclado.getValorUni() + ", Quantidade: " + teclado.getQuantidade());
		System.out.println(gab.getNome() + ", Preço R$ " + gab.getValorUni() + ", Quantidade: " + gab.getQuantidade()
		+ "\n   Valor Total R$: " + soma3 + "\n");
		
		/*
		 * nivel2
		 */
		
		System.out.println(fonte.getNome() + ", Preço R$ " + fonte.getValorUni() + ", Quantidade: " + fonte.getQuantidade());
		System.out.println(pMae.getNome() + ", Preço R$ " + pMae.getValorUni() + ", Quantidade: " + pMae.getQuantidade()
		+ "\n   Valor Total R$: " + soma2 + "\n");
		/*
		 * nivel3
		 */
		System.out.println(ssd.getNome() + ", Preço R$ " + ssd.getValorUni() + ", Quantidade: " + ssd.getQuantidade());
		System.out.println(ram.getNome() + ", Preço R$ " + ram.getValorUni() + ", Quantidade: " + ram.getQuantidade());
		System.out.println(placa.getNome() + ", Preço R$ " + placa.getValorUni() + ", Quantidade: " + placa.getQuantidade());
	
		System.out.println(proc.getNome() + ", Preço R$ " + proc.getValorUni() + ", Quantidade: " + proc.getQuantidade()
		+ "\n   Valor Total R$: " + soma1 + "\n");
		/*
		 * nivel4
		 */
		System.out.println(wat.getNome() + ", Preço: R$ " + wat.getValorUni() + ", Quantidade: " + wat.getQuantidade());
	}

}
