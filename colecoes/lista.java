package colecoes;
import java.util.ArrayList;
public class lista{
    public static void main(String[] args) {
        ArrayList<usuario> lista = new ArrayList<>();

        usuario u1 = new usuario("Anna");
        lista.add(u1);
        lista.add(new usuario("Carlos"));
        lista.add(new usuario("Henrique"));
        lista.add(new usuario("Lukas"));
        lista.add(new usuario("Kayo"));

        System.out.println(lista.get(3));

        for(usuario u: lista){
            System.out.println(u.nome);
        }
        

    }
}