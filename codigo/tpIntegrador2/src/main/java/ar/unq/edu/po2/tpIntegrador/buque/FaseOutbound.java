package ar.unq.edu.po2.tpIntegrador.buque;

public class FaseOutbound implements FaseDeBuque {

	@Override
	public void actualizar(Buque buque, int distancia, Viaje viaje) {
		// TODO Auto-generated method stub
		if (distancia < 50) {
			buque.setEstado(new FaseInbound());
		}
	}
}
