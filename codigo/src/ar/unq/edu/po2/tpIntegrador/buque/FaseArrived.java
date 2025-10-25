package ar.unq.edu.po2.tpIntegrador.buque;

public class FaseArrived implements FaseDeBuque {
	
	@Override
	public void actualizar(Buque buque, int distancia, Viaje viaje) {
		
		if(distancia == 0) {
			notificarTerminal(viaje, buque);
		}
	}

	private void notificarTerminal(Viaje viaje, Buque buque) {
		viaje.paradaActual().cambiarElEstadoDe((new FaseWorking()), buque);
	}

}
