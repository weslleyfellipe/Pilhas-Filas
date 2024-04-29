package colecoes;

import java.util.Scanner;
import java.util.Stack;

public class AtividadePilha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		Stack<String> livros = new Stack<String>();
		
	     
		 int Menu = -1;
		 while (Menu !=0) {
			 
		
		 System.out.println("\nMenu:");
	     System.out.println("1: Adicionar livro na pilha");
	     System.out.println("2: Listar todos os livros ");
	     System.out.println("3: Retirar livro da pilha");
	     System.out.println("0: Finalizar o programa");
	     System.out.print("Digite uma opção: ");
        
	     Menu = leia.nextInt();
	    
	      
	     switch(Menu) {
         case 1:
         leia.nextLine(); 
         System.out.print("\nDigite o nome do livro : ");
         String nome = leia.nextLine();
         livros.add(nome);
         System.out.println("Livro Adicionado!" );
         System.out.print(nome);
         break;
	    
         case 2:
          System.out.println("\nLista de Livros");
           for (String objeto : livros) {
           System.out.println( objeto);
               	
           } 
           break;
	     
         case 3:
        	 if(!livros.isEmpty()) {
        	 System.out.println("\nRetirar o livro da pilha");
        	 livros.pop();
        	 System.out.println( livros );
        	 } else {
          	   System.out.println("\nA Lista de livros está vazia !");
        	 
	     
        	 }
        	 break;
             case 0:
             System.out.println("\nPrograma Finalizado!");
             break;    
             
	     }
	   
	      
		 }  
		
		 
		 
	}
}
