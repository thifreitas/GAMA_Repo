
public class Conta {
	protected String nomeTitular;
	protected String cpf;
	protected int numConta;
	protected float saldo;
	
	public Conta(String nomeTitular, String cpf, int numConta, float saldo) {
		super();
		this.nomeTitular = nomeTitular;
		this.cpf = cpf;
		this.numConta = numConta;
		this.saldo = saldo;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public boolean debitar(float valor) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		}else {
			return false;
		}
	}
	
	public void creditar(float valor) {
		this.saldo = this.saldo + valor;
	}
	
	public String toString() {
		return "Conta: \nNomeTitular: "+nomeTitular+"\nCPF:"+cpf+"\nNumConta"+numConta+"\nSaldo R$ "+saldo+"\n";
	}
	
}
