package colecoes;

import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String > fila = new LinkedList<>();

        // offer e add -> adicionam elementos  na fila
        //Difereça de comportamento ocorre quando a fila está cheia
        fila.add("Anna");// retotorna false
        fila.offer("Bia");//lança uma exceção
        fila.add("Carlos");
        fila.offer("Daniel");
         //Peek e Element -> obter o próximo elemento da fila sem remover

         // diferença é o comportamento ocorre quando a fila está vazia

         System.out.println(fila.peek());
         System.out.println(fila.element());

         //poll e remove - obter o próximo elemento da fila e remove
        
         System.out.println(fila.poll());
         System.out.println(fila.remove());
         //fila.size
         // fila.clear();
         //fila.isEmpty()
         //fila.contains(fila)
         
    }
    
}
