package main;

import vo.ArvoreGenerica;
import vo.No;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import View.View;

public class StartApp {
	
	static ArvoreGenerica arvore = new ArvoreGenerica();
	static Scanner scanner = new Scanner(System.in);
	static int option = 0;
	static View view = new View();
	
	public static void main(String[] args) {
		StartApp app = new StartApp();
		app.printMenu();
		

	}

	public void initialize() {
		
		ArvoreGenerica arvore = new ArvoreGenerica();
		cadastrarArvore(arvore);

	}
	
	public void printMenu() {
		
		while (option != 9) {
			System.out.println("1 - para cadastrar o nome e preço das peças");
			System.out.println("2 - para imprimir as peças no sistema");
			System.out.println("9 - para sair");
			System.out.print("Digite sua opção: ");
				option = readInt();
					checkMenu();
		}
		
	}
	
	public void checkMenu() {
		
		if (option == 1) {
			cadastro();
			
		} else if (option == 2) {
			initialize();
			
		} else if (option == 9) {
			System.out.println("Fim do App!!!");
			
		} else {
			System.out.println();
				printMenu();
		}
		
	}
	
	public void cadastro() {
		/*
		 * NIVEL4
		 */
		System.out.println("\nNivel 4");
		System.out.println("Water Cooler");
		view.print1();
			String name = scanner.nextLine();
		view.print2();
			double price = readDouble();
		view.print3();
			int quant = readInt();
			
			No waterCooler = arvore.criarNo(name, price, quant);
			arvore.soma(waterCooler, quant);
			
		/*
		 * NIVEL3
		 */
		System.out.println("\nNivel 3");
		System.out.println("\nSSD");
		view.print1();
			name = scanner.nextLine();
		view.print2();
			price = readDouble();
		view.print3();
			quant = readInt();
			
			No ssd = arvore.criarNo(name, price, quant);
			arvore.soma(ssd, quant);
		
		System.out.println("\nRAM");
		view.print1();
			name = scanner.nextLine();
		view.print2();
			price = readDouble();
		view.print3();
			quant = readInt();
		
			No ram = arvore.criarNo(name, price, quant);
			arvore.soma(ram, quant);
		
		System.out.println("\nPlaca de Vídeo");
		view.print1();
			name = scanner.nextLine();
		view.print2();
			price = readDouble();
		view.print3();
			quant = readInt();
		
			No video = arvore.criarNo(name, price, quant);
			arvore.soma(video, quant);
		
		System.out.println("\nProcessador");
		view.print1();
			name = scanner.nextLine();
		view.print2();
			price = readDouble();
		view.print3();
			quant = readInt();
	
		No proc = arvore.criarNo(name, price, quant);
		arvore.soma(proc, quant);
		
		/*
		 * NIVEL2
		 */
		System.out.println("\nNivel 2");
		System.out.println("\nFonte");
		view.print1();
			name = scanner.nextLine();
		view.print2();
			price = readDouble();
		view.print3();
			quant = readInt();

		No fonte = arvore.criarNo(name, price, quant);
		arvore.soma(fonte, quant);
		
		
		System.out.println("\nPlaca Mãe");
		view.print1();
			name = scanner.nextLine();
		view.print2();
			price = readDouble();
		view.print3();
			quant = readInt();

		No mae = arvore.criarNo(name, price, quant);
		arvore.soma(mae, quant);
		
		/*
		 * NIVEL1
		 */
		System.out.println("\nMonitor");
		view.print1();
			name = scanner.nextLine();
		view.print2();
			price = readDouble();
		view.print3();
			quant = readInt();
			
		No monitor = arvore.criarNo(name, price, quant);
		arvore.soma(monitor, quant);
		
		
		System.out.println("\nMouse");
		view.print1();
			name = scanner.nextLine();
		view.print2();
			price = readDouble();
		view.print3();
			quant = readInt();
			
		No mouse = arvore.criarNo(name, price, quant);
		arvore.soma(mouse, quant);
		
		
		System.out.println("\nTeclado");
		view.print1();
			name = scanner.nextLine();
		view.print2();
			price = readDouble();
		view.print3();
			quant = readInt();
			
		No teclado = arvore.criarNo(name, price, quant);
		arvore.soma(teclado, quant);
		
		
		System.out.println("\nGabinete");
		view.print1();
			name = scanner.nextLine();
		view.print2();
			price = readDouble();
		view.print3();
			quant = readInt();
			
		No gabi = arvore.criarNo(name, price, quant);
		arvore.soma(gabi, quant);
			
	}

