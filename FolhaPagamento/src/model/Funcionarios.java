package model;

public abstract class Funcionarios {
	protected String nome;
	protected int numRegistro;
	
	public Funcionarios(int numRegistro, String nome) {
		if (numRegistro <=0 || nome == null || nome.length() <= 2) {
			throw new RuntimeException("Dados incorretos - Funcionario!");
		}
		this.numRegistro = numRegistro;
		this.nome = nome;
	}
	
	public abstract float calcularSalario();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumRegistro() {
		return numRegistro;
	}

	public void setNumRegistro(int numRegistro) {
		this.numRegistro = numRegistro;
	}

	@Override
	public String toString() {
		return "Nome=" + nome + "\nNum =" + numRegistro;
	}
	
	
	
}
