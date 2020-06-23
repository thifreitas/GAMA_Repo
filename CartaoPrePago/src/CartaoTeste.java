
public class CartaoTeste {

	public static void main(String[] args) {
		/*CartaoPrePago c,c1;
		c = new CartaoPrePago("001","Thiago Freitas",2020,12,50);
		c1 = new CartaoCashBack("002","Jao Freitas",2020,12,50,1);*/
		
		CartaoPrePago cartoes[] = new CartaoPrePago[4];
		cartoes[0] = new CartaoPrePago("003","Tiao Freitas",2024,11,2450);
		cartoes[1] = new CartaoCashBack("004","Jao Silva",2024,11,450,CartaoCashBack.BRONZE);
		cartoes[2] = new CartaoCashBack("005","Dan Saltos",2024,11,500,CartaoCashBack.SILVER);
		cartoes[3] = new CartaoCashBack("008","Matt Pereira",2028,8,800,CartaoCashBack.GOLD);
		
		
		for (CartaoPrePago q : cartoes) {
			System.out.println(q);
			System.out.println("-----------");
		}
		
		for (CartaoPrePago q : cartoes) {
			q.Comprar(125);
			System.out.println("-----------");
		}
		
		for (CartaoPrePago q : cartoes) {
			System.out.println(q);
			System.out.println("-----------");
		}
		
		/*
		System.out.println("----------------");
		System.out.println(c);
		System.out.println("----------------\n");
		System.out.println(c1);
		System.out.println("----------------");
		
		c.Comprar(25);
		c1.Comprar(5.8);
		c1.Comprar(5.9);
		c.Comprar(5.9);
		c1.Comprar(5.5);
		
		System.out.println("----------------");
		System.out.println(c);
		System.out.println("----------------\n");
		System.out.println(c1);
		System.out.println("----------------");
		*/
	}
}