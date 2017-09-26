package br.com.app.ordenacao;

import br.com.app.menu.IMenu;
import br.com.app.vetor.Vetor;

public class ShellSort implements Ordena, IMenu {

	public static void shellSort(Vetor vetor) {
	    int h = 1;
	    
	    
	    while(h < vetor.size()) {
	            h = h * 3 + 1;
	    }
	    
	    h = h / 3;
	    int c, j;
	    
	    while (h > 0) {
	        for (int i = h; i < vetor.size(); i++) {
	            c = vetor.getElemento(i);
	            j = i;
	            while (j >= h && vetor.getElemento(j - h) > c) {
	                vetor.alterarPosicao(j, vetor.getElemento(j - h));
	            	j = j - h;
	            }
	            vetor.alterarPosicao(j, c);
	        }
	        h = h / 2;
	    }
	}

	@Override
	public void ordenar(Vetor vetor) {

		shellSort(vetor);

	}
	@Override
	public String menu() {
		
		return "Ordenar usando o ShellSort";
		
	}
	
}
