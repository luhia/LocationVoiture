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

import locationvoiture.model.Carburant;
import locationvoiture.services.CarburantService;


@RestController
@RequestMapping(value="/api/carburants")
@PreAuthorize("permitAll()")
public class CarburantControllerApi {
	
	@Autowired
	private CarburantService cs;
	
	
	@GetMapping(value="/{id})")
	public Carburant findById(@PathVariable("id") long id) {
		return cs.findById(id);
	}
	
	
	
	@GetMapping(value="")
	public List<Carburant> findAll() {
		return cs.findAll();
	}
	
	
	
	@PostMapping(value="")
	public Carburant save(@RequestBody Carburant carburant) {
		return cs.save(carburant);
	}
	
	
	
	@RequestMapping(value="{id}/delete")
	public Carburant deleteCarburant(@PathVariable("id") Long id) {
		return cs.deleteById(id);
	}
	
	
	
}
