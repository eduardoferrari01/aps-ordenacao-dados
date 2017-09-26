package br.com.app.vetor;


public class Vetor  {

	private int[] vetor;

	public Vetor(int tamanho) {
		if (tamanho > 0) {
			vetor = new int[tamanho];
		} else {
			System.out.println("O vetor não pode ter tamanho negativo");
			vetor = new int[0];
		}
		addElemento();
	}
    private void addElemento() {
		
    	for (int i = 0; i < vetor.length; i++) {
		vetor[i] = (int) (Math.random() * (999999999 - 1)) + 1;

		}
	}
   public void exibirElemento() {
		if (vetor != null) {
			for (int i = 0; i < vetor.length; i++) {
				System.out.println("Elemento: " + vetor[i]);
			}
		}

	}
   public int getElemento(int posicao)
   {
	   return vetor[posicao];
   }
   public void alterarPosicao(int novaPosicao,int elemento)
   {
	   vetor[novaPosicao] = elemento;
   }
   public int size()
   {
	   return vetor.length;
   }
  

}
