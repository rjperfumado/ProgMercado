package mercado;

import java.util.Scanner;


public class Principal extends Produtos{

	
	
	static Scanner digita = new Scanner(System.in);
	
	
	public static void main(String[] args) {
						
		
		CadCliente();
		CadProduto();
		CalculaPrecos();
		
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
	
	//Método de cadastro dos produtos	
		public static void CadProduto(){
			
									
			Produtos produto = new Produtos();
												
			//Inserindo nome do produto
			System.out.printf("\nInforme nome do produto: ");
			produto.setItem(digita.nextLine());
									
			//Inserindo a quantidade do produto
			System.out.printf("Informe a quantidade: ");
			produto.setQuantidade(digita.nextInt());
			
					
			//Print do tipo de produto e sua quantidade
			System.out.printf(" O produto escolhido foi: " + produto.getQuantidade() + " Kilos de " + produto.getItem());
						
		
 	}
			
			public static void CalculaPrecos(){
				
				
				if (digita.equals(carne)) {
					
					total = quantidade * TabelaPrecos.tab_carne;
					
					
					System.out.println("O valor é" + total);
				}
				
			}
			
	}
		
		
	
	
	

		

		