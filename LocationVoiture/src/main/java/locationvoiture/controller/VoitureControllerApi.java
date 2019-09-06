package locationvoiture.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import locationvoiture.model.Voiture;
import locationvoiture.services.VoitureService;

@RestController
@RequestMapping(value="/api/voitures")
@PreAuthorize("permitAll()")
public class VoitureControllerApi {
	
	@Autowired
	private VoitureService vs;
	
	@GetMapping(value="/{id})")
	public Voiture findById(@PathVariable("id") long id) {
		return vs.findById(id);
	}
	
	
	
	@GetMapping(value="")
	public List<Voiture> findAll() {
		return vs.findAll();
	}
	
	
	
	@PostMapping(value="")
	public Voiture save(@RequestBody Voiture voiture) {
		return vs.save(voiture);
	}
	
	
	
	@RequestMapping(value="{id}/delete")
	public Voiture deleteVoiture(@PathVariable("id") Long id) {
		return vs.deleteById(id);
	}
	
}
