package desafiaTuLogica;

public class Avion {
	
	//Atributos
	protected String idAvion;
	protected int capAvion;
	Piloto piloto;
	
	//Constructores
	public Avion() {
		
	}
	
	public Avion(String idAvion, int capAvion, Piloto piloto) {
		this.idAvion = idAvion;
		this.capAvion = capAvion;
		this.piloto = piloto;
	}
	
	//Getters y Setters
	public String getIdAvion() {
		return idAvion;
	}
	
	public int getCapAvion() {
		return capAvion;
	}
	
	public String getPiloto(Piloto piloto) {
		return "El piloto de este avion es: "+ piloto.getIdPiloto();
	}
	
	public void setIdAvion(String idAvion) {
		this.idAvion = idAvion;
	}
	
	public void setCapAvion(int capAvion) {
		this.capAvion = capAvion;
	}
	
	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}
	
	//Mostrar avion y piloto
	
	public String mostrarAvion(){
		return "El avion " + idAvion + " tiene " + capAvion +" asientos y su piloto es: "+ piloto.getIdPiloto();
	}
}
