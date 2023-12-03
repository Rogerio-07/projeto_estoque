package Intaface_usuario;
import java.util.*;

import Repositorio.SistemadeEstoque;

public class Execucao {

	public static void main(String[] args) {
		
		 SistemadeEstoque ResultadoEstoque = new SistemadeEstoque();
	     Scanner scanner = new Scanner(System.in);
	       
	   int comando;
	     
	   	 	do {
	            System.out.println("\nSistema de Estoque - Escolha uma opção:");
	            System.out.println("1. Cadastrar Produto");
	            System.out.println("2. Remover Produto");
	            System.out.println("3. Consultar Produto");
	            System.out.println("4. Gerar Relatorio");
	            System.out.println("0. Para encerrar o programa");
	            
	            comando = scanner.nextInt();

	            switch (comando) {
	            		case 0:
	 					System.out.println("Saindo do programa.");
	 					break;
     
	 					default:
	 					System.out.println("Opção inválida. Tente novamente.");
	 					break;
	                case 1:
	                    ResultadoEstoque.adicionar();
	                    break;
	                case 2:
	                    ResultadoEstoque.remover();
	                    break;
	                case 3:
	                    ResultadoEstoque.pesquisar();
	                    break;
	                case 4:
	                	Scanner ler = new Scanner(System.in);
	                	System.out.println("1 - Relatório Geral \n2 - Relatório por Categoria");
	                	int numero = ler.nextInt();
	                	
	                	if(numero==1) {
	                		
	                    ResultadoEstoque.relatorioGeral();
	                    
	                	}if(numero==2) {
	                		
	                		System.out.println("Escolha a categoria:\n1 - Alimenticios \n2 - Bebidas \n3 - Limpeza \n4 - Higiene \n5 - Diversos");
	                		int num = ler.nextInt();
	                		
	                		switch(num) {
	                		
	                		case 1:
	                			ResultadoEstoque.produtoAlimenticio();
	                			break;
	                		case 2:
	                			ResultadoEstoque.produtoBebida();
	                			break;
	                		case 3:
	                			ResultadoEstoque.produtoLimpeza();
	                			break;
	                		case 4:
	                			ResultadoEstoque.produtoHigiene();
	                			break;
	                		case 5:
	                			ResultadoEstoque.produtoDiversos();
	                			break;
	                			
	                		case 0:
		   	 					System.out.println("Saindo do programa.");
		   	 					break;
		   	 					
	    	                default:
	    	                    System.out.println("Opção inválida. Tente novamente.");
	    	                    break;
	    	                    
	                		} 
	                	
	            			}
	                		
	            			}         			
	            
	        } while (comando != 0);
	       scanner.close();
	   	 	}
	
	}
