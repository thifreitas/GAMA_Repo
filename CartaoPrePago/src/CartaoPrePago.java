
public class CartaoPrePago {
	protected String numCartao;
	protected String nomeTitular;
	protected int anoValidade;
	protected int mesValidade;
	protected double saldo;
	
	public CartaoPrePago(String i, String nomeTitular, int anoValidade, int mesValidade, double saldo) {
		super();
		this.numCartao = i;
		this.nomeTitular = nomeTitular;
		this.anoValidade = anoValidade;
		this.mesValidade = mesValidade;
		this.saldo = saldo;
	}
	public String getNumCartao() {
		return numCartao;
	}
	public void setNumCartao(String numCartao) {
		this.numCartao = numCartao;
	}
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public int getAnoValidade() {
		return anoValidade;
	}
	public void setAnoValidade(int anoValidade) {
		this.anoValidade = anoValidade;
	}
	public int getMesValidade() {
		return mesValidade;
	}
	public void setMesValidade(int mesValidade) {
		this.mesValidade = mesValidade;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void adicionarCredito(double valor) {
		if (valor <= 0 ) {
			throw new CardException("Valor nao permitido!");
		}
		this.saldo = valor;
	}
	
	public boolean Comprar (double valor) {
		if (valor <= 0) {
			throw new CardException("Valor nao pode ser inferior ao saldo!");
		}
		if (valor <= this.saldo) {
			this.saldo = this.saldo - valor;
			System.out.println("OK!");
			return true;
		}else {
			return false;
		}
	}
	@Override
	public String toString() {
		return "CartaoPrePago numCartao=" + numCartao + "\nnomeTitular=" + nomeTitular + "\nanoValidade=" + anoValidade
				+ "\nmesValidade=" + mesValidade + "\nsaldo= R$" +String.format("%.2f", saldo);
	}
	
	
}
