package lt.egzaminas.Institucija;

public class InstitucijaKlientui {
	

	private Long id;
	private String instPavadinimas;
	private String miestas;
	private String nuotrauka;
	private String kategorija;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getInstPavadinimas() {
		return instPavadinimas;
	}
	public void setInstPavadinimas(String instPavadinimas) {
		this.instPavadinimas = instPavadinimas;
	}
	public String getMiestas() {
		return miestas;
	}
	public void setMiestas(String miestas) {
		miestas = miestas;
	}
	public String getNuotrauka() {
		return nuotrauka;
	}
	public void setNuotrauka(String nuotrauka) {
		this.nuotrauka = nuotrauka;
	}
	public String getKategorija() {
		return kategorija;
	}
	public void setKategorija(String kategorija) {
		this.kategorija = kategorija;
	}
}
	
	