package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		conjunto.add(1.2);// double -> Double
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(5);
		conjunto.add('x');
		
		System.out.println("Tamanho é: " + conjunto.size());
		
		conjunto.add("teste");
		conjunto.add('x');
		System.out.println("Tamanho é: " + conjunto.size());
		System.out.println( conjunto.remove("teste"));
		System.out.println( conjunto.remove("Teste"));
		System.out.println("Tamanho é: " + conjunto.size());
		
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		conjunto.addAll(nums);
		System.out.println(conjunto);
		conjunto.retainAll(nums);
		System.out.println(conjunto);
		conjunto.clear();
		System.out.println(conjunto);
		
	}

}
