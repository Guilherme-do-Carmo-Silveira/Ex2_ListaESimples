package view;

import controller.OpController;
import docarmo.listaEncadeadaInt.Lista;

public class main {

	public static void main(String[] args) {
		
		OpController c = new OpController();
		
		Lista la = new Lista();
		Lista lb = new Lista();
		
//		Primeira lista (A)
		
		la.addFirst(3);
		try {
			la.addLast(5);
			la.addLast(8);
			la.addLast(12);
			la.addLast(9);
			la.addLast(7);
			la.addLast(16);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		Primeira lista (B)
		
		lb.addFirst(9);
		try {
			lb.addLast(6);
			lb.addLast(2);
			lb.addLast(3);
			lb.addLast(7);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		c.interseccao(la, lb);
		c.uniao(la, lb);

	}

}
