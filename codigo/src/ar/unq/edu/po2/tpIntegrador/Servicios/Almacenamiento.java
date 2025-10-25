package ar.unq.edu.po2.tpIntegrador.Servicios;

public class Almacenamiento implements Servicio{

	private Double precio; 
	
	public Almacenamiento(Double precio) {
		this.precio = precio; 
	}

	@Override
	public Double getPrecio() {
		// TODO Auto-generated method stub
		return precio;
	}
}
