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
					
					return ik;
				})
				.collect(Collectors.toList());
		return institucijaKlientui;
	}

	

	public void irasytiInstitucija(InstitucijaKlientui institucijaKlientui) {
		Institucija in = new Institucija();
		in.setId(institucijaKlientui.getId());
		in.setInstPavadinimas(institucijaKlientui.getInstPavadinimas());
		institucijaRepository.save(in);
	}

	
	public void istrintiInstitucija(Long id) {
		
		institucijaRepository.delete(id); 
		
	}

	public void atnaujintiInstitucija(InstitucijaKlientui institucijaKlientui, Long id) {
		Institucija ins = institucijaRepository.findOne(id);
		ins.setId(institucijaKlientui.getId());
		ins.setInstPavadinimas(institucijaKlientui.getInstPavadinimas());
		institucijaRepository.save(ins);
	}

	public InstitucijaRepository getInstitucijaRepository() {
		return institucijaRepository;
	}

	public void setProductRepository(InstitucijaRepository institucijaRepository) {
		this.institucijaRepository = institucijaRepository;
	}

}
