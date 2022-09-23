package unlam.edu.pb2.ar;

import java.util.ArrayList;

public class CajaAhorro extends Cuenta{

	private ArrayList<Integer> contadorExtracciones = new ArrayList<Integer>();;
	
	public CajaAhorro() {
		super();
	}
	@Override
	public void extraer(Double monto) {
		contadorExtracciones.add(1);
		
		if(contadorExtracciones.size()>=5) {
			super.extraer(monto + 6);
		}
		else {
			super.extraer(monto);
		}
		
	}
	
}
