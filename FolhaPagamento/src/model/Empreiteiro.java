package model;

public class Empreiteiro extends Funcionarios {
	private float valorEmpreita;

	public Empreiteiro(int numRegistro, String nome, float valorEmpreita) {
		super(numRegistro, nome);
		if (valorEmpreita <= 0) {
			throw new RuntimeException("Dados incorretos! - Empreiteiro");
		}
		this.valorEmpreita = valorEmpreita;
	}

	@Override
	public float calcularSalario() {
		return this.valorEmpreita;
	}

	public float getValorEmpreita() {
		return valorEmpreita;
	}

	public void setValorEmpreita(float valorEmpreita) {
		if (valorEmpreita <= 0) {
			throw new RuntimeException("Dados incorretos! - setComissao");
		}
		this.valorEmpreita = valorEmpreita;
	}
	

}
