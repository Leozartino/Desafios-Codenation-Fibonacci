package br.com.fibonacci;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

	List<Integer> listFibonacci = new ArrayList<Integer>();
	
	public List<Integer> criarFibonacci(int valor) {
		
		int a = 0;
        int b = 1;

        while(a <= valor){
            int c = a;
            a = b;
            b = c + b;
            listFibonacci.add(a);
        }
        
        return listFibonacci;
	}
	
	public Boolean isFibonacci(Integer numero) {

		if(!listFibonacci.contains(numero)) {
			return false;
		}
		return true;
	}
	
	public void exibirListFibonacci() {
		
		listFibonacci.stream().forEach(e -> System.out.println(e));
	}
}
