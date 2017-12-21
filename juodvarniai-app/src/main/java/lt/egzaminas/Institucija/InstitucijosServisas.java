package lt.egzaminas.Institucija;

import java.util.List;
import java.util.stream.Collectors;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Transactional
@Service
public class InstitucijosServisas {

	@Autowired
	private InstitucijaRepository institucijaRepository;
	
	public List<InstitucijaKlientui> gautiVisasInst() {
		List<Institucija> instIsDuomenuBazes = getInstitucijaRepository().findAll();
		// Institucija -> InstitucijaKlientui
		List<InstitucijaKlientui> institucijaKlientui = 
				instIsDuomenuBazes
				.stream()
				.map((institucija) -> {
					InstitucijaKlientui ik = new InstitucijaKlientui();
					ik.setId(institucija.getId());
					ik.setInstPavadinimas(institucija.getInstPavadinimas());
					ik.setKategorija(institucija.getKategorija());
					ik.setMiestas(institucija.getMiestas());
					ik.setNuotrauka(institucija.getNuotrauka());
					return ik;
				})
				.collect(Collectors.toList());
		return institucijaKlientui;
	}

	

	public void irasytiInstitucija(InstitucijaKlientui institucijaKlientui) {
		Institucija in = new Institucija();
		in.setId(institucijaKlientui.getId());
		in.setInstPavadinimas(institucijaKlientui.getInstPavadinimas());
		in.setKategorija(institucijaKlientui.getKategorija());
		in.setMiestas(institucijaKlientui.getMiestas());
		in.setNuotrauka(institucijaKlientui.getNuotrauka());
		institucijaRepository.save(in);
	}

	
	public void istrintiInstitucija(Long id) {
		
		institucijaRepository.delete(id); 
		
	}

	public void atnaujintiInstitucija(InstitucijaKlientui institucijaKlientui, Long id) {
		Institucija ins = institucijaRepository.findOne(id);
		ins.setId(institucijaKlientui.getId());
		ins.setInstPavadinimas(institucijaKlientui.getInstPavadinimas());
		ins.setKategorija(institucijaKlientui.getKategorija());
		ins.setMiestas(institucijaKlientui.getMiestas());
		ins.setNuotrauka(institucijaKlientui.getNuotrauka());
		institucijaRepository.save(ins);
	}

	public InstitucijaRepository getInstitucijaRepository() {
		return institucijaRepository;
	}

	public void setProductRepository(InstitucijaRepository institucijaRepository) {
		this.institucijaRepository = institucijaRepository;
	}

}
