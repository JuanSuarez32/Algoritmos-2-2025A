package Parcial2;

public class Tren {
	private String Identificador, TipoCarga;
	private float CapacidadMax, CargaActual;
	public Tren() {
		
	}
	public String getIdentificador() {
		return Identificador;
	}
	public void setIdentificador(String identificador) {
		Identificador = identificador;
	}
	public String getTipoCarga() {
		return TipoCarga;
	}
	public void setTipoCarga(String tipoCarga) {
		TipoCarga = tipoCarga;
	}
	public float getCapacidadMax() {
		return CapacidadMax;
	}
	public void setCapacidadMax(float capacidadMax) {
		CapacidadMax = capacidadMax;
	}
	public float getCargaActual() {
		return CargaActual;
	}
	public void setCargaActual(float cargaActual) {
		CargaActual = cargaActual;
	}
	
}
