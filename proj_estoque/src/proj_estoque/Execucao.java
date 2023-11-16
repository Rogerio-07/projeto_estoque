package proj_estoque;
import java.util.*;
public class Execucao {
	
	public static void main(String[] args) {
		int saldo = 0;
		int novosaldo = 0;
		int numero=0;
		int codigo;
		int quantidade;
		
		Scanner ler = new Scanner (System.in);
		
		while(numero!=9) {
			
		System.out.println("Selecione a opção desejada: \n 1: Adicionar produto \n 2: Remover produto \n 3: Pesquisar produto \n 9: para encerrar \n");
		numero = ler.nextInt();
	
			
		if(numero==1) {
			System.out.println("informe o código do produto que deseja adicionar: ");
			codigo = ler.nextInt();
			
			System.out.println("informe a quantidade que deseja adicionar: ");
			quantidade = ler.nextInt();

			saldo = saldo + quantidade;
			novosaldo = saldo;
			
			System.out.println("Produto de código "+codigo+" possui saldo: "+novosaldo+ " unidades. \n");
		}
	
		if(numero==2) {
			System.out.println("informe o código do produto que deseja remover: ");
			codigo = ler.nextInt();
			
			System.out.println("informe a quantidade que deseja remover: ");
			quantidade = ler.nextInt();
			
			if(quantidade>saldo) {
				System.out.println("saldo insuficiente");
				System.out.println("Produto de código "+codigo+" possui saldo: "+saldo+" \n");
			}
			
			else if(quantidade<saldo) {
				saldo = saldo - quantidade;
				System.out.println("Produto de código "+codigo+" possui saldo: "+saldo+" \n");
				
			}
			
			if(saldo==0) {
				System.out.println("Saldo é 0.");

			}//else {
				//novosaldo = saldo;
				//System.out.println("o Saldo do produto atualizado é: "+novosaldo);
			//}
		}
		if(numero==3) {
			System.out.println("informe o código do produto que deseja pesquisar: ");
			codigo = ler.nextInt();
			
			System.out.println("produto "+codigo+" possui saldo: "+saldo+" \n");
			
		}
		
		if(numero==9) {
			
			System.out.println("a encerrar a aplicação.");
			break;
		}
		
		}
	}


}
