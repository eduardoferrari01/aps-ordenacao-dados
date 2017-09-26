package br.com.app.menu;
import java.util.Scanner;

import br.com.app.ordenacao.FabricaOrdenacao;
import br.com.app.vetor.Vetor;

public class Menu {

	private Scanner ler = new Scanner(System.in);
	public Vetor vetor ;
	
	public int menuPrinc()
	{
		System.out.println("1 - Adicionar os elementos");
		System.out.println("2 - Escolher a ordenacão");
		System.out.println("3 - Exibir Elementos ");
		System.out.println("0 - Sair\n ");
		System.out.print("Digite a opção: ");
		return ler.nextInt();
	 }
	 public void menu()
	 {
          int opc = 1;
			while(opc != 0)
			{
		        switch(menuPrinc())
				{
	     			case 1:
				         System.out.print("Digite o tamanho do vetor: ");
				         vetor =  new Vetor((ler.nextInt()));
	     		    	 break;
				    case 2:
				    	 new FabricaOrdenacao().tipoDeOrdernacao(vetor);
				    	 break;
				    case 3:
				    	vetor.exibirElemento();
				    	break;
				    case 0:
				    	 System.out.println("Saindo...");
					     System.exit(1);
					    break;
				   default :
					   System.out.println("Opção Invalida"); 
				        break;
				}
			}
	    }
	}
