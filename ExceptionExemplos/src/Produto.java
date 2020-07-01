public class Produto {
	private int id;
	private String descricao;
	private float preco;
	
	public Produto() {
		super();
	}
	
	public Produto(int id, String descricao, float preco) {
		super();
		if (id <= 0 || descricao == null || descricao.length() == 0 || preco <= 0) {
			throw new RuntimeException("Dados invalidos para criar produto");
		}
		this.id = id;
		this.descricao = descricao;
		this.preco = preco;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id)  {
		if (id <= 0) {
			throw new IsiException("ID nao pode ser menor ou igual a 0");
		}
		this.id = id;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		if (descricao.length() == 0 || descricao == null) {
			throw new IsiException("Obrigatorio o cadastro da descricao");
		}
		this.descricao = descricao;
	}
	
	public float getPreco() {
		return preco;
	}
	
	public void setPreco(float preco) {
		if (preco <= 0) {
			throw new IsiException("Preco nao pode ser menor ou igual a zero");
		}
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", descricao=" + descricao + ", preco=" + preco + "]";
	}
	
	
	

}