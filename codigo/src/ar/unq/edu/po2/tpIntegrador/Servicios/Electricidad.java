package ar.unq.edu.po2.tpIntegrador.Servicios;

public class Electricidad implements Servicio {
	
	private Double precio; 
	
	public Electricidad(Double precio) {
		this.precio = precio; 
	}

	@Override
	public Double getPrecio() {
		// TODO Auto-generated method stub
		return precio;
	}

}
