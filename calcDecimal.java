import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

public class calcDecimal {

	public int calcular(String valorEntrada) {
		
		char[] b = valorEntrada.toCharArray();
		int p = 0; 
		int temp = 0; 
		int decimal = 0; 
		for (int i = b.length -1 ; i >= 0 ; i-- ) {
			temp = (int)Math.pow(2, p);
			p ++;
			if (b[i] == '1') {
				decimal = decimal + temp; 
			}
		}
		return decimal;
		
	}

}
