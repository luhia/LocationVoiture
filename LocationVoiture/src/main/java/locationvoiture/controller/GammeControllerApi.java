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

import locationvoiture.model.Gamme;
import locationvoiture.services.GammeService;

@RestController
@RequestMapping(value="/api/gammes")
@PreAuthorize("permitAll()")
public class GammeControllerApi {
	
	@Autowired
	private GammeService gs;
	
	
	@GetMapping(value="/{id})")
	public Gamme findById(@PathVariable("id") long id) {
		return gs.findById(id);
	}
	
	
	
	@GetMapping(value="")
	public List<Gamme> findAll() {
		return gs.findAll();
	}
	
	
	
	@PostMapping(value="")
	public Gamme save(@RequestBody Gamme gamme) {
		return gs.save(gamme);
	}
	
	
	
	@RequestMapping(value="{id}/delete")
	public Gamme deleteGamme(@PathVariable("id") Long id) {
		return gs.deleteById(id);
	}
	
	

}
