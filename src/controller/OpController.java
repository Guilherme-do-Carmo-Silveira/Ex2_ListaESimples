package controller;

import docarmo.listaEncadeadaInt.Lista;

public class OpController {

	public OpController() {
		super();
	}

	public void interseccao(Lista la, Lista lb) {

		Lista I = new Lista();

		int tam = lb.size();
		int tama = la.size();
		boolean status = false; // não deixa colocarnumeros iguais
		for (int i = 0; i < tam; i++) {
			status = false;
			for (int cta = 0; cta < tama; cta++) {
				try {
					if (status == false) {
						if (lb.get(i) == la.get(cta)) {
							I.addFirst(lb.get(i));
							status = true;
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

		System.out.print("A lista com intersecção ficou: ");
		int tamI = I.size();
		for (int i = 0; i < tamI; i++) {
			try {
				System.out.print(I.get(i) + " ");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	public void uniao(Lista la, Lista lb) {

		Lista U = new Lista();
		
		int i = 0;
		int tama = la.size(), tamb = lb.size();

		while (i < tama) {
			if(i == 0) {
			try {
				U.addFirst(la.get(i));
				i++;
			} catch (Exception e) {
				e.printStackTrace();
			}
			}else {
				try {
					U.add(la.get(i), i);
					i++;
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		}
		
		i = 0;
		
		while (i < tamb) {
			try {
				U.add(lb.get(i), i);
				i++;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.print("\nA lista com uniao ficou: ");
		
		int tam = U.size();
		
		for(i = 0; i < tam; i++) {
			try {
				System.out.print(U.get(i) + " ");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
