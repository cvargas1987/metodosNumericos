import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import proyecto1.digitoValidar;

public class principal implements Initializable{
	@FXML private Button btn_calc_binario;
	@FXML private Button btn_calc_decimal;
	@FXML private Label lb_respuesta_binario;
	@FXML private Label lb_respuesta_decimal; 
	@FXML private TextField textField_ingresar_binario;
	@FXML private TextField textField_ingresar_decimal; 
	digitoValidar d = new digitoValidar (); 
	
	@FXML void btnCalcularBinario (ActionEvent event) throws IOException{
		calcBinario calcularBinario = new calcBinario(); 
		if (d.ejecutar(textField_ingresar_decimal.getText(),0)) {
			int datoIn = Integer.parseInt(textField_ingresar_decimal.getText());
			lb_respuesta_binario.setText(calcularBinario.calcular(datoIn)); 
		}else {
			lb_respuesta_binario.setText("Valor Invalido");
			textField_ingresar_decimal.clear();
		}
	}
	
	@FXML void btnCalcularDecimal (ActionEvent event) throws IOException{
		calcDecimal calcDecimal = new calcDecimal(); 
		
		if (d.ejecutar(textField_ingresar_binario.getText(),1)) {
			lb_respuesta_decimal.setText(Integer.toString(calcDecimal.calcular(textField_ingresar_binario.getText())));
		}else {
			lb_respuesta_decimal.setText("Valor Invalido");
			textField_ingresar_binario.clear();
		}
	}


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
