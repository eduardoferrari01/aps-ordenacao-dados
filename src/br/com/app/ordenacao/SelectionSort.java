package br.com.app.ordenacao;

import br.com.app.menu.IMenu;
import br.com.app.vetor.Vetor;

public class SelectionSort implements Ordena, IMenu {

	public void ordenarVetor(Vetor vetor) {
		int aux;
		try {
			for (int i = 0; i < vetor.size(); i++) {
				for (int x = i + 1; x < vetor.size(); x++) {
					if (vetor.getElemento(i) > vetor.getElemento(x)) {
						aux = vetor.getElemento(i);
						vetor.alterarPosicao(i, vetor.getElemento(x));
						vetor.alterarPosicao(x, aux);
					}
				}
			}
		} catch (NullPointerException ms) {
			System.out.println("Erro vetor: " + ms.getMessage());
		} catch (Exception ms) {
			System.out.println("Erro: " + ms.getMessage());
		}
	}

	@Override
	public void ordenar(Vetor vetor) {

		ordenarVetor(vetor);

	}

	@Override
	public String menu() {
		return "Ordenar usando o Selection Sort";
	}

}
