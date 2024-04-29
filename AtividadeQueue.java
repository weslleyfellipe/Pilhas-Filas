package colecoes;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AtividadeQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> fila = new LinkedList<String>();
		 Scanner leia = new Scanner(System.in);
		 
		 
		 int Menu;
		 
		 do {
			 System.out.println();
		 System.out.println("\nMenu:");
         System.out.println("1: Adicionar Cliente na Fila");
         System.out.println("2: Listar Todos os Clientes");
         System.out.println("3: Retirar Cliente da Fila");
         System.out.println("0: Sair ");

         System.out.println("\nEntre com a opção desejada: ");
         
         Menu = leia.nextInt();
        
         switch(Menu) {
             case 1:
             leia.nextLine(); 
             System.out.print("Digite o nome do cliente : ");
             String nome = leia.nextLine();
             fila.add(nome);
             System.out.println("Cliente Adicionado!" );
             System.out.print(nome);
             break;
             
             case 2 :
            	 System.out.println("Lista de Clientes na fila");
            	 for (String cliente : fila) {
                     System.out.println(cliente);
                    
            	 } 
           break;
            
             case 3:
          if (!fila.isEmpty()) {
            System.out.println("\nA Fila:" + fila);
            String lista = fila.poll();
                      System.out.println("O Cliente " + lista + " foi Chamado!");
           } else {
        	   System.out.println("\nA Fila está vazia!");
        	   
           }
          break;
           case 0:
           System.out.println("\nPrograma Finalizado!");
           break;    
         }
         

			 } while (Menu != 0); 
		 
		 leia.close();
         
	}
		 
}      
        
         
    
	


