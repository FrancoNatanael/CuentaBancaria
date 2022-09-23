package unlam.edu.pb2.ar;

public class CuentaSueldo extends Cuenta{
	
	public CuentaSueldo() {
		super();
		}
	
	@Override
	public void extraer(Double cantidadExtraer) {
		if(super.getSaldo() >= cantidadExtraer) {
			super.extraer(cantidadExtraer);			
		}
	}
}
