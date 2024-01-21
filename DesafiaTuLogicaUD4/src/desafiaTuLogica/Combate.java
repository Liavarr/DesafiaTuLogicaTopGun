package desafiaTuLogica;

public class Combate extends Avion{
	protected boolean esFurtivo;
	
	public Combate() {
		
	}
	
	public Combate(String idAvion, int capAvion, Piloto piloto, boolean esFurtivo) {
		super(idAvion, capAvion, piloto);
		this.esFurtivo = esFurtivo;
	}

	public boolean getEsFurtivo() {
		return esFurtivo;
	}

	public void setEsFurtivo(boolean esFurtivo) {
		this.esFurtivo = esFurtivo;
	}
	
	public String mostrarAvionCombate() {
		if (this.esFurtivo) {
			return "Modelo de avion: "+ idAvion +", tiene una capacidad de "+capAvion+" asiento/s, su piloto es: "+piloto.getIdPiloto()+" y tiene modo furtivo";
		} else {
			return "Modelo de avion: "+ idAvion +", tiene una capacidad de "+capAvion+" asiento/s, su piloto es: "+piloto.getIdPiloto()+" y no tiene modo furtivo";
		}	
	}
}
