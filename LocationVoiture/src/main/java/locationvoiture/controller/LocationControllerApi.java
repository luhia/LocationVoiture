package locationvoiture.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import locationvoiture.services.LocationService;

@RestController
@RequestMapping(value="/api/locations")
@PreAuthorize("permitAll()")
public class LocationControllerApi {
	
	@Autowired
	private LocationService ls;

}
