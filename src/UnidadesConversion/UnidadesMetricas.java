package UnidadesConversion;
import java.util.ArrayList;

import javax.swing.JOptionPane;
public class UnidadesMetricas extends Unidades{
	 public static ArrayList<String> tiposUnidades = new ArrayList<>();
	
	public UnidadesMetricas() {
		
	}
	public UnidadesMetricas(String unidad1, double valor, String unidad2) {
		super(unidad1,valor,unidad2);
	}
	
	public void setTipoUnidades() {
		tiposUnidades.add("Centimetro");
		tiposUnidades.add("Milimetro");
		tiposUnidades.add("Metro");
		tiposUnidades.add("Pulgada");
		tiposUnidades.add("Kilometro");
		
	}
	
	public void getUnidades() {
		for(int i = 0 ; i < tiposUnidades.size();i++) {
			JOptionPane.showMessageDialog(null,tiposUnidades.get(i));
		}
	}
}
