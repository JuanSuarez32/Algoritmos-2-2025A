package Parcial2;

public class Bodega {
	private String Ientificador; 
	private String TipoCarga ="alimentos";
	private float CapacidadPeso;
	private int CapacidadTrenes;
	private int CapacidadOcupada;
	public Bodega() {
		
		//System.out.println(TipoCarga);

		
	}
	public String getIentificador() {
		return Ientificador;
	}
	public void setIentificador(String ientificador) {
		Ientificador = ientificador;
	}
	public String getTipoCarga() {
		return TipoCarga;
	}
	public void setTipoCarga(String tipoCarga) {
		TipoCarga = tipoCarga;
	}
	public float getCapacidadPeso() {
		return CapacidadPeso;
	}
	public void setCapacidadPeso(float capacidadPeso) {
		CapacidadPeso = capacidadPeso;
	}
	
	public int getCapacidadOcupada() {
		return CapacidadOcupada;
	}
	public void setCapacidadOcupada(int capacidadOcupada) {
		CapacidadOcupada = capacidadOcupada;
	}
	public int getCapacidadTrenes() {
		return CapacidadTrenes;
	}
	public void setCapacidadTrenes(int capacidadTrenes) {
		if (CapacidadTrenes > CapacidadOcupada) {
			CapacidadTrenes = capacidadTrenes;		
			}

	
	}
}
