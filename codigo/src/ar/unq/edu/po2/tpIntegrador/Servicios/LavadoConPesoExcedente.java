package ar.unq.edu.po2.tpIntegrador.Servicios;

public class LavadoConPesoExcedente implements Servicio {
	
private Double precio; 
	
	public LavadoConPesoExcedente(Double precio) {
		this.precio = precio; 
	}

	@Override
	public Double getPrecio() {
		return precio;
	}


}
