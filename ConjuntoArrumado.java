package colecoes;

//import java.util.HashSet;
//import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoArrumado {
	public static void main(String[] args) {
	  //Set<String> lista = new HashSet<String>();
		SortedSet<String> lista = new TreeSet<String>();
	  lista.add("Ana");
	  lista.add("Henrique");
	  lista.add("João");
	  lista.add("Alice");
	  
	  for(String candidato:lista) {
		  System.out.println(candidato);
	  }
		
	}

}
