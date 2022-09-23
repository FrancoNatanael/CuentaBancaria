package unlam.edu.pb2.ar;

public class Cuenta {
	private Double saldo;
	
	public Cuenta() {
		this.saldo = 0.0;
	}
	
	protected void extraer(Double valor) {
		saldo = saldo - valor;
	}
	
	public Double getSaldo() {
		return saldo;
	}


	public void depositar(Double valor) {
		saldo = saldo + valor;
	}
}
