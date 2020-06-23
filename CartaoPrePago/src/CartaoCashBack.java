
public class CartaoCashBack extends CartaoPrePago {
	private int tipo;
	public static final int GOLD=0;
	public static final int SILVER=1;
	public static final int BRONZE=2;
	public CartaoCashBack(String i, String nomeTitular, int anoValidade, int mesValidade, double saldo,
			int tipo) {
		super(i, nomeTitular, anoValidade, mesValidade, saldo);
		this.tipo = tipo;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public boolean Comprar (double valor) {
		if (valor <= this.saldo && tipo == 0) {
			this.saldo = this.saldo - valor;
			this.saldo = this.saldo + (valor * 0.08);
			System.out.println("OK!");
			return true;
		}else if (valor <= this.saldo && tipo == 1) {
			this.saldo = this.saldo - valor;
			this.saldo = this.saldo + (valor * 0.05);
			System.out.println("OK!");
			return true;
		}else if (valor <= this.saldo && tipo == 2) {
			this.saldo = this.saldo - valor;
			this.saldo = this.saldo + (valor * 0.03);
			System.out.println("OK!");
			return true;
		}else if (this.tipo > 2 || valor > this.saldo) {
			System.out.println("Erro na operação!");
			return false;
		}
		return false;
	}

	@Override
	public String toString() {
		return "CartaoPrePago numCartao=" + numCartao + "\nnomeTitular=" + nomeTitular + "\nanoValidade=" + anoValidade
				+ "\nmesValidade=" + mesValidade + "\nsaldo= R$" +String.format("%.2f", saldo)+"\nTipo:"+tipo;
	}

}
