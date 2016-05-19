package mercado;

import java.awt.event.ItemEvent;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Principal {

	
	
	static String item;
	
	static Scanner digita = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
				
		
		CadCliente();
		CadProduto();
		
	}
	
	
		public static void CadCliente() {
		
		Cliente cliente = new Cliente();
		
		System.out.println("\n==========+ Sistema de Mercado +==========\n");
		System.out.println("Dados da Venda: \n");
		
		System.out.printf("Informe o nome do cliente: ");
		cliente.setNome(digita.nextLine());
		
		System.out.printf("Informe o cpf do cliente: ");
		cliente.setCpf(digita.nextLine());
		
		System.out.printf("Informe o endereco do cliente: ");
		cliente.setEndereco(digita.nextLine());
		
				
	}
		
		
		public static void CadProduto(){
			
									
			Produtos produto = new Produtos();
			
			System.out.printf("\nInforme nome do produto: ");
			item = digita.nextLine();
			
			System.out.printf("Informe a quantidade: ");
			produto.setQuantidade(digita.nextInt());
			
			
		if (item == produto.carne) {
						

			System.out.printf(" O produto escolhido foi: " + produto.getQuantidade() + "Kilos de " + item);

		}
		if (item == produto.frango) {

			System.out.printf(" O produto escolhido foi: " + produto.getQuantidade() + "Kilos de " + item);

		}
		if (item == produto.peixe) {

			System.out.printf(" O produto escolhido foi: " + produto.getQuantidade() + "Kilos de " + item);

		}else{
			
			System.out.printf("Nenhum produto escolhido: ");
	
		}
		
			
		
	}
	
	
}
		

		