package ar.unq.edu.po2.tpIntegrador.buque;

public class FaseDeparting implements FaseDeBuque {
	@Override
	public void actualizar(Buque buque, int distancia, Viaje viaje) {
		if(distancia > 1) {
			buque.setEstado(new FaseOutbound());
			notificarTerminal(viaje);
		}
	}

	private void notificarTerminal(Viaje viaje) {
		viaje.paradaActual().enviarMailAShipper();
		viaje.paradaActual().enviarFacturacion();
	}
}
