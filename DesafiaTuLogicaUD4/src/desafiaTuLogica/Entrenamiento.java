package desafiaTuLogica;

public class Entrenamiento extends Avion{
	//Atributos
	protected boolean tieneDobleMando;
	
	//Constructores
	public Entrenamiento() {
		
	}
	
	public Entrenamiento (String idAvion, int capAvion, Piloto piloto, boolean tieneDobleMando) {
		super(idAvion, capAvion, piloto);
		this.tieneDobleMando = tieneDobleMando;
	}

	
	//Getter y Setters
	public boolean getTieneDobleMando() {
		return tieneDobleMando;
	}

	public void setTieneDobleMando(boolean tieneDobleMando) {
		this.tieneDobleMando = tieneDobleMando;
	}
	
	public String mostrarAvionEntrenamiento() {
		if (tieneDobleMando) {
			return "Modelo de avion: "+ idAvion +", tiene una capacidad de "+capAvion+" asiento/s, su piloto es: "+piloto.getIdPiloto()+" y tiene doble mando";
		} else {
			return "Modelo de avion: "+ idAvion +", tiene una capacidad de "+capAvion+" asiento/s, su piloto es: "+piloto.getIdPiloto()+" y no tiene doble mando";
		}	
	}
}
