package locationvoiture.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import locationvoiture.services.CarburantService;


@RestController
@RequestMapping(value="/api/carburants")
@PreAuthorize("permitAll()")
public class CarburantControllerApi {
	
	@Autowired
	private CarburantService cs;
	
	
	
}
