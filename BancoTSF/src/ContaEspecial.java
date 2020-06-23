
public class ContaEspecial extends Conta {
	private float limite;
	
	public ContaEspecial(String titular, String cpf, int nc, float saldo, float lim) {
		super(titular,cpf,nc,saldo);
		this.limite = lim;
	}
	
	public boolean debitar(float valor)
	{
		if (valor <= this.limite + super.saldo) {
			super.saldo = super.saldo - valor;
			return true;
		}else {
			return false;
		}
	}
	
	public String toString() {
		return "Conta: \nNomeTitular: "+nomeTitular+"\nCPF:"+cpf+"\nNumConta"+numConta+"\nSaldo R$ "+saldo+"\nLimit:"+limite;
	}
}
