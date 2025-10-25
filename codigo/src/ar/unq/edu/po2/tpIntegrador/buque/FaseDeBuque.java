package ar.unq.edu.po2.tpIntegrador.buque;

public interface FaseDeBuque {

	public void actualizar(Buque buque, int distancia);
	
	public void notificarTerminal(Buque buque);
}