	public void cadastrarArvore(ArvoreGenerica arvore) {

		System.out.println("\n**********CADASTRO DE PRODUTO**********\n");

		System.out.println("Populando o nível 0\n");
		// raiz nivel 0

		No computador = arvore.criarProduto("Computador");

		// nivel 1 filhos do computador
		System.out.println("Populando o nível 1\n");

		No monitor = arvore.criarNo("Monitor", 1000.0, 1);
		arvore.addList(computador, monitor);

		No mouse = arvore.criarNo("Mouse", 200.0, 1);
		arvore.addList(computador, mouse);

		No teclado = arvore.criarNo("Teclado", 200.0, 1);
		arvore.addList(computador, teclado);

		No gabinete = arvore.criarSubArvore("Gabinete", 300.0, 1);
		arvore.addList(computador, gabinete);

		// nivel 2 filhos do gabinete
		System.out.println("Populando o nível 2\n");
		No fonte = arvore.criarNo("Fonte", 400.0, 1);
		arvore.addList(gabinete, fonte);

		No placaMae = arvore.criarSubArvore("Placa Mãe", 400.0, 1);
		arvore.addList(gabinete, placaMae);

		// nivel 3 filhos da placa mae
		System.out.println("Populando o nível 3\n");
		No SSD = arvore.criarNo("SSD", 400.0, 2);
		arvore.addList(placaMae, SSD);

		No RAM = arvore.criarNo("RAM", 300.0, 2);
		arvore.addList(placaMae, RAM);

		No placaDeVideo = arvore.criarNo("Placa de Vídeo", 1500.0, 1);
		arvore.addList(placaMae, placaDeVideo);

		No processador = arvore.criarSubArvore("Processador", 1000.0, 1);
		arvore.addList(placaMae, processador);

		// nivel 4 filho do processador
		System.out.println("Populando o nível 4\n");
		No waterCooler = arvore.criarNo("Water Cooler", 200.0, 1);
		arvore.addList(processador, waterCooler);

		calculaPreco(computador, gabinete, placaMae, processador);
		System.out.println("Lista de nós folha:");
		arvore.imprimeNosFolha(computador);
	}

	public int readInt() {
		int x = scanner.nextInt();   scanner.nextLine();
		return x;

	}

	public double readDouble() {
		double x = scanner.nextDouble();   scanner.nextLine();
		return x;

	}

	public void calculaPreco(No computador, No gabinete, No placaMae, No processador) {

		processador.setValorTotal(processador.calculavalor(processador));
		System.out.println("Valor total do processador: R$:" + processador.getValorTotal());
		double v1 = processador.getValorTotal();

		placaMae.setValorTotal(placaMae.calculavalor(placaMae));
		System.out.println("Valor total da Placa Mãe: R$:" + placaMae.getValorTotal());
		double v2 = placaMae.getValorTotal();

		gabinete.setValorTotal(gabinete.calculavalor(gabinete));
		System.out.println("Valor total do gabinete: R$:" + gabinete.getValorTotal());
		double v3 = gabinete.getValorTotal();

		computador.setValorTotal(computador.calculavalor(computador));
		System.out.println("Valor total do computador: R$:" + computador.getValorTotal());
		double v4 = computador.getValorTotal();

		System.out.println("\nValor Final: R$:" + (v1 + v2 + v3 + v4));

	}

}
