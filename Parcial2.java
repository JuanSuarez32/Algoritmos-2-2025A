package Parcial2;

public class Parcial2 {
	public static void main(String[] args) {
	
		Tren Tren1 = new Tren();
		Tren Tren2 = new Tren();

		Bodega Bodega1 = new Bodega ();
		
		//String Bodegas[] = new String[9]; (en caso de utilizar las 10 bodegas)
		
		Tren1.setIdentificador("123");
		Tren1.setTipoCarga("Alimentos");
		Tren1.setCapacidadMax(20);
		Tren1.setCargaActual(10);
			
		/*Tren2.setIdentificador("123");
		Tren2.setTipoCarga("Alimentos");
		Tren2.setCapacidadMax(15);
		Tren2.setCargaActual(11);*/
		
		Bodega1.setCapacidadPeso(100);
		Bodega1.setCapacidadTrenes(5);
		Bodega1.setIentificador("Bodega1");
		Bodega1.setTipoCarga("Alimentos");
		Bodega1.setCapacidadOcupada(2);
		
		System.out.println("Se acabó de crear el siguiente Tren " + Tren1.getIdentificador() + ", que contiene " + Tren1.getTipoCarga() + " y contiene actualmente "+ Tren1.getCargaActual() +" Toneladas ");

		/*if ((Tren1.getTipoCarga() == Bodega1.getTipoCarga()) && (Bodega1.getCapacidadOcupada() < 5)) {
			Bodega1.setCapacidadOcupada(1);
			System.out.println("El tren ha sido almacenado correctamente en la " + Bodega1.getIentificador() + "");
		}
		else System.out.println("El tren no contiene el mismo tipo de carga que se almacena en la " + Bodega1.getIentificador() + "");*/
		if (Tren1.getTipoCarga() == Bodega1.getTipoCarga()){
			if (Bodega1.getCapacidadOcupada() < 5) {
				System.out.println("El tren ha sido almacenado correctamente en la " + Bodega1.getIentificador() + "");
			}else System.out.println("El tren no se ha almacenadao debido a que la " + Bodega1.getIentificador() + " Ha alcanzado su capacidad maxima");
		}
		else  System.out.println("El tren no contiene el mismo tipo de carga que se almacena en la " + Bodega1.getIentificador() + "");	

	}
}
