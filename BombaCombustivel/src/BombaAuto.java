
public class BombaAuto {
	private double valorLitro;
	private double litros;
	private double total;
	private int tipo;
	private String nome;
	private BombaAuto lista[];
	
	public BombaAuto() {
		// TODO Auto-generated constructor stub
        this.lista = new BombaAuto[3];
        this.lista[0] = new BombaAuto(0,"Alcool      ", 2.50);
        this.lista[1] = new BombaAuto(1,"Gasolina    ", 1.70);
        this.lista[2] = new BombaAuto(2,"Diesel      ", 1.90);	
        
	}
	
	public String obterDisplay(){
        return "TIPO COMB:  \n""+
                 "[0] - "+lista[0].getNome()+"  R$"+lista[0].getPreco()+"\n"+
                 "[1] - "+lista[1].getNome()+"  R$"+lista[1].getPreco()+"\n"+
                 "[2] - "+lista[2].getNome()+"  R$"+lista[2].getPreco()+"\n"+
    }
	
	
}


public class AppPosto {
	public static void main(String args[]) {
		BombaDeCombustivel b1 = new BombaDeCombustivel("Gasolina", 4.39);
		
		b1.abastecerPorLitro(45);
		b1.exibirRecibo();
		
		System.out.println("\n\n");
		b1.abastecerPorValor(150.0);
		b1.exibirRecibo();
	}

}

/*
public class BombaDeCombustivel {
	private String nome;
	private double vlLitro;
	private double vlTotal;
	private double qtdLitros;
	public BombaDeCombustivel(String nome, double vlLitro) {
		super();
		this.nome = nome;
		this.vlLitro = vlLitro;
		this.vlTotal = 0.0;
		this.qtdLitros = 0.0;
	}
	

	public void abastecerPorLitro(double qtdLitros) {
		this.qtdLitros = qtdLitros; 
		this.vlTotal = qtdLitros*vlLitro;
	}
	
	public void abastecerPorValor(double total) {
		this.vlTotal = total;
		this.qtdLitros = total/vlLitro;
	}
	
	public void exibirRecibo() {
		System.out.println("******* Posto IsidroCorp Gas & Energy ****");
		System.out.println(" Combustivel    "+nome);
		System.out.println(" Valor Litro R$ "+String.format("%.2f",vlLitro));
		System.out.println(" Quantidade     "+String.format("%.5f",qtdLitros));
		System.out.println(" Valor Total R$ "+String.format("%.2f",vlTotal));
		System.out.println("******************************************");
	}
}*/