package locationvoiture.controller;

import java.util.List;

import javax.tools.DocumentationTool.Location;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import locationvoiture.services.LocationService;
import locationvoiture.model.Location;



@RestController
@RequestMapping(value="/api/locations")
@PreAuthorize("permitAll()")
public class LocationControllerApi {
	
		@Autowired
		private LocationService ls;
		
		
		@GetMapping(value="/{id})")
		public Location findById(@PathVariable("id") long id) {
			return ls.findById(id);
		}
		
		
		
		@GetMapping(value="")
		public List<Location> findAll() {
			return ls.findAll();
		}
		
		
		
		@PostMapping(value="")
		public Location save(@RequestBody Location location) {
			return ls.save(location);
		}
		
		
		
		@RequestMapping(value="{id}/delete")
		public Location deleteLocation(@PathVariable("id") Long id) {
			return ls.deleteById(id);
		}
	
	

}