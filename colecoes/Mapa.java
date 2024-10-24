package colecoes;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa{
    public static void main(String[] args) {
      Map< Integer, String> usuarios = new HashMap<>(); 
      usuarios.put(1, "Henrique");  
      usuarios.put(2, "Ana"); 
      usuarios.put(3, "Isa"); 
      usuarios.put(4, "Maria"); 
      System.out.println(usuarios.size());
      System.out.println(usuarios.isEmpty());

      System.out.println(usuarios.keySet());
      System.out.println(usuarios.values());  
      System.out.println(usuarios.entrySet());
      
      System.out.println(usuarios.containsValue("Henrique"));
      System.out.println(usuarios.containsKey(3));
      System.out.println(usuarios.get(4));
      System.out.println(usuarios.remove(4));

      for(int chave: usuarios.keySet()){
        System.out.println(chave);
      }
      for(String valor: usuarios.values()){
        System.out.println(valor);
      }

      for(Entry<Integer, String> registro: usuarios.entrySet()){
        System.out.println(registro.getKey() + "==>");
        System.out.println(registro.getValue());
      }
    }
}