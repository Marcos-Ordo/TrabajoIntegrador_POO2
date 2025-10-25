package ar.unq.edu.po2.tpIntegrador.Servicios;

public class LavadoNormal implements Servicio {

	private Double precio; 
	
	public LavadoNormal(Double precio) {
		this.precio = precio; 
	}

	@Override
	public Double getPrecio() {
		return precio;
	}

}
