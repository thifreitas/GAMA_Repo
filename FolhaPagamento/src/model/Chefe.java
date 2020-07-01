package model;

public class Chefe extends Funcionarios {
	private float salarioBase;
	private float adicionalFuncao;
	private float beneficioTerno;
	
	public Chefe(int numRegistro, String nome,float salarioBase, float adicionalFuncao, float beneficioTerno) {
		super(numRegistro,nome);
		if ( salarioBase <= 0 || adicionalFuncao <= 0 || beneficioTerno <= 0) {
			throw new RuntimeException("Dados incorretos! - Chefe");
		}
		this.salarioBase = salarioBase;
		this.adicionalFuncao = adicionalFuncao;
		this.beneficioTerno = beneficioTerno;
	}
	public float getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(float salarioBase) {
		if (salarioBase <= 0) {
			throw new RuntimeException("Dados incorretos! - setSalario");
		}
		this.salarioBase = salarioBase;
	}
	public float getAdicionalFuncao() {
		return adicionalFuncao;
	}
	public void setAdicionalFuncao(float adicionalFuncao) {
		if (adicionalFuncao <= 0 ) {
			throw new RuntimeException("Dados incorretos! - setAdicional");
		}
		this.adicionalFuncao = adicionalFuncao;
	}
	public float getBeneficioTerno() {
		return beneficioTerno;
	}
	public void setBeneficioTerno(float beneficioTerno) {
		if (beneficioTerno <= 0 ) {
			throw new RuntimeException("Dados incorretos! - setBeneficio");
		}
		this.beneficioTerno = beneficioTerno;
	}
	@Override
	public float calcularSalario() {
		return this.salarioBase + ((this.salarioBase * this.adicionalFuncao)/100) + this.beneficioTerno;
	}

	
}
