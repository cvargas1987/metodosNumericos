

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class calcBinario {
	
	public String calcular (int valorEntrada) {
		String signo = "";
		String valorSalida = ""; 
		int bitTemp = 0;  
		int temp = 0 ; 
		ArrayList<Integer> listaInt = new ArrayList<>(); // lista de enteros
		ArrayList<Integer> listaBinarios = new ArrayList<>(); // lista de binarios positivos
		
		
		if (valorEntrada < 0) {
			signo = "1";
		}else {
			signo = "0";
		}
		valorEntrada = Math.abs(valorEntrada); 
		// primera lista de numeros enteros elevados a la 2 
		for (int i = 0 ; (int)Math.pow(2, i) < valorEntrada ; i++ ) {
				temp  = (int)Math.pow(2, i);
				listaInt.add(temp);
			}
		
		// se recorre la lista de atras para adelante para crear lista de numero binario. 
		ListIterator it = listaInt.listIterator(listaInt.size());
		bitTemp = valorEntrada;
		while (it.hasPrevious()) {
			int i = (int)it.previous(); 
				if (i <= bitTemp) {
					listaBinarios.add(1);
					bitTemp = bitTemp - i;
				}else {
					listaBinarios.add(0);
				}
			}
		
		if (signo == "1") { // cuando el valor es negativo se intercambian los uno por lo ceros.
			for (int i = 0 ; listaBinarios.size() > i ; i++) {
				if (listaBinarios.get(i) == 0) {
					listaBinarios.set(i,1);
				}else {
					listaBinarios.set(i,0);
				}
			}
			
			// suma de numeros binarios
			int acarreo = 1; 
			int r = 0;
			int valorLista = 0;
			int i = listaBinarios.size(); 
			
			ListIterator itB = listaBinarios.listIterator(listaBinarios.size());
			while (itB.hasPrevious()) {
				i = i -1; 
				valorLista = (int)itB.previous(); 
				
				if (acarreo == 1) {
					r = (valorLista + 1);
					acarreo = 0; 
					
					if (r == 1)
						listaBinarios.set(i, 1);
					
					if (r > 1) {
						listaBinarios.set(i, 0);
						acarreo = 1; 
					}
				}
			}
		}
	
		for ( int l : listaBinarios) {
			valorSalida = valorSalida + l; 
		}
			
		if (valorSalida.length() < 15) {
			int cantCeros = (15 - valorSalida.length());
			for (int i = 0 ; i < cantCeros; i++) {
				valorSalida = (signo + valorSalida); 
				}
			}
		return valorSalida;
	}
}
