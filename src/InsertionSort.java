
public class InsertionSort implements Ordena, IMenu {
	
	public void ordenarVetor(Vetor vetor)
    {
	   int cont;
	   System.out.println("Aguarde....");
	   long tempo1 = System.currentTimeMillis();
	   try{
		for(int i  =1 ; i < vetor.size(); i++)
	    { 
		   
		   int aux = vetor.getElemento(i);
		   cont = i;
		   
		   while(cont > 0 && vetor.getElemento(cont -1) >= aux)
		   {
			   
			     vetor.alterarPosicao(cont, vetor.getElemento(cont - 1));
			   --cont;
		   }
		   	vetor.alterarPosicao(cont, aux);
	   }
	   }
	   catch(NullPointerException ms){System.out.println("Erro vetor: " + ms.getMessage()); }
	   catch(Exception ms ) {System.out.println("Erro: " + ms.getMessage()); }
	   
	   long tempo2 = System.currentTimeMillis();
	   System.out.println("Completo");
	   System.out.println("Tempo total: " + (tempo1 - tempo2) / 1000.0 + " s");
	  
   }

	@Override
	public void ordenar(Vetor vetor) {
	   
		ordenarVetor(vetor);
		
	}

	@Override
	public String menu() {
		// TODO Auto-generated method stub
		return "Ordenar usando o Insertion Sort";
	}


}
