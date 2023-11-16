package proj_estoque;

public class Produto {
	private int codigo;
	private String descricao;
	private double preco;
	private String fornecedor;
	private String validade;
	private String lote;
	private String fabricante;
	
	Produto(){
		
	}
	
	Produto(int codigo1, String descricao1, double preco1, String fornecedor1, String validade1, String lote1, String fabricante1){
		
		this.codigo = codigo1;
		this.descricao = descricao1;
		this.preco = preco1;
		this.fornecedor = fornecedor1;
		this.lote = lote1;
		this.validade = validade1;
		this.fabricante = fabricante1;
	}
	
	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getValidade() {
		return validade;
	}

	public void setValidade(String validade) {
		this.validade = validade;
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
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

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	public void cadastrarProduto(int codigo1, String descricao1, double preco1, String fornecedor1, String validade1, String lote1, String fabricante1){ {
		this.codigo = codigo1;
		this.descricao = descricao1;
		this.preco = preco1;
		this.fornecedor = fornecedor1;
		this.lote = lote1;
		this.validade = validade1;
		this.fabricante = fabricante1;
	}
	
	}
}



