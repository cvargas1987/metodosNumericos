package proyecto1;

public class digitoValidar {
	
	public boolean ejecutar (String valorEntrada, int sw){
		if (sw == 1) {
			char [] validarDig = valorEntrada.toCharArray();
			
			int dig = 0; 
			for (int i = 0 ; i < validarDig.length ; i++) {
				dig = Character.getNumericValue(validarDig[i]);
				if (dig > 1)
					return false; 
			}
			return true;
		}else {
			try {
				int validarDig = Integer.parseInt(valorEntrada);
				return true; 
			} catch (NumberFormatException e) {
				return false; 
			}
		}
			
	}
}
