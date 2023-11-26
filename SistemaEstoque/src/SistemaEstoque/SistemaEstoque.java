package SistemaEstoque;
import java.util.*;


public class SistemaEstoque implements IProduto {

		ArrayList<Produto> lista = new ArrayList<Produto>();
		
		@Override
		public void adicionar() {
			 Scanner scan = new Scanner(System.in);
			 Scanner scan1 = new Scanner(System.in);
			
			   System.out.println("Cadastro de Produto:");
			
			   System.out.println("Código: ");
			   int codigo = scan.nextInt();
			   
			   System.out.print("Descrição: ");
			   String descricao = scan1.nextLine();

			   System.out.print("Preço: ");
			   double preco = scan.nextDouble();

			   System.out.print("Quantidade: ");
			   int quantidade = scan.nextInt();

			   System.out.print("Fabricante: ");
			   String fabricante = scan1.next();;
			   
			   System.out.print("Tipo de Produto\n 1 - Alimentício | 2 - Bebida | 3 - Limpeza | 4 - Higiene | 5 - Diversos \n");
			   String tipoProduto = scan.next();
			   
			   Produto p = new Produto(codigo,quantidade,descricao,preco,fabricante,tipoProduto);
			   lista.add(p);
			   
			   System.out.println("\nProduto cadastrado com sucesso!");
			   
		}
				
		@Override
		public void remover() {
			   System.out.println("Informe o código do produto que deseja remover ");
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
			   System.out.println("Informe o código do produto que deseja pesquisar ");
			   int codigo = scanner.nextInt();
			   int i=0;
			 
			   while(i<lista.size()) {
				   Produto p = lista.get(i);
				   if(p.getCodigo()==codigo) {
					   System.out.println("produto encontrado. \n"+p.ToString());
					   return;
				   }
				   i++;
			   }
			   System.out.println("Produto não encontrado.");
			   }
		
		public void relatorioGeral() {
			for(Produto lista: lista) {
				System.out.println(lista.ToString());
			}
		
		}
		public void produtoAlimenticio() {
			for(Produto p: lista) {
				if(p.getTipoProduto().equals("Alimenticio")) {
				System.out.println(p.ToString());
			}
			}
		}
		public void produtoBebida() {
					for(Produto p: lista) {
						if(p.getTipoProduto().equals("Bebida")) {
						System.out.println(p.ToString());
		}				
		}
		}
		public void produtoLimpeza() {
			for(Produto p: lista) {
				if(p.getTipoProduto().equals("Limpeza")) {
				System.out.println(p.ToString());
				}
			}
		}
		public void produtoHigiene() {
			for(Produto p: lista) {
				if(p.getTipoProduto().equals("Higiene")) {
				System.out.println(p.ToString());
				}
			}
		}
		public void produtoDiversos() {
			for(Produto p: lista) {
				if(p.getTipoProduto().equals("Diversos")) {
				System.out.println(p.ToString());
				}
			}
		}
		
}
