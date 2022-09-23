package ar.edu.unlam.pb2.CuentaBancaria;

import static org.junit.Assert.*;
import org.junit.Test;

import unlam.edu.pb2.ar.CajaAhorro;
import unlam.edu.pb2.ar.CuentaSueldo;
public class testsCuenta {

	@Test
	public void deberiaCrearCuentaSueldo() {
		CuentaSueldo cuenta = new CuentaSueldo();
		
		assertNotNull(cuenta);
	}
	@Test
	public void deberiaExtraerSaldo() {
		CuentaSueldo cuenta = new CuentaSueldo();
		cuenta.depositar(1500.0);
		cuenta.extraer(1000.0);
		Double s = 500.0;
		assertEquals(s,cuenta.getSaldo());
	}
	@Test
	public void siNoTengoSaldoSuficienteNodeberiaExtraerSaldo() {
		CuentaSueldo cuenta = new CuentaSueldo();
		cuenta.depositar(1500.0);
		cuenta.extraer(2000.0);
		Double s = 1500.0;
		assertEquals(s,cuenta.getSaldo());
	}
	@Test
	public void deberiaExtraerSaldoCajaDeAhorro() {
		CajaAhorro cuenta = new CajaAhorro();
		cuenta.depositar(1000.0);
		cuenta.extraer(500.0);
		Double s = 500.0;
		assertEquals(s,cuenta.getSaldo());
	}
	@Test
	public void deberiaRestarleCostoAdicionalDespuesDeLaQuintaExtraccionCajaAhorro() {
		CajaAhorro cuenta = new CajaAhorro();
		cuenta.depositar(6000.0);
		cuenta.extraer(1000.0);
		cuenta.extraer(1000.0);
		cuenta.extraer(1000.0);
		cuenta.extraer(1000.0);
		cuenta.extraer(1000.0);
		cuenta.extraer(100.0);
		Double s = 888.0;
		assertEquals(s,cuenta.getSaldo());
	}
}
