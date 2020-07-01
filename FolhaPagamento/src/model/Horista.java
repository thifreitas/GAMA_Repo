package model;

public class Horista extends Funcionarios {
	private float valorHora;
	private int numeroHoras;
	public Horista(int numRegistro, String nome, float valorHora, int numeroHoras) {
		super(numRegistro, nome);
		if (valorHora <= 0 || numeroHoras <= 0) {
			throw new RuntimeException("Dados incorretos!");
		}
		this.valorHora = valorHora;
		this.numeroHoras = numeroHoras;
	}
	@Override
	public float calcularSalario() {
		return this.valorHora * this.numeroHoras;
	}
	public float getValorHora() {
		return valorHora;
	}
	public void setValorHora(float valorHora) {
		if (valorHora <= 0 ) {
			throw new RuntimeException("Dados incorretos!");
		}
		this.valorHora = valorHora;
	}
	public int getNumeroHoras() {
		return numeroHoras;
	}
	public void setNumeroHoras(int numeroHoras) {
		if (numeroHoras <= 0) {
			throw new RuntimeException("Dados incorretos! - setHoras");
		}
		this.numeroHoras = numeroHoras;
	}

}
