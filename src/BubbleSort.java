
public class BubbleSort implements Ordena, IMenu {

	private void bubbleSort(Vetor vetor) {
		
		int aux;
		try {
			for (int i = 0; i < vetor.size(); i++) {
				for (int x = 0; x < (vetor.size() - 1); x++) {

					if (vetor.getElemento(x) > vetor.getElemento(x + 1)) {
						aux = vetor.getElemento(x);
						vetor.alterarPosicao(x, vetor.getElemento(x + 1));
						vetor.alterarPosicao(x + 1, aux);
					}
				}
			}
		} catch (NullPointerException ms) {
			System.out.println("Erro: " + ms.getMessage());
		} catch (Exception ms) {
			System.out.println("Erro: " + ms.getMessage());
		}
		

	}

	@Override
	public void ordenar(Vetor vetor) {

		bubbleSort(vetor);
	}

	@Override
	public String menu() {
		return "Ordenar usando o Bubble Sort";

	}

}
