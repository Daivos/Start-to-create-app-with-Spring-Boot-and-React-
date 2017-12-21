package lt.egzaminas.Institucija;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/institucija")
public class InstitucijaControleris {

	@Autowired
	private InstitucijosServisas institucijosServisas;

	@RequestMapping(method = RequestMethod.GET)
	public List<InstitucijaKlientui> atiduoti() {
		return getInstitucijosServisas().gautiVisasInst();
	}
	

	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void create(@RequestBody final InstitucijaKlientui institucijaKlientui) {
		institucijosServisas.irasytiInstitucija(institucijaKlientui);
	}

	/* Apdoros užklausas: DELETE /api/institucija/<institucija> */
	@RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable final Long id) {
		institucijosServisas.istrintiInstitucija(id);
	}

	@RequestMapping(path = "/{id}", method = RequestMethod.PUT)
	@ResponseStatus(HttpStatus.CREATED)
	public void update(@RequestBody final InstitucijaKlientui institucijaKlientui, @PathVariable final Long id) {
		institucijosServisas.atnaujintiInstitucija(institucijaKlientui, id);
	}


	public InstitucijosServisas getInstitucijosServisas() {
		return institucijosServisas;
	}


	public void setInstitucijosServisas(InstitucijosServisas institucijosServisas) {
		this.institucijosServisas = institucijosServisas;
	}




}
