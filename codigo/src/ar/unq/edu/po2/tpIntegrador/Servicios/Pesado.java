package ar.unq.edu.po2.tpIntegrador.Servicios;

public class Pesado implements Servicio {
	
	private Double precio; 
	
	public Pesado(Double precio) {
		this.precio = precio; 
	}

	@Override
	public Double getPrecio() {
		// TODO Auto-generated method stub
		return precio;
	}


}
