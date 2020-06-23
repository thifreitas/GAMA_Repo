
public class BombaCombustivel {
	private double valor;
	private double litros;
	private double total;
	private int tipo;
	private String nome;
	
	public BombaCombustivel(double litros, double total, int tipo) {
			this.litros = litros;
			this.total = total;
			this.tipo = tipo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setLitros(double litros) {
		this.litros = litros;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getLitros() {
		return litros;
	}
	public void setLitros(int litros) {
		this.litros = litros;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public double calculaTotal(double a, double b) {
		if (a != 0) {
			this.total = a * this.valor;
			this.litros = a;
		}else if (a == 0 && b != 0 ) {
			this.total = b;
			this.litros = b / this.valor;
		}
		return this.total;
	}
	
	public void tipoComb(int tipo) {
		if (tipo == 1) {
			this.valor = 3.5;
			this.nome = "Alcool";
		}else if (tipo == 2) {
			this.valor = 1.9;
			this.nome = "Gasolina";
		}else if (tipo == 3) {
			this.valor = 0.9;
			this.nome = "Diesel";
		};
	}
	
	
}
