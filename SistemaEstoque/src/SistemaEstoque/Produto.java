package SistemaEstoque;

public class Produto {
	
		private int codigo, qtd ;
		private double preco;
		private String tipoProduto, descricao, fabricante;
			
		Produto(){	
		}
		
		Produto(int codigo, int qtd, String descricao, double preco, String fabricante, String tipoProduto){
			
			this.codigo = codigo;
			this.descricao = descricao;
			this.preco = preco;
			this.qtd = qtd;
		    this.fabricante = fabricante;
			this.tipoProduto = tipoProduto;
		}
		
		public String getFabricante() {
			return fabricante;
		}

		public void setFabricante(String fabricante) {
			this.fabricante = fabricante;
		}


		public int getCodigo() {
			return codigo;
		}

		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		public double getPreco() {
			return preco;
		}

		public void setPreco(double preco) {
			this.preco = preco;
		}

		public int getQtd() {
			return qtd;
		}

		public void setQtd(int qtd) {
			this.qtd = qtd;
		}
		
		public String getTipoProduto() {
			
			 if(tipoProduto.equals("1")) {
				tipoProduto = "Alimenticio";
				
			}if(tipoProduto.equals("2")){
				tipoProduto = "Bebida";
				
			}if(tipoProduto.equals("3")) {
				tipoProduto="Limpeza";
				
			}if(tipoProduto.equals("4")) {
				tipoProduto="Higiene";
			}
			else if(tipoProduto.equals("5")) {
				tipoProduto="Diversos";
			}
			return tipoProduto;
		}

		public void setTipoProduto(String tipoProduto) {
			this.tipoProduto = tipoProduto;
		}
		
		public String ToString() {
		
			return "Produto do tipo "+getTipoProduto()+", "+descricao+" da marca "+fabricante+", com preço unitário de R$ "+preco+", possui "+qtd+" unidade/s em estoque.";
		}
		
		public void tabelaInfo() {
			String format = "%-10s | %-20s | %15s\n";
			System.out.format(format,codigo,descricao,tipoProduto);
		}

}
