package br.com.app.ordenacao;

import br.com.app.menu.IMenu;
import br.com.app.vetor.Vetor;

public class MergeSort  implements Ordena,IMenu {

	
	private int[] vetorAux;
	private void merge(Vetor vetor,int comeco,int meio ,int fim,int vetAux[])
	{
		int esq = comeco;
		int dir = meio;
		for(int i = comeco; i < fim; i++)
		{
			if((esq < meio) && ((dir >= fim) || (vetor.getElemento(esq) < vetor.getElemento(dir)))) {
				vetorAux[i] = vetor.getElemento(esq);
				++esq;
			}else
			{
				vetorAux[i] = vetor.getElemento(dir);
				++dir;
			}
		}
		for(int i = comeco; i < fim; i++)
		{
			
			vetor.alterarPosicao(i, vetorAux[i]) ;
		}
	}
	private void mergeSort(Vetor vetor,int comeco,int fim, int[] vetorAux)
	{
		if( (fim - comeco) < 2) return;
		
		int meio = (int) ((comeco + fim) / 2);
		mergeSort(vetor,comeco,meio,vetorAux);
		mergeSort(vetor,meio,fim,vetorAux);
		merge(vetor,comeco,meio,fim,vetorAux);
		
	}
	@Override
	public void ordenar(Vetor vetor) {
		
		vetorAux = new int[vetor.size()];
		mergeSort(vetor,0,vetor.size(),vetorAux);
	}
	@Override
	public String menu() {
		// TODO Auto-generated method stub
		return "Ordenar usando o Merge Sort";
	}
	
}
