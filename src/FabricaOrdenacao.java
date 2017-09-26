import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FabricaOrdenacao {

	private Scanner ler = new Scanner(System.in);

    private Map keyCodes = new HashMap();
		
	public FabricaOrdenacao()
	{
	 keyCodes.put(1, new ShellSort());
	 keyCodes.put(2, new InsertionSort());
	 keyCodes.put(3, new BubbleSort());
	 keyCodes.put(4, new SelectionSort());
	 keyCodes.put(5, new MergeSort());
	
	}
   
	public void tipoDeOrdernacao (Vetor vetor)
   {
	   for(int i = 1 ; i <= keyCodes.size(); i++)
		{
			IMenu m = (IMenu) keyCodes.get(i);
			System.out.println(i + " - " + m.menu());
		}
		Ordena ordena = (Ordena) keyCodes.get(ler.nextInt());
		
		
		System.out.println("Aguarde....");
		long tempoInicial = System.currentTimeMillis();
		ordena.ordenar(vetor);
		long tempoFinal = System.currentTimeMillis();
		System.out.println("Completo");
		
		System.out.println("Tempo Total: " + (tempoFinal - tempoInicial));
		
   }
}
