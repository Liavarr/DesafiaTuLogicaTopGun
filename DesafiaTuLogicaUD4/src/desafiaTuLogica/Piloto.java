package desafiaTuLogica;

public class Piloto {
	
	//Atributos
	private String idPiloto;
	private int horasVuelo;
	private String rangoPiloto;
	
	//Constructores
	public Piloto() {	
	}
	
	public Piloto(String idPiloto, int horasVuelo, String rangoPiloto) {
		this.idPiloto = idPiloto;
		this.horasVuelo = horasVuelo;
		this.rangoPiloto = rangoPiloto;
	}
	
	//Métodos getter y setter
	
	public String getIdPiloto(){
		return idPiloto;
	}
	
	public int getHorasVuelo(){
		return horasVuelo;
	}
	
	public String getRangoPiloto(){
		return rangoPiloto;
	}
	
	public void setIdPiloto(String idPiloto){
		this.idPiloto = idPiloto;
	}
	
	public void setHorasVuelo(int horasVuelo){
		this.horasVuelo += horasVuelo;
	}

	public void setRangoPiloto(String rangoPiloto){
		this.rangoPiloto = rangoPiloto;
	}
	
	//Método para mostrar todos los datos del piloto:
	public String mostrarPiloto(){
		return "Piloto: " + idPiloto + ", tiene " + horasVuelo + " horas de vuelo y su rango es: " + rangoPiloto;
		}

}
