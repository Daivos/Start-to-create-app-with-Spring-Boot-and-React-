package lt.egzaminas.Institucija;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Institucija {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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