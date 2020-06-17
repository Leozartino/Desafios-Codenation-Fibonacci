package br.com.fibonacci;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

	List<Integer> listFibonacci = new ArrayList<Integer>();
	
	public List<Integer> criarFibonacci() {
		
	Integer a = 0;
        Integer b = 1;
	Integer valor = 378;

        while(a <= valor){
            Integer c = a;
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
	

}
