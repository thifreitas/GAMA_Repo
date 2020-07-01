package model;

public class Comissionado extends Funcionarios {
	private float salarioBase;
	private float comissao;
	public Comissionado(int numRegistro,String nome,float salarioBase, float comissao) {
		super(numRegistro,nome);
		if (salarioBase <= 0 || comissao <= 0) {
			throw new RuntimeException("Dados incorretos! - Comissionado");
		}
		this.salarioBase = salarioBase;
		this.comissao = comissao;
	}
	@Override
	public float calcularSalario() {
		return this.salarioBase + ((this.salarioBase * this.comissao)/100);
	}
	public float getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(float salarioBase) {
		if (salarioBase <= 0 ) {
			throw new RuntimeException("Dados incorretos! - setSalario");
		}
		this.salarioBase = salarioBase;
	}
	public float getComissao() {
		return comissao;
	}
	public void setComissao(float comissao) {
		if (comissao <= 0) {
			throw new RuntimeException("Dados incorretos! - setComissao");
		}
		this.comissao = comissao;
	}


}
