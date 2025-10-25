package ar.unq.edu.po2.tpIntegrador.buque;

import java.util.ArrayList;

import ar.unq.edu.po2.tpIntegrador.Containers.Container;
import ar.unq.edu.po2.tpIntegrador.terminal.Terminal;

public class Buque implements Observador {
	String nombre;
	ArrayList <Container> containers;
	FaseDeBuque estado;
	Viaje viajeARealizar;
	
	public Buque(String nombre) {
		this.nombre = nombre;
		containers = new ArrayList<Container>();
	}
	
	protected void setEstado(FaseDeBuque estado) {
		this.estado = estado;
	}
	
	public void addContainer(Container container) {
		containers.add(container);
	}
	
	public void removeContainer(Container container) {
		containers.remove(container);
	}
	
	public Terminal proximaTerminal() {
		// TODO: Cuando se implementen los circuitos cons sus viajes y demás, hay que actualizar éste método con la lógica necesaria.
		// 
		return new Terminal();
	}
	
	@Override
	public void actualizar(int distancia) {
		estado.actualizar(this, distancia);
	}
	
	
}
