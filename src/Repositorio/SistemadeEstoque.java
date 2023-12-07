package Repositorio;
import java.util.*;
import Negocios.IProduto;
import Dados.Produto;


public class SistemadeEstoque implements IProduto {

		ArrayList<Produto> lista = new ArrayList<Produto>();
		private int total;
		
		public void adicionar() {
			 Scanner scan = new Scanner(System.in);
			 Scanner scan1 = new Scanner(System.in);
			
			   System.out.println("Cadastro de Produto:");
			
			   System.out.println("Codigo: ");
			   int codigo = scan.nextInt();
			   
			   int a = 0;
			   while(a<lista.size()) {
				   Produto p = lista.get(a);
				   if(p.getCodigo()!=codigo){
					  
				   }else {
					   System.out.println("Codigo indiponivel, tente novamente!");
					   return;
				   }
			  a++; 
		   }
			   
			   System.out.print("DescriÁ„o: ");
			   String descricao = scan1.nextLine();

			   System.out.print("Preco: ");
			   double preco = scan.nextDouble();

			   System.out.print("Quantidade: ");
			   int quantidade = scan.nextInt();

			   System.out.print("Fabricante: ");
			   String fabricante = scan1.next();;
			   
			   System.out.print("Tipo de Produto\n 1 - Aliment√≠cio | 2 - Bebida | 3 - Limpeza | 4 - Higiene | 5 - Diversos \n");
			   String tipoProduto = scan.next();
			   
			   Produto p = new Produto(codigo,quantidade,descricao,preco,fabricante,tipoProduto);
			   lista.add(p);
			   
			   System.out.println("\nProduto cadastrado com sucesso!");		   
		}				
		@Override
		public void remover() {
			   System.out.println("Informe o codigo do produto que deseja remover ");
			   Scanner scanner = new Scanner(System.in);
			   int codigo = scanner.nextInt();
			   int i = 0;
				   while (i<lista.size()) {
				   if(lista.get(i).getCodigo() == codigo) {
				   lista.remove(i);
				   System.out.println("Produto removido com sucesso!"); 
				   return;
			   }
				   i++;
				   }
				   System.out.println("Produto nao existe");
				}

		@Override
		public void pesquisar(){
			   Scanner scanner = new Scanner(System.in);
			   
			   System.out.println("Informe o codigo do produto que deseja pesquisar ");
			   int codigo = scanner.nextInt();
			   int i=0;
			   
			   while(i<lista.size()) {
				   
				   Produto p = lista.get(i);
				   
				   if(p.getCodigo()==codigo){
					   System.out.println("Produto encontrado: \n"+p.ToString());
					   
					   System.out.println("Deseja alterar a quantidade deste produto?\n 1 - Sim  2 - N√£o\n");
					   int alt = scanner.nextInt();
					   
					   if(alt == 1){
						   System.out.println("1 - Adicionar ou 2 - Remover");
						   int alt2 = scanner.nextInt();
						   
						   if(alt2==1) {
							   System.out.println("informe a quantidade a acrescentar: ");
							   int qtd2 = scanner.nextInt();
							   
							   total = p.getQtd()+qtd2; 
							   p.setQtd(total);
							   System.out.println("Quantidade Atualizada com sucesso!\nQuantidade Atual: "+total);
							   return;
						   		}
						   
						   if(alt2==2){
					   		   System.out.println("informe a quantidade a remover: ");
					   		   int qtd2 = scanner.nextInt();
					   		   total = p.getQtd()-qtd2; 
					   		   p.setQtd(total);
					   		   
					   		if(total>0){
				   		   		System.out.println("Quantidade Atualizada com sucesso!\nQuantidade Atual: "+total);
							    return;
							   
				   		   }else{
							   	System.out.println("Quantidade insulficiente para remoÁ„o!");
							   	return;
						   }
						 }
					   }
					   		     		   
					   if(alt==2){
						   return;
					       }			
				       }
				    		i++; 
			   		}
			   		System.out.println("Produto n„o encontrado.");
			  
					}	   			   		 
		
			public void relatorioGeral() {
			System.out.print("---------------------------------------------------------------------------------\n");
			System.out.printf("%6s %10s %10s %16s %16s %18s","codigo","Descricao","Qtd","Pre√ßo","Fabricante","Tipo Produto\n");
			System.out.print("---------------------------------------------------------------------------------\n");
			for(Produto lista: lista) {
					lista.info();
		}
		}
		
		public void produtoAlimenticio() {
			System.out.print("---------------------------------------------------------------------------------\n");
			System.out.printf("%6s %10s %10s %16s %16s %18s","codigo","Descricao","Qtd","Pre√ßo","Fabricante","Tipo Produto\n");
			System.out.print("---------------------------------------------------------------------------------\n");
			for(Produto p: lista) {
				if(p.getTipoProduto().equals("Alimenticio")) {
					p.info();
			}
			}
		}
		
		public void produtoBebida() {
			System.out.print("---------------------------------------------------------------------------------\n");
			System.out.printf("%6s %10s %10s %16s %16s %18s","codigo","Descricao","Qtd","Pre√ßo","Fabricante","Tipo Produto\n");
			System.out.print("---------------------------------------------------------------------------------\n");
					for(Produto p: lista) {
						if(p.getTipoProduto().equals("Bebida")) {
					p.info();
		}				
		}
		}
		public void produtoLimpeza() {
			System.out.print("---------------------------------------------------------------------------------\n");
			System.out.printf("%6s %10s %10s %16s %16s %18s","codigo","Descricao","Qtd","Pre√ßo","Fabricante","Tipo Produto\n");
			System.out.print("---------------------------------------------------------------------------------\n");
			for(Produto p: lista) {
				if(p.getTipoProduto().equals("Limpeza")) {
					p.info();
				}
			}
		}
		public void produtoHigiene() {
			System.out.print("---------------------------------------------------------------------------------\n");
			System.out.printf("%6s %10s %10s %16s %16s %18s","codigo","Descricao","Qtd","Pre√ßo","Fabricante","Tipo Produto\n");
			System.out.print("---------------------------------------------------------------------------------\n");
			for(Produto p: lista) {
				if(p.getTipoProduto().equals("Higiene")) {
					p.info();
				}
			}
		}
		public void produtoDiversos() {
			System.out.print("---------------------------------------------------------------------------------\n");
			System.out.printf("%6s %10s %10s %16s %16s %18s","codigo","Descricao","Qtd","Pre√ßo","Fabricante","Tipo Produto\n");
			System.out.print("---------------------------------------------------------------------------------\n");
			for(Produto p: lista) {
				if(p.getTipoProduto().equals("Diversos")) {
				p.info();
				}
			}
		}
		
		
}
